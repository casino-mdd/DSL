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
		
	}

	//-------------------- Technology ---------------------------------
	tech{
		//Back
		javaApp{
		
		}
		//Front
		reactApp{
			
		
		}
	} //Tech
}// Casino
