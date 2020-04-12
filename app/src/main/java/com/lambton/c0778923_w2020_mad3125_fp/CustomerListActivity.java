package com.lambton.c0778923_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class CustomerListActivity extends AppCompatActivity {

    private RecyclerView rvCustomerList;
    private ArrayList<Customer> customerListArrayList;
    private CustomerAdapter customerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);

        rvCustomerList = findViewById(R.id.recyclerviewCustomers);
        populateCustomer();

        customerAdapter = new CustomerAdapter(customerListArrayList);
        rvCustomerList.setLayoutManager(new LinearLayoutManager(this));
        rvCustomerList.setAdapter(customerAdapter);


    }

    private void populateCustomer() {
        customerListArrayList = new ArrayList<>();

        customerListArrayList.add(new Customer("C004", "Kritima", "Kukreja", "kri@gmail.com"));
    }
}
