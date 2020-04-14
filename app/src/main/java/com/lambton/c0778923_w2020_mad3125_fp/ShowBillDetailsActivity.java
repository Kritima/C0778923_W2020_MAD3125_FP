package com.lambton.c0778923_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ShowBillDetailsActivity extends AppCompatActivity {

    private RecyclerView rvBillItemList;
    private ArrayList<BillItem> billItemListArrayList;
    private BillItemAdapter billItemAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_bill_details);

        rvBillItemList = findViewById(R.id.recyclerviewBillItem);
        billItemAdapter = new BillItemAdapter(billItemListArrayList);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        rvBillItemList.setLayoutManager(mLayoutManager);
        rvBillItemList.setAdapter(billItemAdapter);
    }

    private void populateBillItem() {
        billItemListArrayList = new ArrayList<>();

        billItemListArrayList.add(new Customer("C004", "Kritima", "Kukreja", "kri@gmail.com"));
        customerListArrayList.add(new Customer("C004", "Kritima", "Kukreja", "kri@gmail.com"));
        customerListArrayList.add(new Customer("C004", "Kritima", "Kukreja", "kri@gmail.com"));
        customerListArrayList.add(new Customer("C004", "Kritima", "Kukreja", "kri@gmail.com"));
    }

}
