package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnSPM;
    private Button btnOlevel;
    private Button btnUEC;
    private Button btnCheck;
    private TextView textReq;

    public static final String EXTRA_MESSAGE
            = "com.example.myapplication.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSPM=(Button)findViewById(R.id.buttonSPM);
        btnOlevel=(Button)findViewById(R.id.buttonOlevel);
        btnUEC=(Button)findViewById(R.id.buttonUEC);
        textReq=(TextView)findViewById(R.id.textReq);

        btnCheck = (Button)findViewById(R.id.button3);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onClickUEC(View view) {

        textReq.setText("At least 5 Grade C in the relevant subjects, and\n" +
                "At least Grade C in English Language and Bahasa Malaysia, and\n" +
                "At least Grade B in Mathematics");
    }

    public void onClickSPM(View view) {
        textReq.setText("At least 5 Grade C in the relevant subjects, and \n" +
                "At least C in English Language, and\n" +
                "At least Grade C in Mathematics");
    }

    public void onClickOlevel(View view) {
        textReq.setText("At least 3 Grade B, and" +
                "At least Grade C in English, and\n" +
                "At least Grade B in Mathematics");
    }
}
