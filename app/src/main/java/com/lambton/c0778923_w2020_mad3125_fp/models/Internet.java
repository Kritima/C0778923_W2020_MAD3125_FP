package com.lambton.c0778923_w2020_mad3125_fp.models;

public class Internet extends Bill {

    private String providerName;
    private int internetGbUsed;

    public Internet() {
    }

    public Internet(String providerName, int internetGbUsed) {
        this.providerName = providerName;
        this.internetGbUsed = internetGbUsed;
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
