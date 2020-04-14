package com.lambton.c0778923_w2020_mad3125_fp;

public class BillItem {

    private String billName;
    private int thumbnail;

    public BillItem(String billName, int thumbnail) {
        this.billName = billName;
        this.thumbnail = thumbnail;
    }

    public String getBillName() {
        return billName;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
