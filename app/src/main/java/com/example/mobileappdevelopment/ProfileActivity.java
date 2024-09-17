package com.example.mobileappdevelopment;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private ImageView profilePicture;
    private TextView userName, userId, department;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Employee Info button
        ImageButton btnEmployeeInfo = findViewById(R.id.btn_employee_info);
        btnEmployeeInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Employee Info Activity
                Intent intent = new Intent(ProfileActivity.this, EmployeeInfoActivity.class);
                startActivity(intent);
            }
        });

        // Attendance button
        ImageButton btnAttendance = findViewById(R.id.btn_attendance);
        btnAttendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Attendance Activity
                Intent intent = new Intent(ProfileActivity.this, AttendanceActivity.class);
                startActivity(intent);
            }
        });

        // Pay Leave button
        ImageButton btnPayLeave = findViewById(R.id.btn_pay_leave);
        btnPayLeave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to PayLeaveActivity
                Intent intent = new Intent(ProfileActivity.this, PayLeaveActivity.class);
                startActivity(intent);
            }
        });

        // Leave Slip button
        ImageButton btnLeaveSlip = findViewById(R.id.btn_leave_slip);
        btnLeaveSlip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileActivity.this, LeaveSlipActivity.class);
                startActivity(intent);
            }
        });

        // Overtime button
        ImageButton btnOvertime = findViewById(R.id.btn_overtime);
        btnOvertime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileActivity.this, OvertimeActivity.class);
                startActivity(intent);
            }
        });

        // Pay Slip button
        ImageButton btnPaySlip = findViewById(R.id.btn_pay_slip);
        btnPaySlip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileActivity.this, PaySlipActivity.class);
                startActivity(intent);
            }
        });

        // Circular button
        ImageButton btnCircular = findViewById(R.id.btn_circular);
        btnCircular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileActivity.this, CircularActivity.class);
                startActivity(intent);
            }
        });

        // Leave Approval button
        ImageButton btnLeaveApproval = findViewById(R.id.btn_leave_approval);
        btnLeaveApproval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileActivity.this, LeaveApprovalActivity.class);
                startActivity(intent);
            }
        });

        // Overtime Approval button
        ImageButton btnOvertimeApproval = findViewById(R.id.btn_overtime_approval);
        btnOvertimeApproval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileActivity.this, OvertimeApprovalActivity.class);
                startActivity(intent);
            }
        });

        // Pay Scale Approval button
        ImageButton btnPayScaleApproval = findViewById(R.id.btn_pay_scale_approval);
        btnPayScaleApproval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileActivity.this, PayScaleApprovalActivity.class);
                startActivity(intent);
            }
        });


        profilePicture = findViewById(R.id.profile_picture);
        userName = findViewById(R.id.user_name);
        userId = findViewById(R.id.user_id);
        department = findViewById(R.id.department);

        // Set profile image and information (dummy data for now)
        profilePicture.setImageResource(R.drawable.profile); // use your profile.jpg file
        userName.setText("Rahul Yewale");
        userId.setText("108");
        department.setText("Department - IT");

        // Show a toast for login success
        Toast.makeText(ProfileActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();

        // Set button click listeners
//        ImageButton btnEmployeeInfo = findViewById(R.id.btn_employee_info);
//        btnEmployeeInfo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(ProfileActivity.this, "Employee Info clicked", Toast.LENGTH_SHORT).show();
//            }
//        });

        // Repeat this for all other ImageButtons...
    }

    // Override onBackPressed to exit the app when on the home page
    @Override
    public void onBackPressed() {
        finishAffinity(); // Close the app completely
    }
}
