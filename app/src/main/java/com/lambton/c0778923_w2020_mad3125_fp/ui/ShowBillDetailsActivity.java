package com.lambton.c0778923_w2020_mad3125_fp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lambton.c0778923_w2020_mad3125_fp.Formatter;
import com.lambton.c0778923_w2020_mad3125_fp.R;
import com.lambton.c0778923_w2020_mad3125_fp.adapters.BillsAdapter;
import com.lambton.c0778923_w2020_mad3125_fp.models.Bill;
import com.lambton.c0778923_w2020_mad3125_fp.models.Customer;

import java.util.ArrayList;

public class ShowBillDetailsActivity extends AppCompatActivity {

    private RecyclerView rvBillsList;
    private ArrayList<Bill> billsArrayListDetail;
    private BillsAdapter billsAdapter;
    private ImageView imgAddButton;
    private TextView txtTotalAmountValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_bill_details);


        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setTitle("YOUR BILLS");


        final Customer customerObj = (Customer) getIntent().getExtras().getSerializable("CustomerBills");
        billsArrayListDetail = customerObj.getBills();

        Intent mIntent = getIntent();
        billsArrayListDetail = customerObj.getBills();

        txtTotalAmountValue = findViewById(R.id.txtTotalAmountValue);

        if(!billsArrayListDetail.isEmpty())
        {
            txtTotalAmountValue.setText("YOUR TOTAL IS " + Formatter.getInstance().doubleFormatter(customerObj.getTotalAmount()));
        }
        else
        {
            txtTotalAmountValue.setText("NO BILLS TO DISPLAY");
        }

        rvBillsList = findViewById(R.id.rvBillsList);
        billsAdapter = new BillsAdapter(billsArrayListDetail);

        RecyclerView.LayoutManager mLinearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        rvBillsList.setLayoutManager(mLinearLayoutManager);
        rvBillsList.setAdapter(billsAdapter);

        imgAddButton = findViewById(R.id.imgAddBill);
        imgAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(ShowBillDetailsActivity.this, AddNewBillActivity.class);
                mIntent.putExtra("CustomerBills2",customerObj);
                startActivity(mIntent);
            }
        });
    }


    @Override
    public void onBackPressed() {
        Intent mIntent = new Intent(ShowBillDetailsActivity.this, CustomerListActivity.class);
        startActivity(mIntent);
    }
}

