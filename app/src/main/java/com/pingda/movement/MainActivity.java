package com.pingda.movement;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button down_button = (Button) findViewById(R.id.down_button);
        Button up_button = (Button) findViewById(R.id.up_button);
        Button left_button = (Button) findViewById(R.id.down_button);
        Button right_button = (Button) findViewById(R.id.up_button);

        down_button.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView text_test =
                                (TextView)findViewById(R.id.text_test);
                        text_test.setText("Button clicked");
                    }
                }
        );

        down_button.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        TextView text_test =
                                (TextView)findViewById(R.id.text_test);
                        text_test.setText("Long button click");
                        return true;
                    }
                }
        );

        up_button.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView text_test =
                                (TextView)findViewById(R.id.text_test);
                        text_test.setText("Button clicked");
                    }
                }
        );

        up_button.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        TextView text_test =
                                (TextView)findViewById(R.id.text_test);
                        text_test.setText("Long button click");
                        return true;
                    }
                }
        );
        
        left_button.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView text_test =
                                (TextView)findViewById(R.id.text_test);
                        text_test.setText("Button clicked");
                    }
                }
        );

        left_button.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        TextView text_test =
                                (TextView)findViewById(R.id.text_test);
                        text_test.setText("Long button click");
                        return true;
                    }
                }
        );
        
        right_button.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView text_test =
                                (TextView)findViewById(R.id.text_test);
                        text_test.setText("Button clicked");
                    }
                }
        );

        right_button.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        TextView text_test =
                                (TextView)findViewById(R.id.text_test);
                        text_test.setText("Long button click");
                        return true;
                    }
                }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
