package com.lambton.c0778923_w2020_mad3125_fp.models;

public class Mobile extends Bill{

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

    public String getMobileModelName() {
        return mobileModelName;
    }

    public String getPlanName() {
        return planName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getInternetGbUsed() {
        return internetGbUsed;
    }

    public int getMinuteUsed() {
        return minuteUsed;
    }

    public void setMobileModelName(String mobileModelName) {
        this.mobileModelName = mobileModelName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setInternetGbUsed(int internetGbUsed) {
        this.internetGbUsed = internetGbUsed;
    }

    public void setMinuteUsed(int minuteUsed) {
        this.minuteUsed = minuteUsed;
    }
}
