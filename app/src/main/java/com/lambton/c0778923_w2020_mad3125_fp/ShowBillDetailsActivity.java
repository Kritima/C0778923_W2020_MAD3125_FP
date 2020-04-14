package com.lambton.c0778923_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ShowBillDetailsActivity extends AppCompatActivity {

    private RecyclerView rvBillItemList;
    private ArrayList<BillItem> BillItemListArrayList;
    private BillItemAdapter billItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_bill_details);
    }


}
