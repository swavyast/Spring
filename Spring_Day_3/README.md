###### ________________________________________________________________________________________________________________
# _______ Spring IOC(Inversion of Control _______
###### ________________________________________________________________________________________________________________
## ____________ Usecases of @Autowired annotation. ____________
###### ________________________________________________________________________________________________________________
### ___________________________________ BYTYPE ___________________________________
#### _______________________________________ (default approach) _______________________________________
# ____________ Runtime Environment : jre20 _____
###### ________________________________________________________________________________________________________________
####  ++++++++++++++++++ when it's attribute 'required' = true ++++++++++++++++++
###### ________________________________________________________________________________________________________________
### CaseOne :
* @Autowired(required = true)
* @Bean of Type ClassOne(no name)
* @Bean of Type ClassTwo(no name)
### Output:
* Default constructor in ClassTwo(Order of constructor call remains same)
* Default constructor in ClassOne
* Spring container is ready

### CaseTwo :
 * @Autowired(required = true)
 * @Bean("one") of Type ClassOne
 * @Bean("two") of Type ClassTwo
### Output:
* Default constructor in ClassTwo(Order of constructor call may swap)
* Default constructor in ClassOne
* Spring container is ready

### CaseThree :			                              
 * @Autowired(required = true)	              
 * @Bean of Type ClassOne		                  
 * @Bean("changed") of Type ClassTwo	        

### Output:
* Default constructor in ClassTwo(Order of constructor call may swap)
* Default constructor in ClassOne
* Spring container is ready

### CaseFour :				                            
 * @Autowired(required = true)	               
 * @Bean of Type ClassOne		                   
 * @Bean of Type ClassTwo		                   
 * @Bean of Type ClassTwo		                   
 
### Output:
* 1.
* Default constructor in ClassOne
* Unsatisfied dependency expressed through field 'two'
* NoUniqueBeanDefinitionException:
* expected single matching bean but found 2:
* getClassTwo_One,getClassTwo_Two
* 2.
* Default constructor in ClassTwo
* getClassTwo_One() bean
* Default constructor in ClassOne
* then the above error log.
* 3.
* Default constructor in ClassTwo
* getClassTwo_One() bean(Order of constructor call may swap)
* Default constructor in ClassTwo
* getClassTwo_Two() bean(Order of constructor call may swap)
* Default constructor in ClassOne
* Then the above error log.
* 4.
* Default constructor in ClassTwo
* getClassTwo_Two() bean
* Default constructor in ClassOne
* Then the above error log.

### CaseFive :				                            
 * @Autowired(required = true)	              
 * @Bean of Type ClassOne		                  
 *  No bean of Type ClassTwo		              

 ### Output:
 * Default constructor in ClassOne
 * Unsatisfied dependency expressed through field 'two'
 * NoSuchBeanDefinitionException:
 * expected at least 1 bean which qualifies as autowire candidate.
 * Dependency annotations: {}

### CaseSix :				                              
 * @Autowired(required = true)	              
 * @Bean of Type ClassOne		                  
 * @Bean("two") of Type ClassTwo	            
 * @Bean of Type ClassTwo		                  
 
 ### Output:
 * Default constructor in ClassTwo(Order of constructor call may swap)
 * getClassTwo_One() bean
 * Default constructor in ClassOne(Order of constructor call may swap)
 * Default constructor in ClassTwo(Order of constructor call may swap)
 * getClassTwo_Two() bean
 * Spring container is ready

### CaseSeven :			                              
 * @Autowired(required = true)	               
 * @Bean of Type ClassOne		                  
 * @Bean("changed") of Type ClassTwo	        
 * @Bean of Type ClassTwo		                  
 
 ### Output:
 * 1.
 * Default constructor in ClassOne
 * Unsatisfied dependency expressed through field 'two';
 * NoUniqueBeanDefinitionException:
 * expected single matching bean but found 2:
 * changed,getClassTwo_One
 * 2.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: 
 * changed,getClassTwo_One
 * 3.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: 
 * changed,getClassTwo_One
 * 4.
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: 
 * changed,getClassTwo_One

### CaseEight :				                            
 * @Autowired(required = true)
 * @Bean of Type ClassOne
 * @Bean("changed") of Type ClassTwo
 * @Bean("bothChange") of Type ClassTwo

### Output:
 * 1.
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: changed,bothChanged
 * 2.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: bothChanged, changed
 * 3.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: bothChanged, changed
 * 4.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: bothChanged, changed
 * 5.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2: changed, bothChanged

### CaseNine :				                            
 * @Autowired(required = true)
 * @Bean of Type ClassOne
 * @Bean("classTwo") of Type ClassTwo
 * @Bean("two") of Type ClassTwo

### Output:
 * 1.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Spring Container is ready
 * 2.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Spring Container is ready
 * 3.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 4.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 5.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Spring Container is ready

### CaseTen :
 * @Autowired(required = true)
 * @Bean of Type ClassOne
 * @Bean("two") of Type ClassTwo
 * @Bean("two") of Type ClassTwo
	(same name as field name)

### Output:
 * 1.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Spring Container is ready
 * 2.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Spring Container is ready
 * 3.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 4.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 
###### ________________________________________________________________________________________________________________
#### ++++++++++++++++++ when it's attribute 'required' = false ++++++++++++++++++
###### ________________________________________________________________________________________________________________

### CaseEleven :
 * @Autowired(required = false)
 * @Bean of Type ClassOne
 * No Bean of Type ClassTwo
 
 ### Output:
 * 1.
 * Default constructor in ClassOne
 * Spring Container is ready
 * (No Error, No Exception)

### CaseTwelve :
 * @Autowired(required = false)
 * @Bean of Type ClassOne
 * @Bean of Type ClassTwo(No Name)

### Output:
 * 1.
 * Default constructor in ClassTwo
 * getClassTwo() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 2.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo() bean
 * Spring Container is ready

### CaseThirteen :
 * @Autowired(required = false)
 * @Bean of Type ClassOne
 * @Bean("differentName") of Type ClassTwo
 
 ### Output:(No Change in Output)
 * 1.
 * Default constructor in ClassTwo
 * getClassTwo() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 2.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo() bean
 * Spring Container is ready
 
 ### CaseFourteen :
 * @Autowired(required = false)
 * @Bean of Type ClassOne
 * @Bean("two") of Type ClassTwo
	(Same name as field name)
### Output:(No Change in Output)
 * 1.
 * Default constructor in ClassTwo
 * getClassTwo() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 2.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_() bean
 * Spring Container is ready

### CaseFifteen :
 * @Autowired(required = false)
 * @Bean of Type ClassOne
 * @Bean of Type ClassTwo
 * @Bean of Type ClassTwo
 
 ### Output:
 * 1.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2:
 * getClassTwo_One,getClassTwo_Two
 * 2.
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2:
 * getClassTwo_One,getClassTwo_Two
 * 3.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2:
 * getClassTwo_Two, getClassTwo_One
 * 4.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected single matching bean but found 2:
 * getClassTwo_Two, getClassTwo_One

### CaseSixteen :
 * @Autowired(required = false
 * @Bean of Type ClassOne
 * @Bean of Type ClassTwo
 * @Bean("someName") of Type ClassTwo

### Output:
 * 1.Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 2.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Spring Container is ready
 * 3.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Spring Container is ready
 * 4.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 5.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Spring Container is ready

### CaseSeventeen :
 * @Autowired(required = false)
 * @Bean of Type ClassOne
 * @Bean("someName") of Type ClassTwo
 * @Bean("someName") of Type ClassTwo
 
 ### Output:
 * 1.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 2.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Spring Container is ready
 * 3.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 4.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Spring Container is ready

### CaseEighteen :
 * @Autowired(required = false)
 * @Bean of Type ClassOne
 * @Bean("two") of Type ClassTwo
 * @Bean("two") of Type ClassTwo	
### Output:
 * 1.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 2.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Spring Container is ready
 * 3.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 4.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Spring Container is ready

### CaseNinteen :
 * @Autowired(required = false)
 * @Bean of Type ClassOne
 * @Bean("someName") of Type ClassTwo
 * @Bean("two") of Type ClassTwo
 ### Output:
  * 1.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 2.
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Spring Container is ready
 * 3.
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Spring Container is ready
 * 4. 
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Spring Container is ready
 * 5.
 * Default constructor in ClassTwo
 * getClassTwo_Two() bean
 * Default constructor in ClassOne
 * Default constructor in ClassTwo
 * getClassTwo_One() bean
 * Spring Container is ready
###### ________________________________________________________________________________________________________________
## Cases With Errors
###### ________________________________________________________________________________________________________________
### caseFour
* @Autowired(required = true)
* @Bean of Type ClassOne
* @Bean of Type ClassTwo
* @Bean of Type ClassTwo

### caseFive
* @Autowired(required = true)	              
* @Bean of Type ClassOne
* No bean of Type ClassTwo

### caseSeven
* @Autowired(required = true)	               
* @Bean of Type ClassOne
* @Bean("changed") of Type ClassTwo
* @Bean of Type ClassTwo

### caseEight
* @Autowired(required = true)
* @Bean of Type ClassOne
* @Bean("changed") of Type ClassTwo
* @Bean("bothChange") of Type ClassTwo

### caseFifteen
* @Autowired(required = false)
* @Bean of Type ClassOne
* @Bean of Type ClassTwo
* @Bean of Type ClassTwo
