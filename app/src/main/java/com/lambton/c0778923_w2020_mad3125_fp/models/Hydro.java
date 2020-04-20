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
