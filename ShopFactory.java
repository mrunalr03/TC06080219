package com.tnsif.miniproject.GoKart;

// Abstract Shop Factory
abstract class ShopFactory {
    abstract PrimeAcc createPrimeAccount();
    abstract NormalAcc createNormalAccount();
}
