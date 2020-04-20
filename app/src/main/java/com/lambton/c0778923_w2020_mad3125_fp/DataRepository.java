package com.lambton.c0778923_w2020_mad3125_fp;

import com.lambton.c0778923_w2020_mad3125_fp.models.Bill;
import com.lambton.c0778923_w2020_mad3125_fp.models.Customer;
import com.lambton.c0778923_w2020_mad3125_fp.models.Hydro;
import com.lambton.c0778923_w2020_mad3125_fp.models.Internet;
import com.lambton.c0778923_w2020_mad3125_fp.models.Mobile;

import java.util.ArrayList;
import java.util.HashMap;

/*public class DataRepository
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
            Customer c1 = new Customer("ID001","Kritima","Kukreja",
            Customer c2 = new Customer("ID002",
                    "Prakash",
                    "Rana",
                    "Male",
                    "prakash@gmail.com",
                    "Rana",
                    "codemaster",
                    "Kathmandu, Nepal",
                    "27/04/1995", R.drawable.icon_prakash);
            Customer c3 = new Customer("ID003",
                    "Priteshkumar",
                    "Patel",
                    "Male",
                    "pritesh@gmail.com",
                    "TheLion",
                    "codegod",
                    "Gujarat, India",
                    "21/07/1983", R.drawable.icon_pritesh);
            Customer c4 = new Customer("ID004",
                    "Kritima",
                    "Kukreja",
                    "Female",
                    "kritima@gmail.com",
                    "Kritima",
                    "codepro",
                    "Delhi, India",
                    "05/01/1996", R.drawable.icon_kritima);
            Customer c5 = new Customer("ID005",
                    "Raghav",
                    "Bobal",
                    "Male",
                    "raghav@gmail.com",
                    "Raghav",
                    "password",
                    "Delhi, India",
                    "27/07/1998",R.drawable.icon_raghav);
            Customer c6 = new Customer("ID006",
                    "Jyothi",
                    "Thomas",
                    "Female",
                    "jyothi@gmail.com",
                    "jyothi",
                    "password2",
                    "Kerala, India",
                    "27/07/1991",R.drawable.woman2);
            Mobile m1 = new Mobile("MB100",
                    org.joda.time.LocalDate.now(),
                    Bill.BillType.Mobile,
                    "APPLE INC.",
                    "Student Plan",
                    "4379077578",
                    1,
                    6);
            Hydro h1 = new Hydro( "HY100",
                    Bill.BillType.Hydro,
                    "PUREWATA",
                    22);
            Internet in1 = new Internet("IN100",
                    Bill.BillType.Internet,
                    "SKYLINK",
                    22.8);
            Internet in2 = new Internet("IN200",
                    Bill.BillType.Internet,
                    "SKYLINK",
                    22.8);
            c1.addBill("IN100", in1);
            c1.addBill("MB100", m1);
            c1.addBill("HY100", h1);
            c1.addBill("IN200", in2);
            c2.addBill("IN200", in2);
            mobileBills.add(m1);
            hydroBills.add(h1);
            internetBills.add(in1);
            internetBills.add(in2);
            customerMap.put(c1.getCustomerId(),c1);
            customerMap.put(c2.getCustomerId(),c2);
            customerMap.put(c3.getCustomerId(),c3);
            customerMap.put(c4.getCustomerId(),c4);
            customerMap.put(c5.getCustomerId(),c5);
            customerMap.put(c6.getCustomerId(),c6);
        }
}
}*/
