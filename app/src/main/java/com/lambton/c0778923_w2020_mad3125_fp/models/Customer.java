package com.lambton.c0778923_w2020_mad3125_fp.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Customer implements Serializable {

    private String id;
    private String fName;
    private String lName;
    private String email;
    private ArrayList<Customer> customerArrayList;
    private HashMap<String, Bill> customerBillsHashMap = new HashMap<>();
    private Double allTotal;


    public HashMap<String, Bill> getCustomerBillsHashMap() {
        return customerBillsHashMap;
    }

    public void setCustomerBillsHashMap(HashMap<String, Bill> customerBillsHashMap) {
        this.customerBillsHashMap = customerBillsHashMap;
    }

    public Customer() {
        this.id = "";
        this.fName = "";
        this.lName = "";
        this.email = "";
        customerArrayList = new ArrayList<Customer>();
    }

    public Customer(String id, String fName, String lName, String email) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String fullName() {
        StringBuilder sb = new StringBuilder();
        sb.append(fName.substring(0,1).toUpperCase() + fName.substring(1));
        sb.append(" ");
        sb.append(lName.substring(0,1).toUpperCase() + lName.substring(1));
        return sb.toString();
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public void setCustomerArrayList(ArrayList<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }

    public ArrayList<Bill> getBills()
        {
            Collection<Bill> demoValues = customerBillsHashMap.values();
            ArrayList<Bill> billsList = new ArrayList<>(demoValues);
            return billsList;
        }

    public Double getTotalAmount() {

        double allTotal2 = 0.0d;
        for (Bill b : customerBillsHashMap.values())
        {
           // allTotal2 += b.billTotal;
        }
        return allTotal2;
    }

    public void addBill(String billId, Hydro h1) {

    }
}
