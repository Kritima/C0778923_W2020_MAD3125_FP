package com.lambton.c0778923_w2020_mad3125_fp.models;

public class Internet {

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
}
