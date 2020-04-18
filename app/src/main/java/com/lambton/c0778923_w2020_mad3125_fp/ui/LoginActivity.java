package com.lambton.c0778923_w2020_mad3125_fp.ui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.lambton.c0778923_w2020_mad3125_fp.R;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText email, password;
    CheckBox rememberMe;
    AlertDialog.Builder builder;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        login = findViewById(R.id.buttonLogin);
        email = findViewById(R.id.editTextEmail);
        password = findViewById(R.id.editTextPassword);
        rememberMe = findViewById(R.id.checkBoxRemember);
        builder = new AlertDialog.Builder(this);

        sharedPreferences = getSharedPreferences("LoginPrefs", MODE_PRIVATE);
        String loginprefs = sharedPreferences.getString("remember", "");
        if (loginprefs.equals("true")) {
            Intent intent = new Intent(LoginActivity.this, CustomerListActivity.class);
            startActivity(intent);
        }


            editor = sharedPreferences.edit();

            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (email.getText().toString().equals("admin@123") &&
                            password.getText().toString().equals("s3cr3t")) {

                        Intent intent = new Intent(LoginActivity.this, CustomerListActivity.class);
                        startActivity(intent);

                    } else {
                        builder.setMessage("User ID Password Invalid")
                                .setCancelable(false)
                                .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();

                                    }
                                });

                        AlertDialog alert = builder.create();
                        alert.setTitle("Error");
                        alert.show();

                    }
                }
            });

            rememberMe.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                    if (rememberMe.isChecked() && (email.getText().toString().equals("admin@123") &&
                            password.getText().toString().equals("s3cr3t"))) {
                        editor.putString("email", email.getText().toString());
                        editor.putString("password", password.getText().toString());
                        editor.apply();

                    } else {
                        editor.putString("email", "");
                        editor.putString("password", "");
                        editor.commit();
                    }
                }
            });

        }
    }



