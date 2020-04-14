package com.lambton.c0778923_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.lambton.c0778923_w2020_mad3125_fp.R;
import com.lambton.c0778923_w2020_mad3125_fp.adapters.BillItemAdapter;
import com.lambton.c0778923_w2020_mad3125_fp.models.BillItem;

import java.util.ArrayList;

public class ShowBillDetailsActivity extends AppCompatActivity {

    private RecyclerView rvBillItemList;
    private ArrayList<BillItem> billItemListArrayList;
    private BillItemAdapter billItemAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_bill_details);

        populateBillItem();
        rvBillItemList = findViewById(R.id.recyclerviewBillItem);
        billItemAdapter = new BillItemAdapter(billItemListArrayList);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        rvBillItemList.setLayoutManager(mLayoutManager);
        rvBillItemList.setAdapter(billItemAdapter);
    }

    private void populateBillItem() {
        billItemListArrayList = new ArrayList<>();

        billItemListArrayList.add(new BillItem("Hydro Bill",R.drawable.water));
        billItemListArrayList.add(new BillItem("Mobile Bill",R.drawable.smartphone));
        billItemListArrayList.add(new BillItem("Internet Bill",R.drawable.wifi));
        billItemListArrayList.add(new BillItem("Generate Pdf",R.drawable.pdf));
    }

}
