package com.lambton.c0778923_w2020_mad3125_fp.models;

import java.io.Serializable;

public class Bill implements Serializable {
    private String billId;
    private String billDate;
    private String billType;
    Double totalBillAmount = 0.0;
    public Bill() {
    }
    public Bill(String billId, String billDate, String billType) {
        this.billId = billId;
        this.billDate = billDate;
        this.billType = billType;
    }
    public Double billCalculate(){
        double amount = 0.0;
        return amount;
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
    public void setBillId(String billId) {
        this.billId = billId;
    }
    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }
    public void setBillType(String billType) {
        this.billType = billType;
    }
    public void setTotalBillAmount(Double totalBillAmount) {
        this.totalBillAmount = totalBillAmount;
    }
    public Double getBillTotal() {
        return totalBillAmount;
    }
}

