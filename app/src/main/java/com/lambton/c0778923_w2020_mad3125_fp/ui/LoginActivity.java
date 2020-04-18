package com.lambton.c0778923_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
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
    EditText email,password;
    CheckBox rememberMe;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.buttonLogin);
        email = findViewById(R.id.editTextEmail);
        password = findViewById(R.id.editTextPassword);
        rememberMe = findViewById(R.id.checkBoxRemember);
    }
}




        builder = new AlertDialog.Builder(this);

        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
                if(b)
                {
                    Toast.makeText(FirstActivity.this, "ON", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(FirstActivity.this, "OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ed1.getText().toString().equals("admin@123") &&
                        ed2.getText().toString().equals("s3cr3t")) {
                    Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("userName", "Kritima Kukreja");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }else{

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
    }
}

