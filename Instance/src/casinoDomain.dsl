Casino{

	//----------------------------- Domain -------------------------------------
	domain {
	
		dataType String
		dataType Boolean
		dataType Num
		dataType Date

		module Authentication {
			submodule User {
				op {
					type: Read
					operates_on: UserAcc
				}
				op {
					type: Create
					operates_on: UserAcc
				}
				specialEntity UserAcc {
					idUserAcc:Num
					idEmployee:Num
					username:String
					password:String
					updatedAt:Date
					createdAt:String
					isActive:Boolean
					profile:String	
					trx {
						type: exchange	
						operates_on: Points
						operates_on: Reward
						operates_on: Exchange
					}
					trx {
						type: sale	
						operates_on: Points
						operates_on: Sale
					}
				}
			}
		}
		
		module Exchange {
			submodule Management {
				op{
					type:Read
					operates_on:Exchange
				}
				op{
					type:Create
					operates_on:Exchange
				}
				generalEntity Exchange {   
					idExchange:Num
					idClient:Num
					idReward:Num
					idEmployee:Num
					createdAt:Date
				}
			}
			submodule PointsReport {
				op{
					type:Read
					operates_on:Points
				}
				generalEntity Points {   
					idPoint:Num
				idSale:Num
				totalPoints:Num
				expDate:Date
				createdAt:Date
				}
			}		
		}
	
		module Office {
			submodule Management{
				op{
					type: Read
					operates_on:Office
				}
				op{
					type: Create
					operates_on:Office
				}
				generalEntity Office {  
					idOffice:Num 
					name: String
					address: String
					city:String
					createdAt:Date
					updatedAt:Date	
				}
			}
	
			submodule RewardsMngmt{
				op{
					type: Read
					operates_on:Reward
				}
				op{
					type: Create
					operates_on:Reward
				}
				generalEntity Reward {   
					idReward:Num
					idOffice:Num
					name: String
					pointNeed:Num
					isAvailable:Boolean	
				}	
			} 
		}
	
		module Employee {
			submodule Management{
				op{
					type: Read
					operates_on:Employee
				}
				op{
					type: Create
					operates_on:Employee
				}
				generalEntity Employee {   
					idEmployee:Num
					age:Num
					gender:String
					name:String
					surname:String
					email:String
					phone:Num
					indentificationNumber:Num
					createdAt:Date
					updatedAt:Date		
					idOffice:Num
					position:String
					admitionDate:Date
				}
			}
		}
	
		module Client{
			submodule Management {
				op{
					type: Read
					operates_on:Client
				}
				op{
					type: Create
					operates_on:Client
				}
				generalEntity Client {   
					idClient:Num
				age:Num
				gender:String
				name:String
				surname:String
				email:String
				phone:Num
				indentificationNumber:Num
				createdAt:Date
				updatedAt:Date	
				}
			}
		}
	
		module Sale {
			submodule Management {
				op{
					type: Read
					operates_on:Sale
				}
				op{
					type: Create
					operates_on:Sale
				}
				op{
					type: Create
					operates_on:Points
				}
				generalEntity Sale {
					idSale:Num
					idEmployee:Num
					idClient:Num
					idOffice:Num
					token:Num
					cost:Num
					paymentMethod:String
					createdAt:Date   
				}
			}
		}
	
		rel {
			type:Composition
			source: Office
			target: Employee
		}

		rel {
			type:Composition
			source: Office
			target: Reward
		}

		rel {
			type:Composition
			source: Employee
			target: UserAcc
		}
	} //Domain
	
	//------------------- Architecture -------------------------------
	arch {
		component Front {
			layer JavaScript {
				layerSegment Ui {
					{ 
						allowedToUse: Containers
					}
				}
				layerSegment Containers { 
					{ 
						allowedToUse: Store
					}
				}
				layerSegment Store {
					{
						allowedToUse: Services
					}
					sublayerSegment Reducers					
					sublayerSegment Actions				
				}
				layerSegment Services { 
					{ 
						allowedToUse: RestEntity
					}
				}
			}
		}
		component Back {
			layer War {
				layerSegment RestEntity {
					
				}
			}
			layer Ejb {
				layerSegment Facade {
					{
						allowedToUse: Pojo
						allowedToUse: Dto
						allowedToUse: Util				
					}				
				}
				layerSegment Dto {}
				layerSegment Pojo {}
				layerSegment Util {}
			}
		}
		relationArch FrontBack{
			source: JavaScript, 
			target:	War
		}
		relationArch RestBussiness {
			source: War,
			target: Ejb
		}
		
	} //Architecture

	//-------------------- Technology ---------------------------------
	tech{
		//Back
		javaApp {
		 jeeProject casino_ear {
		 	
		 	subproject casino_ejb{
		 		epackage facade{
		 			genericClass EntityManager{}
		 			abstractClass AbstractFacade{
		 				attribute emf : EntityManager			
		 			}
		 			genericClass xFacade{
		 				extends : AbstractFacade
		 			}
		 		}
		 		epackage dto{}
		 		epackage pojo{}
		 		epackage util{
		 			nativeClass String{}
		 			genericClass JsonImpl{} 
		 			genericClass JsonUtil{
		 				attribute jsonContent : String 
		 				methodBack objectToJson { 
		 					argument JsonImpl
		 					return String
		 				}
		 				methodBack jsonToObject{
		 					argument String
		 					return JsonImpl
		 				}
		 			}
		 		},
		 		library jdk8{isNative true}
		 		library gson{isNative false}
		 		library hibernate{
		 			isNative false
		 			annotation EJB {}
		 		},
		 		descriptor persistence_xml{ path "./config"}
		 	} 
		 	
		 	subproject casino_war{
		 		epackage rest{
		 			abstractClass AbstractRest{
		 			}
		 			genericClass xRest{
		 				extends :AbstractRest
		 			} 
		 		},
		 		library jdk8{isNative true}
		 		library JAX_WS{
		 			isNative false
		 			annotation POST{propertie "params"}
		 			annotation REST{propertie "params"}
		 			annotation PUT{}
		 			annotation ENDPOINT{propertie "path"}
		 		},
		 		descriptor web_xm{ path "./WEB-INF"}
		 	}
		 	
		 }//jeeProject
		}
		
		
		//Front
		reactApp{
			module React{
				presentIn: modules
			}
			module Ant{
				presentIn: modules
			}
			module Redux{
				presentIn: modules
			}
			module Axios{
				presentIn: modules
			}
			module Router{
				presentIn: modules
			}
			directory modules{
				has: ReactJs
				has: AntDesign
				has: Axios
				has: Redux
				has: Router
				purpose: 'libraries'
			}
			js ReactJs{
				type: 'library'
			}
			js AntDesign{
				type: 'library'
			}
			js Router{
				type: 'library'
			}
			js Axios{
				type: 'library'
			}
			js Redux{
				type: 'library'
			}
			js StoreJs{
				type: 'code'
			}
			js Constants{
				type: 'code'	
			}
			js CustomContainer{
				type: 'code'
			}
			css CustomCss{
				type: 'style sheet'	
			}
			directory Styles{
				has: CustomCss
				purpose: 'Groups style sheets'
			}
			js CustomServicesJs{
				type: 'code'
			}
			service CustomServicesRest{
				use: Axios
				method: 'POST'
				method: 'GET'
			}
			directory Containers_{
				has: CustomContainer
				purpose: 'Holds components which connect to store'
			}
			directory UI {
				contains: CustomFunctionalityDir
				purpose: 'Contains UI components'	
			}
			directory CustomFunctionalityDir{
				purpose: 'Contains Components for custom func.'
			}
			directory Store_{
				has: StoreJs
				has: Constants
				contains: Reducers_
				contains: Actions_
				purpose: 'State management'
			}
			js CustomReducer {
				type: 'code'	
			}
			js CustomActions{
				type: 'code'
			}
			directory Reducers_ {
				has: CustomReducer
				purpose: 'State division'
			}
			directory Actions_{
				has: CustomActions
				purpose: 'Handle actions for corresponding func.'
			}
			directory RootDirectory{
				has: Package
				purpose: 'Encapsulates entire react project'
			}
			directory src{
				has: App
				has: Index
				purpose: 'Encapsulates source code (multiple classes)'
			}
			json Package{
				type: 'configuration'
			}
			js App{
				type: 'code'
			}
			js Index{
				type: 'code'
			}
			md Readme{
				type: 'documentation'
			}
			router MainRouter{
				inWithin: src 
				use: Router
				route: MainVisualizer
			}
			functionality MainFunctionality{
				uses: MainRouter
				render: MainVisualizer
				organizedBy: src
			}

			visualizer MainVisualizer{
				inWithin: src
				use: React
				use: Ant
			}
			visualizer CustomVisualizer{
				inWithin: CustomFunctionalityDir
				use: Ant
				use: React
			}
			action CustomAction{
				create: CustomActionCreator
				dispatch: CustomActionDispatcher
				actionDirectory: Actions_
			}
			actionDispatcher CustomActionDispatcher{
				use: CustomActionCreator
			}
			actionCreator CustomActionCreator{
				type: ''
			}
			reducer CustomReducer{
				catch: CustomActionCreator
				reducerDirectory: Reducers_
			}	 
			container CustomContainer{
				inWithin: Containers_
				dispatch: CustomActionDispatcher
				map: CustomReducer
				use: Redux
			}
			functionality CustomFunctionality{
				wraps: CustomContainer
				render: CustomVisualizer
				state: CustomFuncState
				calls: CustomServicesRest
				organizedBy: CustomFunctionalityDir
			}
			state CustomFuncState{
				handleAction: CustomAction
				handleReducer: CustomReducer
			}

			performs: MainFunctionality
			performs: CustomFunctionality
			holds: RootDirectory
			use: React
			use: Axios
			use: Router
			use: Ant
			use: Redux 
		} //React
	} //Tech
}// Casino
