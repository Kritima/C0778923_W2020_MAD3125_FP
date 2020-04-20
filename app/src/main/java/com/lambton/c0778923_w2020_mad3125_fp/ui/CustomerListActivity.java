package com.lambton.c0778923_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.lambton.c0778923_w2020_mad3125_fp.util.DataRepository;
import com.lambton.c0778923_w2020_mad3125_fp.R;
import com.lambton.c0778923_w2020_mad3125_fp.adapters.CustomerAdapter;
import com.lambton.c0778923_w2020_mad3125_fp.models.Customer;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class CustomerListActivity extends AppCompatActivity {

    private RecyclerView rvCustomerList;
    public static ArrayList<Customer> customerListArrayList = new ArrayList<>();
    private CustomerAdapter customerAdapter;
    FloatingActionButton floatingActionButtonAddCustomer;
    FloatingActionButton floatingActionButtonLogout;
    Customer c = new Customer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);

        if(customerListArrayList.isEmpty()) {
            processJson();
            DataRepository.getInstance().loadData();
        }
        rvCustomerList = findViewById(R.id.recyclerviewCustomers);
        floatingActionButtonAddCustomer = findViewById(R.id.floating_action_button);
        floatingActionButtonLogout = findViewById(R.id.floating_action_button_logout);

        customerAdapter = new CustomerAdapter(customerListArrayList);
        rvCustomerList.setLayoutManager(new LinearLayoutManager(this));
        rvCustomerList.setAdapter(customerAdapter);

        floatingActionButtonAddCustomer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerListActivity.this, AddNewCustomerActivity.class);

                startActivity(intent);
            }
        });

        floatingActionButtonLogout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerListActivity.this, LoginActivity.class);

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

    private void processJson()
    {
        String js = loadJSONFromAsset();
        if(js!=null)
        {
            try {
                JSONArray jsonArray = new JSONArray(js);
                //customerListArrayList = new ArrayList<>();

                for(int i=0; i<jsonArray.length();i++)
                {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    if(jsonObject.has("id"))
                    {
                        String id = jsonObject.getString("id");
                        String fname = jsonObject.getString("fname");
                        String lname = jsonObject.getString("lname");
                        String email = jsonObject.getString("email");
                        customerListArrayList.add(new Customer(id,fname,lname,email));
                    }
                }
                c.setCustomerArrayList(customerListArrayList);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(CustomerListActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
