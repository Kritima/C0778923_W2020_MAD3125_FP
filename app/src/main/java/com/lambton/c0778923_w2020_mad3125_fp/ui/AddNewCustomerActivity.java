package com.lambton.c0778923_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;
import com.lambton.c0778923_w2020_mad3125_fp.R;
import com.lambton.c0778923_w2020_mad3125_fp.adapters.CustomerAdapter;
import com.lambton.c0778923_w2020_mad3125_fp.models.Customer;

import java.util.ArrayList;

public class AddNewCustomerActivity extends AppCompatActivity {

    private ArrayList<Customer> customerNewListArrayList;
    Customer c = new Customer();
    private CustomerAdapter customerAdapter;

    Spinner suffix;
    TextInputEditText firstName;
    TextInputEditText lastName;
    RadioGroup gender;
    RadioButton male;
    RadioButton female;
    RadioButton other;
    TextInputEditText address;
    TextInputEditText city;
    TextInputEditText province;
    TextInputEditText postalCode;
    TextInputEditText email;
    Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_customer);

        suffix = findViewById(R.id.spinnerSuffix);
        firstName = findViewById(R.id.firstNameTextInputEditText);
        lastName = findViewById(R.id.lastNameTextInputEditText);
        gender = findViewById(R.id.radioGroupGender);
        male = findViewById(R.id.radioButtonMale);
        female = findViewById(R.id.radioButtonFemale);
        other = findViewById(R.id.radioButtonOther);
        address = findViewById(R.id.AddressTextInputEditText);
        city = findViewById(R.id.CityTextInputEditText);
        province = findViewById(R.id.ProvinceTextInputEditText);
        postalCode = findViewById(R.id.PostalCodeTextInputEditText);
        email = findViewById(R.id.EmailTextInputEditText);
        add = findViewById(R.id.btnAddCustomer);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });


    }
}
