package com.lambton.c0778923_w2020_mad3125_fp.models;

public class Bill {

    private String billId;
    private String billDate;
    private String billType;
    private  Double totalBillAmount;

    public Bill(String billId, String billDate, String billType) {
        this.billId = billId;
        this.billDate = billDate;
        this.billType = billType;
    }

    public String getBillId() {
        return billId;
    }

    public String getBillDate() {
        return billDate;
    }

    public String getBillType() {
        return billType;
    }

    public Double getTotalBillAmount() {
        return totalBillAmount;
    }
}
