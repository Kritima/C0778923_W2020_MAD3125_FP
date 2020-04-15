package com.lambton.c0778923_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.lambton.c0778923_w2020_mad3125_fp.R;
import com.lambton.c0778923_w2020_mad3125_fp.adapters.BillItemAdapter;
import com.lambton.c0778923_w2020_mad3125_fp.adapters.UniversalAdapter;
import com.lambton.c0778923_w2020_mad3125_fp.models.BillItem;
import com.lambton.c0778923_w2020_mad3125_fp.models.Customer;
import com.lambton.c0778923_w2020_mad3125_fp.models.Universal;

import java.util.ArrayList;

public class ShowBillDetailsActivity extends AppCompatActivity {

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

        populateBillItem();
        populateCustomerDetails();

        rvBillItemList = findViewById(R.id.recyclerviewBillItem);
        recyclerView = findViewById(R.id.recyclerviewCustomerItem);

        billItemAdapter = new BillItemAdapter(billItemListArrayList);
        universalAdapter = new UniversalAdapter(universals);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);

        rvBillItemList.setLayoutManager(mLayoutManager);
        rvBillItemList.setAdapter(billItemAdapter);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(universalAdapter);
    }

    private void populateBillItem() {
        billItemListArrayList = new ArrayList<>();

        billItemListArrayList.add(new BillItem("Hydro Bill",R.drawable.water));
        billItemListArrayList.add(new BillItem("Mobile Bill",R.drawable.smartphone));
        billItemListArrayList.add(new BillItem("Internet Bill",R.drawable.wifi));
        billItemListArrayList.add(new BillItem("Generate Pdf",R.drawable.pdf));
    }

    private void populateCustomerDetails() {
       universals = new ArrayList<>();

      universals.add(new Universal(customer.getId()));
    }

}
