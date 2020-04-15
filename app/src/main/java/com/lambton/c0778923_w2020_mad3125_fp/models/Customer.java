package com.lambton.c0778923_w2020_mad3125_fp.models;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer extends Bill implements Serializable {

    private String id;
    private String fName;
    private String lName;
    private String email;
    private ArrayList<Customer> customerArrayList;

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
}
