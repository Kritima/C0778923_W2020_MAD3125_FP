package com.lambton.c0778923_w2020_mad3125_fp.ui;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.biometrics.BiometricPrompt;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.lambton.c0778923_w2020_mad3125_fp.R;

import java.util.concurrent.Executor;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText email, password;
    CheckBox rememberMe;
    TextView aboutUs;
    AlertDialog.Builder builder;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    private Executor executor;
    private BiometricPrompt biometricPrompt;
    private BiometricPrompt.PromptInfo promptInfo;
    MediaPlayer mp;
    Integer someflag = 1;

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        executor = ContextCompat.getMainExecutor(this);
        biometricPrompt = new BiometricPrompt(LoginActivity.this,
                executor, new BiometricPrompt.AuthenticationCallback() {
            @Override
            public void onAuthenticationError(int errorCode,
                                              @NonNull CharSequence errString) {
                super.onAuthenticationError(errorCode, errString);
                Toast.makeText(getApplicationContext(),
                        "Authentication error: " + errString, Toast.LENGTH_SHORT)
                        .show();
            }

            @Override
            public void onAuthenticationSucceeded(
                    @NonNull BiometricPrompt.AuthenticationResult result) {
                super.onAuthenticationSucceeded(result);
                Toast.makeText(getApplicationContext(),
                        "Authentication succeeded!", Toast.LENGTH_SHORT).show();
                successfulLogin();
            }

            @Override
            public void onAuthenticationFailed() {
                super.onAuthenticationFailed();
                invalidFinger();
            }
        });

        promptInfo = new BiometricPrompt.PromptInfo.Builder()
                .setTitle("Biometric login for my app")
                .setSubtitle("Log in using your biometric credential")
                .setNegativeButtonText("Use password")
                .build();

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        login = findViewById(R.id.buttonLogin);
        email = findViewById(R.id.editTextEmail);
        password = findViewById(R.id.editTextPassword);
        rememberMe = findViewById(R.id.checkBoxRemember);
        aboutUs = findViewById(R.id.txtAboutUs);

        builder = new AlertDialog.Builder(this);

        sharedPreferences = getSharedPreferences("LoginPrefs", MODE_PRIVATE);
        String loginprefs_username = sharedPreferences.getString("username", "");
        String loginprefs_password = sharedPreferences.getString("password","");
        email.setText(loginprefs_username);
        password.setText(loginprefs_password);
        editor = sharedPreferences.edit();

        sharedPreferences = getSharedPreferences("LoginPrefs", MODE_PRIVATE);
        String loginprefs = sharedPreferences.getString("remember", "");


            editor = sharedPreferences.edit();

        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, AboutUsActivity.class);
                startActivity(intent);
            }
        });

                    login.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (email.getText().toString().equals("admin@123") &&
                                    password.getText().toString().equals("s3cr3t")) {
                                if (rememberMe.isChecked()) {
                                    editor.putString("username", email.getText().toString());
                                    editor.putString("password", password.getText().toString());
                                    editor.apply();
                                }
                                else {
                                    editor.clear();
                                    editor.apply();
                                }
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



