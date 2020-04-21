package com.lambton.c0778923_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.lambton.c0778923_w2020_mad3125_fp.R;
import com.lambton.c0778923_w2020_mad3125_fp.adapters.UniversalAdapter;
import com.lambton.c0778923_w2020_mad3125_fp.models.Customer;
import com.lambton.c0778923_w2020_mad3125_fp.models.Universal;

import java.util.ArrayList;

public class ShowCustomerDetailsActivity extends AppCompatActivity {

    Customer customer;
    private RecyclerView recyclerView;
    private ArrayList<Universal> universals;
    FloatingActionButton floatingActionButtonMove;
    TextView tv1, tv2, tv3;

   // private CustomerItemAdapter billItemAdapter;
    private UniversalAdapter universalAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_details);

        final Customer customer = (Customer) getIntent().getExtras().getSerializable("customerKey");

        tv1 = findViewById(R.id.textViewCus1);
        tv2 = findViewById(R.id.textViewCus2);
        tv3 = findViewById(R.id.textViewCus3);
        floatingActionButtonMove = findViewById(R.id.floating_action_button_move);

        tv1.setText("Customer Id: " + customer.getId());
        tv2.setText("Customer Name: " + customer.fullName());
        tv3.setText("Email : " + customer.getEmail());


        floatingActionButtonMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShowCustomerDetailsActivity.this, ShowBillDetailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("CustomerBills", customer);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }


}
