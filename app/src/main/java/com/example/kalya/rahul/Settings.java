package com.example.kalya.rahul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Settings extends AppCompatActivity {
    EditText PhoneNumber;
    Button AddValue;
    ListView lst;
    private ArrayList<String> mUsernames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mUsernames);
        PhoneNumber = (EditText)findViewById(R.id.PhoneNumber);
        AddValue = (Button)findViewById(R.id.AddButton);
        lst = (ListView)findViewById(R.id.list);
        AddValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = PhoneNumber.getText().toString();
                if (n.length()>=10 && n.length()<=12)
                {
                    mUsernames.add(n);
                    lst.setAdapter(arrayAdapter);
                }else {
                    Toast.makeText(Settings.this,"enter a valid number",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
