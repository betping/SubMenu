package com.acadgild.submenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text= (TextView) findViewById(R.id.text);
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu,menu);
        return super.onCreatePanelMenu(featureId, menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.red:
                text.setBackgroundColor(Color.RED);
                break;
            case R.id.green:
                text.setBackgroundColor(Color.GREEN);
                break;
            case R.id.blue:
                text.setBackgroundColor(Color.BLUE);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}


