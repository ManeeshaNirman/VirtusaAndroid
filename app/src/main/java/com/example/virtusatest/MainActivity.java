package com.example.virtusatest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private TextView txtFirstname;
    private  EditText username;
    private  Button submit;
    private RadioButton maleradio;
    private RadioButton femaleradio;
    private RadioGroup sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         txtFirstname=findViewById(R.id.txtName);
         username=findViewById(R.id.userName);
         submit=findViewById(R.id.btnSubmit);
         maleradio=findViewById(R.id.radiomale);
        femaleradio=findViewById(R.id.radiofemale);
        sex=findViewById(R.id.radioGroup);
         sex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {
                 switch (checkedId){

                     case R.id.radiomale:
                         System.out.println("Male");
                         break;
                     case R.id.radiofemale:
                         System.out.println("Female");
                         break;
                 }
             }
         });






//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                txtFirstname.setText(username.getText().toString());
//            }
//        });

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnSubmit:
                Toast.makeText(this,"Submit Clicked",Toast.LENGTH_SHORT).show();
                txtFirstname.setText(username.getText().toString());
                break;
            case R.id.txtName:
                System.out.println("TextField");
                break;

        }


    }



}