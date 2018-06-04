package com.example.paramedics.myrxjava.MVP;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.paramedics.myrxjava.MVP.Model.LoginModel;
import com.example.paramedics.myrxjava.MVP.View.LoginView;
import com.example.paramedics.myrxjava.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainMvp extends AppCompatActivity implements LoginView {

    @BindView(R.id.button)
    Button button;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.editText)
    EditText editText;
    @BindView(R.id.editTextpass)
    EditText editTextpass;

    LoginModel loginModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        loginModel = new LoginModel(this);

    }


    @OnClick(R.id.button)
    public void onButtonClick(View view) {
        Log.d("testing", "onButtonClick");

        loginModel.connectMe();

    }

    @Override
    public void success() {
        Log.d("testing", "success");
        Toast.makeText(getApplicationContext(), "success", Toast.LENGTH_LONG).show();
    }

    @Override
    public void fail() {
        Log.d("testing", "fail");
        Toast.makeText(getApplicationContext(), "fail", Toast.LENGTH_LONG).show();
    }

    @Override
    public void empty() {
        Toast.makeText(getApplicationContext(), "empty", Toast.LENGTH_LONG).show();
        Log.d("testing", "empty");
    }

    @Override
    public String getName() {
        return editText.getText().toString();
    }

    @Override
    public String getPassword() {
        return editTextpass.getText().toString();
    }
}
