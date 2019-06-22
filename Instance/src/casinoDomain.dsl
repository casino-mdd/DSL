dataType String
dataType Boolean
dataType Int

generalEntity Points {   
	name: String
	address: String
	phone: String
	
}

generalEntity Client {   
	name: String
	address: String
	phone: String
	
}


generalEntity Employee {   
	name: String
	address: String
	phone: String
	
}

generalEntity Reward {   
	name: String
	address: String
	phone: String
	
	
}

generalEntity Office {   
	name: String
	address: String
	phone: String
	
	
}

generalEntity Sale {   
	name: String
	address: String
	phone: String
	
}

generalEntity Exchange {   
	name: String
	address: String
	phone: String
	
}

specialEntity User {
	name: String
	address: String
	phone: String
	
	role: Admin
	trx {
		type: exchange	
		operates_on: Points
		operates_on: Reward
	}
	trx {
		type: sale	
		operates_on: Points
	}
}

domain {
	module Authentication {
		submodule Users {
			op {type: Read}
			op {type: Create}
			User
		}
	}
		
	module Exchange {
		submodule PointsReport {
			op{type:Read}
			Points
		}
		submodule Management {
			op{type: Read}
			op{type: Create}
			Exchange
		}
	}
	
	module Office {
		submodule Management{
			op{type: Read}
			op{type: Create}
			Office
		}
	
	submodule RewardsMngmt{
			op{type: Read}
			op{type: Create}
			Reward
	} 
	}
	
	module Employee {
		submodule Management{
			op{type: Read}
			op{type: Create}
			Employee
		}
	}
	
	module Client{
		submodule Management {
			op{type: Read}
			op{type: Create}
			Client
		}
	}
	
	module Sale {
		submodule Management {
			op{type: Read}
			op{type: Create}
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
	target: User
}









