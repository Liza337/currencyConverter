package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    Button btnClear, btnCalculate;
    EditText edtInput;
    RadioButton rdUSDToBDT,rdBDTToUSD,rdINRToUSD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btnCalculate =findViewById(R.id.btnCalculate);
       btnClear =findViewById(R.id.btnClear);
       edtInput=findViewById(R.id.edtInput);
       rdUSDToBDT=findViewById(R.id.rdUSDToBDT);
        rdBDTToUSD=findViewById(R.id.rdBDTToUSD);
        rdINRToUSD=findViewById(R.id.rdINRToUSD);


       btnCalculate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Double input=new Double(edtInput.getText().toString());
               if(rdBDTToUSD.isChecked()){
                   double result=CovertCurrency.BdtUSD(input);
                   edtInput.setText(new Double(result).toString());
               }
               else if(rdUSDToBDT.isChecked()){
                   double result=CovertCurrency.usdBDT(input);
                   edtInput.setText(new Double(result).toString());
               }
               else if(rdINRToUSD.isChecked())
               {
                   double result=CovertCurrency.InrUSD(input);
                   edtInput.setText(new Double(result).toString());
               }
           }
       });

    }
}