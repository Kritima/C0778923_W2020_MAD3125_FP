package com.lambton.c0778923_w2020_mad3125_fp.models;

public class Mobile {

    private String mobileModelName;
    private String planName;
    private String mobileNumber;
    private int internetGbUsed;
    private int minuteUsed;

    public Mobile() {
    }

    public Mobile(String mobileModelName, String planName, String mobileNumber, int internetGbUsed, int minuteUsed) {
        this.mobileModelName = mobileModelName;
        this.planName = planName;
        this.mobileNumber = mobileNumber;
        this.internetGbUsed = internetGbUsed;
        this.minuteUsed = minuteUsed;
    }

    
}
