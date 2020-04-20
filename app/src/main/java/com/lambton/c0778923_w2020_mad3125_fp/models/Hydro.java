package com.lambton.c0778923_w2020_mad3125_fp.models;

public class Hydro extends Bill {

    public enum BillType {
        Mobile,
        Hydro,
        Internet,
    }

    private String agencyName;
    private int unitConsumed;
    private BillType billType;

    public Hydro() {
    }


    public Hydro(String agencyName, int unitConsumed, BillType billType) {
        this.agencyName = agencyName;
        this.unitConsumed = unitConsumed;
        this.billType = billType;
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
