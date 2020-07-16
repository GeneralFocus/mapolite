package com.capriquota.mapolite.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import com.capriquota.mapolite.R;

public class HomeActivity extends AppCompatActivity{

    private CardView returning_student, belated_payments, fresh_students, school_fees, updates, lms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        returning_student = findViewById(R.id.returning_student);
        belated_payments = findViewById(R.id.belated_payment);
        fresh_students = findViewById(R.id.fresh_students);
        school_fees = findViewById(R.id.school_fees);
        updates = findViewById(R.id.updates);
        lms = findViewById(R.id.lms);

        returning_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ReturningStudentActivity.class);
                startActivity(intent);
            }
        });

        belated_payments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, BelatedPaymentActivity.class);
                startActivity(intent);
            }
        });

        fresh_students.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, FreshStudentActivity.class);
                startActivity(intent);
            }
        });

        school_fees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SchoolFeesActivity.class);
                startActivity(intent);
            }
        });

        updates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, updatesActivity.class);
                startActivity(intent);
            }
        });

        lms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LMS.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
