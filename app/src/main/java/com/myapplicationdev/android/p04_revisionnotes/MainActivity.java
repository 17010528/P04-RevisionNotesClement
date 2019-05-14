package com.myapplicationdev.android.p04_revisionnotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnInsert, btnShowList;
    EditText etRevisionNote;
    RadioGroup rg;
    ArrayList<Note> note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInsert = findViewById(R.id.buttonInsertNote);
        btnShowList = findViewById(R.id.buttonShowList);
        etRevisionNote = findViewById(R.id.editTextNote);
        rg = findViewById(R.id.radioGroupStars);
        note = new ArrayList<Note>();

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedButtonId = rg.getCheckedRadioButtonId();
                RadioButton rb = findViewById(selectedButtonId);
                int star = Integer.parseInt(rb.getText().toString());

                String text = etRevisionNote.getText().toString();
                DBHelper db = new DBHelper(MainActivity.this);
                db.insertNote(text, star);
                db.close();
                Toast.makeText(MainActivity.this , "Data Inserted" , Toast.LENGTH_LONG).show();

            }
        });

        btnShowList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this , SecondActivity.class);
                startActivity(i);
                // Insert a task


                // Link this Activity object, the row.xml layout for
                //  each row and the food String array together


            }
        });

    }
}
