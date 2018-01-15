package com.example.student.kolokwium_pycia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }
@OnClick(R.id.zamow)
    void OnClick()
{
    Intent intent =new Intent(this, Main2Activity.class);
    StartActivity(intent);


}

    private void StartActivity(Intent intent) {
    }
}
