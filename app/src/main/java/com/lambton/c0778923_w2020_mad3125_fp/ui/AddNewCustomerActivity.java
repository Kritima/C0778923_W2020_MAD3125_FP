package com.lambton.c0778923_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lambton.c0778923_w2020_mad3125_fp.R;
import com.lambton.c0778923_w2020_mad3125_fp.adapters.CustomerAdapter;
import com.lambton.c0778923_w2020_mad3125_fp.models.Customer;

import java.util.ArrayList;

public class AddNewCustomerActivity extends AppCompatActivity {

    private ArrayList<Customer> customerNewListArrayList;
    Customer c = new Customer();
    private CustomerAdapter customerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_customer);


    }
}
