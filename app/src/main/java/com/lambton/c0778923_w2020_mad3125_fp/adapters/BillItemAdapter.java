package com.lambton.c0778923_w2020_mad3125_fp.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.lambton.c0778923_w2020_mad3125_fp.R;
import com.lambton.c0778923_w2020_mad3125_fp.fragments.HydroFragment;
import com.lambton.c0778923_w2020_mad3125_fp.models.BillItem;
import com.lambton.c0778923_w2020_mad3125_fp.ui.ShowBillActivity;

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
        BillItemAdapter.BillItemViewHolder billItemViewHolder = new BillItemAdapter.BillItemViewHolder(billItem);
        return billItemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final BillItemAdapter.BillItemViewHolder holder, final int position) {

        BillItem billItem = this.billItemArrayList.get(position);
        holder.txtName.setText(billItem.getBillName());
        holder.ivThumbnail.setImageResource(billItem.getThumbnail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Customer cs = customerArrayList.get(position);
                Intent intent = new Intent(holder.itemView.getContext(), ShowBillActivity.class);
                //Bundle bundle = new Bundle();
                // bundle.putSerializable("attractionsKey", ca);
                //intent.putExtras(bundle);
                holder.itemView.getContext().startActivity(intent);
               // AppCompatActivity activity = (AppCompatActivity) v.getContext();
               // Fragment myFragment = new HydroFragment();
              //  activity.getSupportFragmentManager().beginTransaction().replace(R.id.navigation_home, myFragment).addToBackStack(null).commit();

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
            this.txtName = itemView.findViewById(R.id.name);
            this.ivThumbnail =  itemView.findViewById(R.id.thumbnail);

        }
    }

}

