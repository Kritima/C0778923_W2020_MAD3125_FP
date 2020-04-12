package com.lambton.c0778923_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class CustomerListActivity extends AppCompatActivity {

    private RecyclerView rvCustomerList;
    private ArrayList<Customer> customerListArrayList;
    private CustomerAdapter customerAdapter;
    FloatingActionButton floatingActionButtonAddCustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);

        rvCustomerList = findViewById(R.id.recyclerviewCustomers);
        floatingActionButtonAddCustomer = (FloatingActionButton) findViewById(R.id.floating_action_button);
        populateCustomer();

        customerAdapter = new CustomerAdapter(customerListArrayList);
        rvCustomerList.setLayoutManager(new LinearLayoutManager(this));
        rvCustomerList.setAdapter(customerAdapter);

        floatingActionButtonAddCustomer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerListActivity.this,AddNewCustomerActivity.class);
                startActivity(intent);
            }
        });

    }

    private void populateCustomer() {
        customerListArrayList = new ArrayList<>();

        customerListArrayList.add(new Customer("C004", "Kritima", "Kukreja", "kri@gmail.com"));
        customerListArrayList.add(new Customer("C004", "Kritima", "Kukreja", "kri@gmail.com"));
        customerListArrayList.add(new Customer("C004", "Kritima", "Kukreja", "kri@gmail.com"));
        customerListArrayList.add(new Customer("C004", "Kritima", "Kukreja", "kri@gmail.com"));
    }
}
