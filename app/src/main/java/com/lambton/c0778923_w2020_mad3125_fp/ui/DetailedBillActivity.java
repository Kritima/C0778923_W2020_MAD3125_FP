package com.lambton.c0778923_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.lambton.c0778923_w2020_mad3125_fp.R;
import com.lambton.c0778923_w2020_mad3125_fp.models.Bill;
import com.lambton.c0778923_w2020_mad3125_fp.models.CustomerList;
import com.lambton.c0778923_w2020_mad3125_fp.models.Hydro;
import com.lambton.c0778923_w2020_mad3125_fp.models.Internet;
import com.lambton.c0778923_w2020_mad3125_fp.models.Mobile;

public class DetailedBillActivity extends AppCompatActivity {

    TextView txtFragBillId;
    TextView txtFragBillDate;
    TextView txtFragDataUsed;
    TextView txtFragManufac;
    TextView txtFragPlanName;
    TextView txtFragMinsUsed;
    TextView txtFragBillAmount;
    ImageView imgBillType;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView textBillType;
    Button btnHome;
    Bill billObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_bill);

        txtFragBillId = findViewById(R.id.txtFragBillId);
        txtFragBillDate = findViewById(R.id.txtFragBillDate);
        txtFragDataUsed = findViewById(R.id.txtFragDataUsed);
        txtFragManufac = findViewById(R.id.txtFragManufac);
        txtFragPlanName = findViewById(R.id.txtFragPlanName);
        txtFragMinsUsed = findViewById(R.id.txtFragMinsUsed);
        txtFragBillAmount= findViewById(R.id.txtFragBillAmount);
        textBillType= findViewById(R.id.textBillType);
        imgBillType = findViewById(R.id.imgBillType);
        text4= findViewById(R.id.text4);
        text5= findViewById(R.id.text5);
        text6= findViewById(R.id.text6);
        text7 = findViewById(R.id.text7);
        btnHome = findViewById(R.id.btnHome);



            billObj = (Bill) getIntent().getSerializableExtra("BillObj");
            if (billObj.getBillId().contains("MB")) {
                Mobile m = (Mobile) billObj;
                txtFragBillId.setText(m.getBillId());
                txtFragBillDate.setText(m.getBillDate());
                txtFragBillAmount.setText(m.getTotalBillAmount().toString());
            }
            if (billObj.getBillId().contains("HY")) {
                Hydro h = (Hydro) billObj;
                txtFragBillId.setText(h.getBillId());
                txtFragBillDate.setText(h.getBillDate());
                txtFragPlanName.setText(String.valueOf(h.getUnitConsumed()));
                txtFragManufac.setText(h.getAgencyName());
                txtFragBillAmount.setText(h.getTotalBillAmount().toString());
                imgBillType.setImageResource(R.drawable.water);
                text4.setText("Agency Name");
                text5.setText("Units Used");
                textBillType.setText("HYDRO BILL DETAILS");
                mobFieldsHide();
            }
            if(billObj.getBillId().contains("IN")) {
                Internet i = (Internet) billObj;
                txtFragBillId.setText(i.getBillId());
                txtFragBillDate.setText(i.getBillDate());
                txtFragBillAmount.setText(i.getTotalBillAmount().toString());
            }

            btnHome.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(DetailedBillActivity.this, CustomerListActivity.class);
                    startActivity(intent);
                }
            });
        }

        public void mobFieldsHide()
        {
            txtFragDataUsed.setVisibility(View.INVISIBLE);
            txtFragMinsUsed.setVisibility(View.INVISIBLE);
            text6.setVisibility(View.INVISIBLE);
            text7.setVisibility(View.INVISIBLE);
        }
    }


