package com.example.lenovo.inttoword;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Scanner;

public class MainActivity extends Activity {
    int num;
  private EditText ram;
    EditText mc;
    TextView laal;
    int i;
    Button bx;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView laal = (TextView) findViewById(R.id.laal);
        bx = (Button) findViewById(R.id.maal);
        mc = (EditText) findViewById(R.id.editText4);

        //mc.setText("3");
        bx.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                String txt;
                txt = mc.getText().toString();
                num = Integer.parseInt(txt);

                int j = 0;
                int k = 0;
                int l = 0;
                int m = 0;
                int n = 0;
                int o = 0;
                int p = 0;
                int q = 0;
                String a[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
                String b[] = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
                String c[] = {"Hundred"};
                String d[] = {"(Thousand"};
                String e[] = {"Million"};
                String f[] = {"Billion"};

                if ((num >= 1) && (num < 20)) {
                    //System.out.println(a[num]);
                    laal.setText("" + a[num]);
                }

                else if ((num >= 20) && (num < 100)) {
                    i = num / 10;
                    j = num % 10;
                    // System.out.println(b[i]+" "+a[j]);
                    laal.setText(b[i] + " " + a[j]);

                } else if ((num >= 100) && (num < 1000)) {
                    i = num / 100;
                    j = num % 100;
                    if ((j >= 20) && (j < 100)) {

                        k = j / 10;
                        l = j % 10;
                    }

                    if (j < 20) {
                        l = j;
                    }

                    //System.out.println(a[i]+" "+c[0]+" "+b[k]+" "+a[l]);
                    laal.setText(a[i] + " " + c[0] + " " + b[k] + " " + a[l]);


                } else if ((num >= 1000) && (num < 10000)) {
                    i = num / 1000;
                    j = num % 1000;
                    if ((j >= 100) && (j < 1000)) {
                        m = j % 100;
                        n = j / 100;
                        if ((m >= 20) && (m < 100)) {

                            k = m / 10;
                            l = m % 10;
                        }
                        if (m < 20) {
                            l = m;
                        }
                    }
                    if ((j >= 20) && (j < 100)) {
                        {

                            k = j / 10;
                            l = j % 10;
                        }
                        if (j < 20)
                            l = j;

                        //System.out.println(a[i]+" "+d[0] +" "+ a[n]+" "+ b[k]+" "+ a[l]);
                        laal.setText(a[i] + " " + d[0] + " " + a[n] + " " + b[k] + " " + a[l]);


                    }
                    if (j < 20) {
                        l = j;
                    }
                    if ((j < 1000) && (j >= 100)) {
                        laal.setText(a[i] + " " + d[0] + " " + a[n] + " " + c[0] + " " + b[k] + " " + a[l]);
                    }
                    // System.out.println(a[i]+" "+d[0] +" "+ a[n]+" "+ c[0]+" "+ b[k]+" "+ a[l]);

                    else if ((j < 100) && (j >= 0))
                        laal.setText(a[i] + " " + d[0] + " " + a[n] + " " + b[k] + " " + a[l]);
                    //System.out.println(a[i]+" "+d[0] +" "+ a[n]+" "+ b[k]+" "+ a[l]);


                } else
                    laal.setText("Gaand marao");






            }
        });
    }



}



