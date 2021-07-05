package com.example.anushmp.sprinteval;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button createAccount;
    private Button SignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createAccount = findViewById(R.id.btn_create_account);
        SignIn = findViewById(R.id.btn_sign_in);


    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btn_create_account){

            Intent takemetocreateaccount = new Intent(MainActivity.this, SignUpActivity.class);
            startActivity(takemetocreateaccount);

        }

        if(v.getId() == R.id.btn_sign_in){

            Intent takemetosignin = new Intent(MainActivity.this, SignInActivity.class);
            startActivity(takemetosignin);

        }


    }
}