package com.lambton.c0778923_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class CustomerListActivity extends AppCompatActivity {

    private RecyclerView rvCustomerList;
    private ArrayList<Customer> customerListArrayList;
    private CustomerAdapter customerAdapter;
    FloatingActionButton floatingActionButtonAddCustomer;
    Customer c = new Customer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);

       // processJson();
        populateCustomer();
        rvCustomerList = findViewById(R.id.recyclerviewCustomers);
        floatingActionButtonAddCustomer = findViewById(R.id.floating_action_button);

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

    public  String loadJSONFromAsset()
    {
        String json;
        try {
            InputStream inputStream = getAssets().open("customer.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return json;
    }

    /*private void processJson()
    {
        String js = loadJSONFromAsset();
        if(js!=null)
        {
            try {
                JSONArray jsonArray = new JSONArray(js);
                customerListArrayList = new ArrayList<>();
                for(int i=0; i<jsonArray.length();i++)
                {
                    JSONObject jsonObject = JSONArray.(i);
                    if(jsonObject.has("customers"))
                    {
                        String id = jsonObject.getString("id");
                        String fname = jsonObject.getString("fname");
                        String lname = jsonObject.getString("lname");
                        String email = jsonObject.getString("email");
                        customerListArrayList.add(new Customer(id,fname,lname,email));
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }*/
    private void populateCustomer() {
        customerListArrayList = new ArrayList<>();

        customerListArrayList.add(new Customer("C004", "Kritima", "Kukreja", "kri@gmail.com"));
        customerListArrayList.add(new Customer("C004", "Kritima", "Kukreja", "kri@gmail.com"));
        customerListArrayList.add(new Customer("C004", "Kritima", "Kukreja", "kri@gmail.com"));
        customerListArrayList.add(new Customer("C004", "Kritima", "Kukreja", "kri@gmail.com"));
    }
}
