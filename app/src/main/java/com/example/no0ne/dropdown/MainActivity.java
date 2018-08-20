package com.example.no0ne.dropdown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    String[] celebrities = {"Chris Hemsworth",
            "Jennifer Lawrence",
            "Jessica Alba",
            "Brad Pitt",
            "Tom Cruise",
            "Johnny Depp",
            "Megan Fox",
            "Paul Walker",
            "Vin Diesel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSpinner();
    }

    public void setSpinner() {
        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, celebrities);

        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int p, long id) {

                int position = spinner.getSelectedItemPosition();

                Toast.makeText(getApplicationContext(), "You have selected " + celebrities[position], Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
