package com.tnsif.miniproject.GoKart;

//Concrete Shop Factory
	class GSShopFactory extends ShopFactory {
	    @Override
	    PrimeAcc createPrimeAccount() {
	        return new GSPrimeAcc();
	    }

	    @Override
	    NormalAcc createNormalAccount() {
	        return new GSNormalAcc();
	    }
	}

