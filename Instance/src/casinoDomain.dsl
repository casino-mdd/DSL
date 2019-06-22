dataType String
dataType Boolean
dataType Num
dataType Date

generalEntity Points {   
	idPoint:Num
	idSale:Num
	totalPoints:Num
	expDate:Date
	createdAt:Date
}

generalEntity Client {   
	idPerson:Num
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

generalEntity Employee {   
	idPerson:Num
	age:Num
	gender:String
	name:String
	surname:String
	email:String
	phone:Num
	indentificationNumber:Num
	createdAt:Date
	updatedAt:Date		
	idEmployee:Num
	idOffice:Num
	position:String
	admitionDate:Date
}

generalEntity Reward {   
	idReward:Num
	idOffice:Num
	name: String
	pointNeed:Num
	isAvailable:Boolean	
}

generalEntity Office {  
	idOffice:Num 
	name: String
	address: String
	city:String
	createdAt:Date
	updatedAt:Date	
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

generalEntity Exchange {   
	idExchange:Num
	idClient:Num
	idReward:Num
	idEmployee:Num
	createdAt:Date
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

domain {
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
			UserAcc
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
			Exchange
		}
		submodule PointsReport {
			op{
				type:Read
				operates_on:Points
			}
			Points
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
			Office
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
			Reward
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
			Employee
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
			Client
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
			Sale
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









