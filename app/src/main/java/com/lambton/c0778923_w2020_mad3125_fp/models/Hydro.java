package com.lambton.c0778923_w2020_mad3125_fp.models;

public class Hydro extends Bill {
    private String agencyName;
    private int unitConsumed;
    public Hydro() {
    }
    public Hydro(String billId, String billDate, String billType, String agencyName, int unitConsumed) {
        super(billId, billDate, billType);
        this.agencyName = agencyName;
        this.unitConsumed = unitConsumed;
        this.totalBillAmount = billCalculate();
    }
    @Override
    public Double billCalculate(){
        double billAmount = 0.0;
        if (unitConsumed < 10)
        {
            billAmount = 1.5 * unitConsumed;
        }
        else if (unitConsumed > 20)
        {
            billAmount = 2.5 * unitConsumed;
        }
        else
        {
            billAmount = 3.5 * unitConsumed;
        }
        return billAmount;
    }
    public String getAgencyName() {
        return agencyName;
    }
    public int getUnitConsumed() {
        return unitConsumed;
    }
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }
    public void setUnitConsumed(int unitConsumed) {
        this.unitConsumed = unitConsumed;
    }
}