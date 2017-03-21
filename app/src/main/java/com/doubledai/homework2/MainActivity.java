package com.doubledai.homework2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText etInput;
    private Button btnCacl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        etInput = (EditText) findViewById(R.id.et_input);
        btnCacl = (Button)findViewById(R.id.button);

        btnCacl.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String input_str=etInput.getText().toString();
                Toast.makeText(MainActivity.this,"Hello "+input_str,Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_about:
                AlertDialog.Builder ad = new AlertDialog.Builder(this);
                ad.setTitle("關於本程式");
                ad.setMessage("作者：戴毓辰");

                DialogInterface.OnClickListener listener =
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface di,int i){

                            }
                        };
                ad.setPositiveButton("確定",listener);
                ad.show();
                break;

        }

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Toast.makeText(MainActivity.this,"設定",Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.action_reset) {
            etInput.setText("");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
