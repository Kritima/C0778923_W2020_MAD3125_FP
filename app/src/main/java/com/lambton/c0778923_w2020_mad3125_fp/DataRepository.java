package com.lambton.c0778923_w2020_mad3125_fp;

import com.lambton.c0778923_w2020_mad3125_fp.models.Bill;
import com.lambton.c0778923_w2020_mad3125_fp.models.Customer;
import com.lambton.c0778923_w2020_mad3125_fp.models.Hydro;
import com.lambton.c0778923_w2020_mad3125_fp.models.Internet;
import com.lambton.c0778923_w2020_mad3125_fp.models.Mobile;
import com.lambton.c0778923_w2020_mad3125_fp.ui.CustomerListActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class DataRepository
{
        private static DataRepository repoObj = new DataRepository();
        public static DataRepository getInstance() {
            return repoObj;
        }
        private DataRepository() { }
        private HashMap<String, Customer> customerMap = new HashMap<>();
        private ArrayList<Mobile> mobileBills = new ArrayList<>();
        private ArrayList<Hydro> hydroBills = new ArrayList<>();
        private ArrayList<Internet> internetBills = new ArrayList<>();

        public HashMap getCustomerMap(){
            return this.customerMap;
        }

    public void loadData() {
        Hydro h1 = new Hydro( "HY100",
                "12/03/2019",
                "Hydro",
                "PUREWATA",
                22);
        Internet i1 = new Internet("IN800",
                "12/02/2020",
                "Internet",
                "Something",
                22);
        Internet i2 = new Internet("IN500",
                "12/02/2020",
                "Internet",
                "Rogers",
                25);
        CustomerListActivity.customerListArrayList.get(0).addBill(h1.getBillId(), h1);
        CustomerListActivity.customerListArrayList.get(1).addBill(h1.getBillId(), h1);
        CustomerListActivity.customerListArrayList.get(1).addBill(i1.getBillId(), i1);
        CustomerListActivity.customerListArrayList.get(2).addBill(i2.getBillId(), i2);
    }
}
