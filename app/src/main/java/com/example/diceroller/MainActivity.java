package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView d4Text =(TextView)findViewById(R.id.d4TextBox);
        final TextView d6Text1 =(TextView)findViewById(R.id.d6TextBox1);
        final TextView d6Text2 =(TextView)findViewById(R.id.d6TextBox2);

        final Button movementButton =  (Button)findViewById(R.id.movementButton);
        final Button eventButton =  (Button)findViewById(R.id.eventButton);


        d4Text.setVisibility(View.INVISIBLE);
        d6Text1.setVisibility(View.INVISIBLE);
        d6Text2.setVisibility(View.INVISIBLE);

        //Implement listener for your button so that when you click the
        //button, android will listen to it.

        movementButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int num = new Random().nextInt(4)+1;

                // Perform action on click'

                d6Text1.setVisibility(View.INVISIBLE);
                d6Text2.setVisibility(View.INVISIBLE);

                d4Text.setVisibility(View.VISIBLE);
                d4Text.setText(Integer.toString(num));

            }         });


        eventButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int num1 = new Random().nextInt(6)+1;
                int num2 = new Random().nextInt(6)+1;

                d4Text.setVisibility(View.INVISIBLE);

                d6Text1.setVisibility(View.VISIBLE);
                d6Text2.setVisibility(View.VISIBLE);

                d6Text1.setText(Integer.toString(num1));
                d6Text2.setText(Integer.toString(num2));


            }         });




    }
}