package com.lambton.c0778923_w2020_mad3125_fp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BillItemAdapter extends RecyclerView.Adapter<BillItemAdapter.BillItemViewHolder> {

    private ArrayList<BillItem> billItemArrayList;

    public BillItemAdapter(ArrayList<BillItem> billItemArray) {
        this.billItemArrayList = billItemArray;
    }

    @NonNull
    @Override
    public BillItemAdapter.BillItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View billItem = layoutInflater.inflate(R.layout.item_bill, parent, false);
        BillItemAdapter.BillItemViewHolder billitemViewHolder = new BillItemAdapter.BillItemViewHolder(customerItem);
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
                //Bundle bundle = new Bundle();
                // bundle.putSerializable("attractionsKey", ca);
                //intent.putExtras(bundle);
                holder.itemView.getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return this.billItemArrayList.size();
    }

    public class BillItemViewHolder extends RecyclerView.ViewHolder {

        public TextView txtName;
        public ImageView ivThumbnail;

        public BillItemViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtName = (TextView) itemView.findViewById(R.id.name);
            this.ivThumbnail = (ImageView) itemView.findViewById(R.id.thumbnail);

        }
    }

}

}