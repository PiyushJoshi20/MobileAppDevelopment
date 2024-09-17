package com.example.mobileappdevelopment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    private EditText etPhoneNumber, etEmailAddress;
    private Button btnSubmit, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        etPhoneNumber = findViewById(R.id.et_phone_number);
        etEmailAddress = findViewById(R.id.et_email_address);
        btnSubmit = findViewById(R.id.btn_submit);
        btnBack = findViewById(R.id.btn_back);

        // Handle form submission
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = etPhoneNumber.getText().toString();
                String email = etEmailAddress.getText().toString();

                if (phone.isEmpty() || email.isEmpty()) {
                    Toast.makeText(ForgotPasswordActivity.this, "Please enter both phone number and email", Toast.LENGTH_SHORT).show();
                } else {
                    // Handle forgot password logic here (e.g., API call)
                    Toast.makeText(ForgotPasswordActivity.this, "Reset link sent!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Back button functionality
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Go back to the previous activity (Login screen)
            }
        });
    }
}
