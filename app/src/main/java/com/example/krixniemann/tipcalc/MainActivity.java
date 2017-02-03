package com.example.krixniemann.tipcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTotalTip;
    EditText billAmnt;
    EditText editTextNumberParty;
    TextView textViewTipPP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        billAmnt = (EditText) findViewById(R.id.billamountedit);
        textViewTipPP = (TextView) findViewById(R.id.textViewTipPP);
        editTextNumberParty = (EditText) findViewById(R.id.ppinpartyedit);
        tvTotalTip = (TextView) findViewById(R.id.tvTotalTip);


    }
    public void onClickbuttonCalc(View view) {
       double num = Double.parseDouble(billAmnt.getText().toString());
        double num2 = Double.parseDouble(editTextNumberParty.getText().toString());
        double tip = num * .1;

        tvTotalTip.setText("Total tip amount:" + tip);
    }

}
