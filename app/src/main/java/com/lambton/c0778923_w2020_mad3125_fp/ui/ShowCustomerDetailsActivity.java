package com.lambton.c0778923_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lambton.c0778923_w2020_mad3125_fp.R;
import com.lambton.c0778923_w2020_mad3125_fp.adapters.UniversalAdapter;
import com.lambton.c0778923_w2020_mad3125_fp.models.Customer;
import com.lambton.c0778923_w2020_mad3125_fp.models.Universal;

import java.util.ArrayList;

public class ShowCustomerDetailsActivity extends AppCompatActivity {

    Customer customer;
    private RecyclerView recyclerView;
    private ArrayList<Universal> universals;
    CardView cvbill;

   // private CustomerItemAdapter billItemAdapter;
    private UniversalAdapter universalAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_details);

        populateCustomerDetails();

        recyclerView = findViewById(R.id.recyclerviewCustomerItem);
        cvbill = findViewById(R.id.card_viewBill);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(universalAdapter);

        cvbill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShowCustomerDetailsActivity.this, ShowBillDetailsActivity.class);
                startActivity(intent);
            }
        });
    }


    private void populateCustomerDetails() {

        universals = new ArrayList<>();
        customer = (Customer) getIntent().getExtras().getSerializable("customerKey");

        //universals.add(new Universal("Customer Id : " + customer.getId()));
        universals.add(new Universal("Customer Name : " + customer.fullName()));
       // universals.add(new Universal("Customer Email : " + customer.getEmail()));
    }

}
