package com.lambton.c0778923_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.lambton.c0778923_w2020_mad3125_fp.R;
import com.lambton.c0778923_w2020_mad3125_fp.models.BillItem;
import com.lambton.c0778923_w2020_mad3125_fp.models.Customer;
import com.lambton.c0778923_w2020_mad3125_fp.models.Universal;

import java.util.ArrayList;

public class ShowCustomerDetailsActivity extends AppCompatActivity {

    Customer customer;
    private RecyclerView rvBillItemList;
    private RecyclerView recyclerView;
    private ArrayList<BillItem> billItemListArrayList;
    private ArrayList<Universal> universals;

    private BillItemAdapter billItemAdapter;
    private UniversalAdapter universalAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_bill_details);

        customer = (Customer) getIntent().getExtras().getSerializable("customerKey");

        populateCustomerDetails();

        recyclerView = findViewById(R.id.recyclerviewCustomerItem);


        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);

        rvBillItemList.setLayoutManager(mLayoutManager);
        rvBillItemList.setAdapter(billItemAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(universalAdapter);
    }


    private void populateCustomerDetails() {
        universals = new ArrayList<>();

        //universals.add(new Universal("Customer Id : " + customer.getId()));
        universals.add(new Universal("Customer Name : " + customer.fullName()));
       // universals.add(new Universal("Customer Email : " + customer.getEmail()));
    }

}
