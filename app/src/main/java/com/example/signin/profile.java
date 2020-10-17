package com.example.signin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class profile extends AppCompatActivity {
    private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        textview = findViewById(R.id.logout);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });
        BottomNavigationView bottomNavigationView = findViewById(R.id.main_nav);
        bottomNavigationView.setSelectedItemId(R.id.profile_);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home_:
                        startActivity(new Intent(getApplicationContext(),signin.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.customlist_:
                        startActivity(new Intent(getApplicationContext(),customlist.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profile_:
                        return true;
                    default:  return false;
                }
            }
        });
    }
    public void logout(){
        Intent intent= new Intent(this,signin.class);
        startActivity(intent) ;
    }
}