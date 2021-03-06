package com.lambton.c0778923_w2020_mad3125_fp.models;

public class Internet extends Bill {

    private String providerName;
    private int internetGbUsed;

    public Internet() {
    }

    public Internet(String billId, String billDate, String billType, String providerName, int internetGbUsed) {
        super(billId, billDate, billType);
        this.providerName = providerName;
        this.internetGbUsed = internetGbUsed;
    }

    public Double billCalculate(){
        double billAmount = 0.0;
        if( internetGbUsed < 10){
            billAmount = 3 * internetGbUsed;
        }
        else {
            billAmount = 3.5 * internetGbUsed;
        }
        return billAmount;
    }

    public String getProviderName() {
        return providerName;
    }

    public int getInternetGbUsed() {
        return internetGbUsed;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public void setInternetGbUsed(int internetGbUsed) {
        this.internetGbUsed = internetGbUsed;
    }
}
