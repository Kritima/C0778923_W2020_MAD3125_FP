package com.lambton.c0778923_w2020_mad3125_fp.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lambton.c0778923_w2020_mad3125_fp.R;
import com.lambton.c0778923_w2020_mad3125_fp.models.Customer;
import com.lambton.c0778923_w2020_mad3125_fp.ui.ShowBillDetailsActivity;

import java.util.ArrayList;

public class TextAdapter extends RecyclerView.Adapter<TextAdapter.TextViewHolder> {

    private ArrayList<Customer> customerArrayList ;

    public CustomerAdapter(ArrayList<Customer> customerArray) {
        this.customerArrayList = customerArray;
    }

    @NonNull
    @Override
    public CustomerAdapter.CustomerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View customerItem = layoutInflater.inflate(R.layout.item_customer, parent, false);
        CustomerAdapter.CustomerViewHolder customerViewHolder = new CustomerAdapter.CustomerViewHolder(customerItem);
        return customerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final CustomerAdapter.CustomerViewHolder holder, final int position) {

        Customer cus = this.customerArrayList.get(position);
        holder.txtName.setText(cus.fullName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Customer cs = customerArrayList.get(position);
                Intent intent = new Intent(holder.itemView.getContext(), ShowBillDetailsActivity.class);
                intent.putExtra("POSITION_I_NEED", position);
                holder.itemView.getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return this.customerArrayList.size();
    }

    public class CustomerViewHolder extends RecyclerView.ViewHolder {

        public TextView txtName;

        public CustomerViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtName = (TextView) itemView.findViewById(R.id.name);

        }
    }

}


}
