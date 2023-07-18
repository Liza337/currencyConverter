package com.example.currencyconverter;

public class CovertCurrency {
    public static double usdBDT(double usdB){
        usdB=usdB*167;
        return usdB;
    }
    public static double BdtUSD(double bdtU){
       bdtU=bdtU/167;
       return bdtU;
    }
    public static double InrUSD(double inrU ){
        inrU=inrU/87;
        return inrU;
    }
}
