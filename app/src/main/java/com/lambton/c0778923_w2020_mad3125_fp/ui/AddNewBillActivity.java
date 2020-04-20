package com.lambton.c0778923_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputEditText;
import com.lambton.c0778923_w2020_mad3125_fp.Formatter;
import com.lambton.c0778923_w2020_mad3125_fp.R;
import com.lambton.c0778923_w2020_mad3125_fp.models.Bill;
import com.lambton.c0778923_w2020_mad3125_fp.models.Customer;
import com.lambton.c0778923_w2020_mad3125_fp.models.Hydro;
import com.lambton.c0778923_w2020_mad3125_fp.models.Internet;
import com.lambton.c0778923_w2020_mad3125_fp.models.Mobile;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddNewBillActivity extends AppCompatActivity {

    Spinner billType;
    TextInputEditText billId;
    TextInputEditText billDate;
    TextInputEditText billField1;
    TextInputEditText billField2;
    TextInputEditText billField3;
    TextInputEditText billField4;
    TextInputEditText billField5;
    TextInputEditText billField6;
    TextInputEditText billField7;
    TextInputEditText billField8;
    Button addBill;
    DatePickerDialog.OnDateSetListener mDateSetListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_bill);

        Customer customerObj2;

        billType = findViewById(R.id.billType);
        billId = findViewById(R.id.billIdTextInputEditText);
        billDate = findViewById(R.id.billDateTextInputEditText);
        billField1 = findViewById(R.id.billField1TextInputEditText);
        billField2 = findViewById(R.id.billField2TextInputEditText);
        billField3 = findViewById(R.id.billField3TextInputEditText);
        billField4 = findViewById(R.id.billField4TextInputEditText);
        billField5 = findViewById(R.id.billField5TextInputEditText);
        billField6 = findViewById(R.id.billField6TextInputEditText);
        billField7 = findViewById(R.id.billField7TextInputEditText);
        billField8 = findViewById(R.id.billField8TextInputEditText);

        billDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        AddNewBillActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                Calendar cal = Calendar.getInstance();
                cal.set(year, month, day);
                billDate.setText(new SimpleDateFormat("dd-MMM-yyyy").format(cal.getTime()).toUpperCase());
            }
        };

        hidefields();
        if (billType.getSelectedItem().toString() == "HYDRO") {
            billField1.setVisibility(View.VISIBLE);
            billField2.setVisibility(View.VISIBLE);
            billField1.setHint("ENTER AGENCY NAME");
            billField2.setHint("ENTER UNITS CONSUMED");

            addBill.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean someFlag = false;
                    if (billId.getText().toString().isEmpty()) {
                        billId.setError("Please enter the bill ID");
                        someFlag = true;
                        return;
                    }
                    if (billDate.getText().toString().isEmpty()) {
                        billDate.setError("Please enter your the bill date");
                        someFlag = true;
                        return;
                    }
                    if(billField2.getText().toString().isEmpty())
                    {
                        billField2.setError("Please enter the units consumed");
                        someFlag = true;
                        return;
                    }
                    if(billField2.getText().toString().isEmpty())
                    {
                        billField2.setError("Please enter the agency");
                        someFlag = true;
                        return;
                    }
                    if(!billId.getText().toString().contains("HY"))
                    {
                        new MaterialAlertDialogBuilder(AddNewBillActivity.this)
                                .setTitle("Invalid bill ID")
                                .setMessage("Hydro bill IDs must contain HY")
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                })
                                .show();
                        someFlag = true;
                        return;
                    }
                   /* if(!someFlag) {
                        Hydro hObj = new Hydro(billId.getText().toString(),
                                HelperMethods.getInstance().stringToDate(edtBillDateText.getText().toString()),
                                Bill.BillType.Hydro,
                                edtAgencyNameText.getText().toString(),
                                Integer.parseInt(edtUnitsUsedText.getText().toString()));
                        customerObj2.getCustomerBills().put(hObj.getBillId(), hObj);
                        Intent mIntent = new Intent(AddNewBillActivity.this, ShowBillDetailsActivity.class);
                        mIntent.putExtra("CustomerBills", customerObj2);
                        startActivity(mIntent);
                    }*/
                }
            });
        }
        else if (billType.getSelectedItem().toString() == "INTERNET") {

                billField1.setVisibility(View.VISIBLE);
                billField2.setVisibility(View.VISIBLE);
                billField1.setHint("ENTER PROVIDER NAME");
                billField2.setHint("ENTER DATA USED");
                addBill.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean someFlag = false;
                        if(billId.getText().toString().isEmpty())
                        {
                            billId.setError("Please enter the bill ID");
                            someFlag = true;
                            return;
                        }
                        if(billDate.getText().toString().isEmpty()){
                            billDate.setError("Please enter your the bill text");
                            someFlag = true;
                            return;
                        }
                        if(billField1.getText().toString().isEmpty())
                        {
                            billField1.setError("Please enter the provider name");
                            someFlag = true;
                            return;
                        }
                        if(billField2.getText().toString().isEmpty())
                        {
                            billField2.setError("Please enter the data used");
                            someFlag = true;
                            return;
                        }
                        if(!billId.getText().toString().contains("IN"))
                        {
                            new MaterialAlertDialogBuilder(AddNewBillActivity.this)
                                    .setTitle("Invalid bill ID")
                                    .setMessage("Hydro bill IDs must contain IN")
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            dialog.dismiss();
                                        }
                                    })
                                    .show();
                            someFlag = true;
                            return;
                        }
                       /* Internet iObj = new Internet   (edtBillIdText.getText().toString(),
                                Formatter.getInstance().stringToDate(edtBillDateText.getText().toString()),
                                Bill.BillType.Internet,
                                edtAgencyNameText.getText().toString(),
                                Double.parseDouble(edtUnitsUsedText.getText().toString()));
                        customerObj2.getCustomerBills().put(iObj.getBillId(),iObj);
                        customerObj2.addBill(iObj.getBillId(), iObj);
                        Intent mIntent = new Intent(AddNewBillActivity.this, ShowBillDetailsActivity.class);
                        mIntent.putExtra("CustomerBills", customerObj2);
                        startActivity(mIntent);*/
                    }
                });
        }
        else {

            billField1.setVisibility(View.VISIBLE);
            billField2.setVisibility(View.VISIBLE);
            billField3.setVisibility(View.VISIBLE);
            billField4.setVisibility(View.VISIBLE);
            billField5.setVisibility(View.VISIBLE);
            billField1.setHint("enter the manufacturer");
            billField2.setHint("enter your plan name");

            addBill.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean someFlag = false;
                    if (billId.getText().toString().isEmpty()) {
                        billId.setError("Please enter the bill ID");
                        someFlag = true;
                        return;
                    }
                    if (billDate.getText().toString().isEmpty()) {
                        billDate.setError("Please enter your the bill date");
                        someFlag = true;
                        return;
                    }
                    if (billField3.getText().toString().isEmpty()) {
                        billField3.setError("Please enter your phone number");
                        someFlag = true;
                        return;
                    }
                    if (billField5.getText().toString().isEmpty()) {
                       billField5.setError("Please enter the data used");
                        someFlag = true;
                        return;
                    }
                    if (billField4.getText().toString().isEmpty()) {
                        billField4.setError("Please enter the mins used");
                        someFlag = true;
                        return;
                    }
                    if (billField1.getText().toString().isEmpty()) {
                        billField1.setError("Please enter the manufacturer");
                        someFlag = true;
                        return;
                    }
                    if (billField2.getText().toString().isEmpty()) {
                        billField2.setError("Please enter your plan name");
                        someFlag = true;
                        return;
                    }
                    if (!Formatter.getInstance().mobileValidation(billField3.getText().toString())) {
                        billField3.setError("Invalid Phone number");
                        new MaterialAlertDialogBuilder(AddNewBillActivity.this)
                                .setTitle("Invalid phone number")
                                .setMessage("Please check the phone number you entered")
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                })
                                .show();
                        someFlag = true;
                        return;
                    }
                   /* if (!someFlag) {
                        Mobile mObj = new Mobile(edtBillIdText.getText().toString(),
                                HelperMethods.getInstance().stringToDate(edtBillDateText.getText().toString()),
                                Bill.BillType.Mobile,
                                edtManufacNameText.getText().toString(),
                                edtPlanNameText.getText().toString(),
                                edtNumberText.getText().toString(),
                                Integer.parseInt(edtDataUsedText.getText().toString()),
                                Integer.parseInt(edtMinsUsedText.getText().toString()));
                        customerObj2.getCustomerBills().put(mObj.getBillId(), mObj);
                        Intent mIntent = new Intent(AddNewBillActivity.this, ShowBillDetailsActivity.class);
                        mIntent.putExtra("CustomerBills", customerObj2);
                        startActivity(mIntent);
                    }*/

                }
            });


        }

    }



            public void hidefields()
            {
                billField1.setVisibility(View.INVISIBLE);
                billField2.setVisibility(View.INVISIBLE);
                billField3.setVisibility(View.INVISIBLE);
                billField4.setVisibility(View.INVISIBLE);
                billField5.setVisibility(View.INVISIBLE);
                billField6.setVisibility(View.INVISIBLE);
            }

}




