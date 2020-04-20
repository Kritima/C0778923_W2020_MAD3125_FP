package com.lambton.c0778923_w2020_mad3125_fp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lambton.c0778923_w2020_mad3125_fp.R;
import com.lambton.c0778923_w2020_mad3125_fp.models.CustomerList;
import com.lambton.c0778923_w2020_mad3125_fp.models.Universal;

import java.util.ArrayList;

public class UniversalAdapter extends RecyclerView.Adapter<UniversalAdapter.UniversalViewHolder> {

    private ArrayList<CustomerList> universalArrayList;

    public UniversalAdapter(ArrayList<CustomerList> universalArrayList) {
        this.universalArrayList = universalArrayList;
    }

    @NonNull
    @Override
    public UniversalAdapter.UniversalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View universalItem = layoutInflater.inflate(R.layout.item_universal, parent, false);
        UniversalAdapter.UniversalViewHolder universalViewHolder = new UniversalAdapter.UniversalViewHolder(universalItem);
        return universalViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final UniversalAdapter.UniversalViewHolder holder, final int position) {

        CustomerList uni = this.universalArrayList.get(position);
        holder.txtUniversal.setText(uni.getUniversal());

    }

    @Override
    public int getItemCount() {
        return this.universalArrayList.size();
    }

    public class UniversalViewHolder extends RecyclerView.ViewHolder {

        public TextView txtUniversal;

        public UniversalViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtUniversal = (TextView) itemView.findViewById(R.id.universalTextView);

        }
    }

}