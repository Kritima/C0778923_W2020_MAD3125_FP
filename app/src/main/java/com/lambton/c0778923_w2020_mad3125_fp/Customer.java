package com.lambton.c0778923_w2020_mad3125_fp;

public class Customer {

    private String id;
    private String fName;
    private String lName;
    private String email;

    public Customer() {
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
}
