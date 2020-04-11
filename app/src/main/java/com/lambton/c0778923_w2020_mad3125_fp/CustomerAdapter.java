package com.lambton.c0778923_w2020_mad3125_fp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.CustomerViewHolder> {

        private ArrayList<String> customerArrayList;

        public CustomerAdapter(ArrayList<String> customerArray)
        {
            this.customerArrayList = customerArray;
        }
        
}
