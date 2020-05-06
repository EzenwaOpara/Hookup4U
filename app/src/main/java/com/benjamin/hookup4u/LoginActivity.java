package com.benjamin.hookup4u;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void verifyPhone(View view) {
        Intent intent = new Intent(this, VerifyPhoneActivity.class);
        startActivity(intent);
    }
}
