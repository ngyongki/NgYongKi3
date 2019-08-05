package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private EditText chk1;
    private EditText chk2;
    private EditText chk3;
    private EditText chk4;
    private RadioGroup radioGroup;
    private Button btnChk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        chk1 = (EditText)findViewById(R.id.editText);
        chk2 = (EditText)findViewById(R.id.editText2);
        chk3 = (EditText)findViewById(R.id.editText3);
        chk4 = (EditText)findViewById(R.id.editText4);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);

    }

    public void onClickChk(View view) {
        int selectedId=radioGroup.getCheckedRadioButtonId();


        if (selectedId == 0) {
            if (chk1.getText().toString() == "5") {
                if (chk2.getText().toString() == "C") {
                    if (chk3.getText().toString() == "C") {
                        if (chk4.getText().toString() == "B")
                            Toast.makeText(getApplicationContext(), "You Are qualitified!", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(getApplicationContext(), "You Are Not qualitified!", Toast.LENGTH_LONG).show();
                    }
                    else
                        Toast.makeText(getApplicationContext(), "You Are Not qualitified!", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(getApplicationContext(), "You Are Not qualitified!", Toast.LENGTH_LONG).show();
            }
            else if (chk1.getText().toString() == "4")
                Toast.makeText(getApplicationContext(), "You may consider Perak, Johor, Pahang and Sabah branch.", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(getApplicationContext(), "You Are Not qualitified!", Toast.LENGTH_LONG).show();
        }

        else if (selectedId == 1) {
            if (chk1.getText().toString() == "5") {
                if (chk2.getText().toString() == "C") {
                    if (chk4.getText().toString() == "C")
                        Toast.makeText(getApplicationContext(), "You Are qualitified!", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(getApplicationContext(), "You Are Not qualitified!", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(getApplicationContext(), "You Are Not qualitified!", Toast.LENGTH_LONG).show();
            }
            else
                Toast.makeText(getApplicationContext(), "You Are Not qualitified!", Toast.LENGTH_LONG).show();
        }

        else {
            if (chk1.getText().toString() == "3") {
                if (chk2.getText().toString() == "C") {
                    if (chk4.getText().toString() == "B")
                        Toast.makeText(getApplicationContext(), "You Are qualitified!", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(getApplicationContext(), "You Are Not qualitified!", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(getApplicationContext(), "You Are Not qualitified!", Toast.LENGTH_LONG).show();
            }
            else
                Toast.makeText(getApplicationContext(), "You Are Not qualitified!", Toast.LENGTH_LONG).show();

        }

    }
}
