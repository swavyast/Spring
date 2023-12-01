==============================================================================================================================================================================
Spring IOC(Inversion of Control)
==============================================================================================================================================================================
Usecases of @Autowired annotation.
ByType(default approach)
==============================================================================================================================================================================
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
| when it's attribute 'required' = true  |
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

CaseOne :				                              Output:
 * @Autowired(required = true)	              Default constructor in ClassTwo(Order of constructor call remains same)
 * @Bean of Type ClassOne(no name)	          Default constructor in ClassOne
 * @Bean of Type ClassTwo(no name)	          Spring container is ready

CaseTwo :				                              Output:
 * @Autowired(required = true)	              Default constructor in ClassTwo(Order of constructor call may swap)
 * @Bean("one") of Type ClassOne	            Default constructor in ClassOne
 * @Bean("two") of Type ClassTwo	            Spring container is ready

CaseThree :			                              Output:
 * @Autowired(required = true)	              Default constructor in ClassTwo(Order of constructor call may swap)
 * @Bean of Type ClassOne		                  Default constructor in ClassOne
 * @Bean("changed") of Type ClassTwo	        Spring container is ready

CaseFour :				                            Output:
 * @Autowired(required = true)	               1.
 * @Bean of Type ClassOne		                   Default constructor in ClassOne
 * @Bean of Type ClassTwo		                   Unsatisfied dependency expressed through field 'two';
 * @Bean of Type ClassTwo		                   NoUniqueBeanDefinitionException:
			                                         expected single matching bean but found 2:
			                                         getClassTwo_One,getClassTwo_Two
				                                       2.
				                                       Default constructor in ClassTwo
				                                       getClassTwo_One() bean
			                                         Default constructor in ClassOne
				                                       then the above error log.
                                        				3.
                                        				Default constructor in ClassTwo
                                        				getClassTwo_One() bean(Order of constructor call may swap)
                                        				Default constructor in ClassTwo
                                        				getClassTwo_Two() bean(Order of constructor call may swap)
                                        				Default constructor in ClassOne
                                        				Then the above error log.
                                        				4.
                                        				Default constructor in ClassTwo
                                        				getClassTwo_Two() bean
                                        				Default constructor in ClassOne
                                        				Then the above error log.

CaseFive :				                            Output:
 * @Autowired(required = true)	              Default constructor in ClassOne
 * @Bean of Type ClassOne		                  Unsatisfied dependency expressed through field 'two';
 *  No bean of Type ClassTwo		              NoSuchBeanDefinitionException:
                                      				expected at least 1 bean which qualifies as autowire candidate.
                                      				Dependency annotations: {}

CaseSix :				                              Output:
 * @Autowired(required = true)	              Default constructor in ClassTwo(Order of constructor call may swap)
 * @Bean of Type ClassOne		                  getClassTwo_One() bean
 * @Bean("two") of Type ClassTwo	            Default constructor in ClassOne(Order of constructor call may swap)
 * @Bean of Type ClassTwo		                  Default constructor in ClassTwo(Order of constructor call may swap)
                                      				getClassTwo_Two() bean
                                      				Spring container is ready

CaseSeven :			                              Output:
 * @Autowired(required = true)	               1.
 * @Bean of Type ClassOne		                  Default constructor in ClassOne
 * @Bean("changed") of Type ClassTwo	        Unsatisfied dependency expressed through field 'two';
 * @Bean of Type ClassTwo		                  NoUniqueBeanDefinitionException:
                                      				expected single matching bean but found 2:
                                      				changed,getClassTwo_One
                                      				2.		
                                      				Default constructor in ClassTwo
                                      				getClassTwo_Two() bean
                                      				Default constructor in ClassOne
                                      				Then the above error log.
                                      				3.
                                      				Default constructor in ClassTwo
                                      				getClassTwo_Two() bean
                                      				Default constructor in ClassTwo
                                      				getClassTwo_One() bean
                                      				Default constructor in ClassOne
                                      				Then the above error log.
                                      				4.		
                                      				Default constructor in ClassTwo
                                      				getClassTwo_One() bean
                                      				Default constructor in ClassOne
                                      				Then the above error log.

CaseEight :				                            Output:
 * @Autowired(required = true)		            1.
 * @Bean of Type ClassOne	                    Default constructor in ClassOne
 * @Bean("changed") of Type ClassTwo	        Unsatisfied dependency expressed through field 'two';
 * @Bean("bothChange") of Type ClassTwo       NoUniqueBeanDefinitionException:
                                              expected single matching bean but found 2: changed,bothChanged
                                    					2.
                                    					Default constructor in ClassTwo
                                    					getClassTwo_Two() bean
                                    					Default constructor in ClassOne
                                    					Then the error log as above.
                                    					3.
                                    					Default constructor in ClassTwo
                                    					getClassTwo_Two() bean
                                    					Default constructor in ClassTwo
                                    					getClassTwo_One() bean
                                    					Default constructor in ClassOne
                                    					Then the error log as above.
                                    					4.
                                    					Default constructor in ClassTwo
                                    					getClassTwo_One() bean
                                    					Default constructor in ClassOne
                                    					Then the error log as above.
                                    					5.
                                    					Default constructor in ClassTwo
                                    					getClassTwo_One() bean
                                    					Default constructor in ClassTwo
                                    					getClassTwo_Two() bean
                                    					Default constructor in ClassOne
                                    					Then the error log as above.
CaseNine :				                            Output:
 * @Autowired(required = true)		            1.
 * @Bean of Type ClassOne			                Default constructor in ClassOne
 * @Bean("classTwo") of Type ClassTwo		      Default constructor in ClassTwo	
 * @Bean("two") of Type ClassTwo		          getClassTwo_Two() bean
                                    					Default constructor in ClassTwo	
                                    					getClassTwo_One() bean	
                                    					Spring Container is ready
                                    					2.
                                    					Default constructor in ClassTwo
                                    					getClassTwo_One() bean
                                    					Default constructor in ClassOne
                                    					Default constructor in ClassTwo
                                    					getClassTwo_Two() bean
                                    					Spring Container is ready
                                    					3.
                                    					Default constructor in ClassTwo
                                    					getClassTwo_One() bean
                                    					Default constructor in ClassTwo
                                    					getClassTwo_Two() bean
                                    					Default constructor in ClassOne
                                    					Spring Container is ready
                                    					4.
                                    					Default constructor in ClassTwo
                                    					getClassTwo_Two() bean
                                    					Default constructor in ClassTwo
                                    					getClassTwo_One() bean
                                    					Default constructor in ClassOne
                                    					Spring Container is ready
                                    					5.
                                    					Default constructor in ClassTwo
                                    					getClassTwo_Two() bean
                                    					Default constructor in ClassOne
                                    					Default constructor in ClassTwo
                                    					getClassTwo_One() bean
                                    					Spring Container is ready

CaseTen :					                            Output:
 * @Autowired(required = true)	            	1.
 * @Bean of Type ClassOne			                Default constructor in ClassOne
 * @Bean("two") of Type ClassTwo	          	Default constructor in ClassTwo
 * @Bean("two") of Type ClassTwo		          getClassTwo_Two() bean
	(same name as field name)		                Spring Container is ready
                                    					2.
                                    					Default constructor in ClassOne
                                    					Default constructor in ClassTwo
                                    					getClassTwo_One() bean
                                    					Spring Container is ready
                                    					3.
                                    					Default constructor in ClassTwo
                                    					getClassTwo_One() bean
                                    					Default constructor in ClassOne
                                    					Spring Container is ready
                                    					4.
                                    					Default constructor in ClassTwo
                                    					getClassTwo_Two() bean
                                    					Default constructor in ClassOne
                                    					Spring Container is ready
+++++++++++++++++++++++++
| when it's attribute 'required' = false |
+++++++++++++++++++++++++

CaseEleven :				Output:
 * @Autowired(required = false)		Default constructor in ClassOne
 * @Bean of Type ClassOne			Spring Container is ready
 * No Bean of Type ClassTwo			(No Error, No Exception)

CaseTwelve :				Output:
 * @Autowired(required = false)		1.
 * @Bean of Type ClassOne			Default constructor in ClassTwo
 * @Bean of Type ClassTwo(No Name)		getClassTwo() bean
					Default constructor in ClassOne
					Spring Container is ready
					2.
					Default constructor in ClassOne
					Default constructor in ClassTwo
					getClassTwo() bean
					Spring Container is ready

CaseThirteen :				Output:(No Change in Output)
 * @Autowired(required = false)		1.
 * @Bean of Type ClassOne			Default constructor in ClassTwo
 * @Bean("differentName") of Type ClassTwo	getClassTwo() bean
					Default constructor in ClassOne
					Spring Container is ready
					2.
					Default constructor in ClassOne
					Default constructor in ClassTwo
					getClassTwo() bean
					Spring Container is ready

CaseFourteen :				Output:(No Change in Output)
 * @Autowired(required = false)		1.
 * @Bean of Type ClassOne			Default constructor in ClassTwo
 * @Bean("two") of Type ClassTwo		getClassTwo() bean
	(Same name as field name)		Default constructor in ClassOne
					Spring Container is ready
					2.
					Default constructor in ClassOne
					Default constructor in ClassTwo
					getClassTwo() bean
					Spring Container is ready

CaseFifteen :				Output:
 * @Autowired(required = false)		1.
 * @Bean of Type ClassOne			Default constructor in ClassTwo		
 * @Bean of Type ClassTwo			getClassTwo_One() bean
 * @Bean of Type ClassTwo			Default constructor in ClassOne
					Unsatisfied dependency expressed through field 'two'
					NoUniqueBeanDefinitionException:
					expected single matching bean but found 2:getClassTwo_One,getClassTwo_Two
					2.
					Default constructor in ClassOne
					Then error log as above.
					3.
					Default constructor in ClassTwo
					getClassTwo_Two() bean
					Default constructor in ClassOne
					Then error log as above.
					4.
					Default constructor in ClassTwo
					getClassTwo_One() bean
					Default constructor in ClassTwo
					getClassTwo_Two() bean
					Default constructor in ClassOne
					Then error log as above.
CaseSixteen :				Output:
 * @Autowired(required = false)		Remains same as caseFifteen.
 * @Bean of Type ClassOne
 * @Bean of Type ClassTwo
 * @Bean("someName") of Type ClassTwo

CaseSeventeen :				Output:
 * @Autowired(required = false)		1.Default constructor in ClassTwo
 * @Bean of Type ClassOne			getClassTwo_Two() bean
 * @Bean("someName") of Type ClassTwo	Default constructor in ClassOne
 * @Bean("someName") of Type ClassTwo	Spring Container is ready
					 * 2.
					Default constructor in ClassOne
					Default constructor in ClassTwo
					getClassTwo_Two() bean
					Spring Container is ready
					3.
					Default constructor in ClassTwo
					getClassTwo_One() bean
					Default constructor in ClassOne
					Spring Container is ready
					4.
					Default constructor in ClassOne
					Default constructor in ClassTwo
					getClassTwo_One() bean
					Spring Container is ready

CaseEighteen :				Output:
 * @Autowired(required = false)		Remains same as caseSeventeen
 * @Bean of Type ClassOne			
 * @Bean("two") of Type ClassTwo		
 * @Bean("two") of Type ClassTwo	

CaseNinteen :				Output:
 * @Autowired(required = false)		1.
 * @Bean of Type ClassOne			Default constructor in ClassTwo
 * @Bean("someName") of Type ClassTwo	getClassTwo_Two() bean	
 * @Bean("two") of Type ClassTwo		Default constructor in ClassTwo
					getClassTwo_One() bean
					Default constructor in ClassOne
					Spring Container is ready
					2.
					Default constructor in ClassOne
					Default constructor in ClassTwo
					getClassTwo_Two() bean
					Default constructor in ClassTwo
					getClassTwo_One() bean
					Spring Container is ready
					3.
					Default constructor in ClassTwo
					getClassTwo_One() bean
					Default constructor in ClassTwo
					getClassTwo_Two() bean
					Default constructor in ClassOne
					Spring Container is ready
					4. 
					Default constructor in ClassTwo
					getClassTwo_One() bean
					Default constructor in ClassOne
					Default constructor in ClassTwo
					getClassTwo_Two() bean
					Spring Container is ready
					5.
					Default constructor in ClassTwo
					getClassTwo_Two() bean
					Default constructor in ClassOne
					Default constructor in ClassTwo
					getClassTwo_One() bean
					Spring Container is ready
