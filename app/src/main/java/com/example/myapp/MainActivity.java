package com.example.myapp;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Typeface;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener{

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnC,btnCe,btnDot;
    TextView txt1,txt2;
    int txt1Selected = 1;
    int txt2Selected = 0;
    double value1;
    double value2;
    double op1;
    double op2;

    List<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnC = (Button) findViewById(R.id.btnC);
        btnCe = (Button) findViewById(R.id.btnCe);
        btnDot = (Button) findViewById(R.id.btnDot);


        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);

        items = new ArrayList<Item>();



        items.add(new Item("VIET NAM - DONG",1));
        items.add(new Item("HOA KY - Đô",23435));
        items.add(new Item("Đồng bảng anh",29181));
        items.add(new Item("Euro",25626));
        items.add(new Item("Úc",14881));

        value1 = items.get(0).getValue();
        value2 = items.get(0).getValue();


        Spinner spin1 = (Spinner) findViewById(R.id.spinner1);

        Spinner spin2 = (Spinner) findViewById(R.id.spinner2);


        ArrayAdapter<Item> adapter = new ArrayAdapter<Item>(
                this, android.R.layout.simple_spinner_item, items);


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spin1.setAdapter(adapter);
        spin2.setAdapter(adapter);

        spin1.setOnItemSelectedListener(this);
        spin2.setOnItemSelectedListener(this);

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                value1 = items.get(i).getValue();
                txt2.setText(String.valueOf((Double)op1*value1/value2));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                value2 = items.get(i).getValue();
                txt2.setText(String.valueOf((Double)op1*value1/value2));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setTypeface(null, Typeface.BOLD);
                txt2.setTypeface(null, Typeface.NORMAL);
                txt1Selected=1;
                txt2Selected = 0;
                txt1.setText("0");
            }
        });
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.setTypeface(null, Typeface.BOLD);
                txt1.setTypeface(null, Typeface.NORMAL);
                txt1Selected=0;
                txt2Selected = 1;
                txt2.setText("0");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if(txt1Selected == 1) {
                  op1= Double.parseDouble((String) txt1.getText()) * 10 +0;
                  txt1.setText(String.valueOf(op1));
                  txt2.setText(String.valueOf((Double)op1*value1/value2));
              }else {
                  op2= Double.parseDouble((String) txt2.getText()) * 10 +0;
                  txt2.setText(String.valueOf(op2));
                  txt1.setText(String.valueOf((Double)op2*value2/value1));
              }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1Selected == 1){
                    op1= Double.parseDouble((String) txt1.getText()) * 10 +1;
                    txt1.setText(String.valueOf(op1));
                    txt2.setText(String.valueOf((Double)op1*value1/value2));
                }else {
                    op2= Double.parseDouble((String) txt2.getText()) * 10 +1;
                    txt2.setText(String.valueOf(op2));
                    txt1.setText(String.valueOf((Double)op2*value2/value1));
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1Selected == 1){
                    op1= Double.parseDouble((String) txt1.getText()) * 10 +2;
                    txt1.setText(String.valueOf(op1));
                    txt2.setText(String.valueOf((Double)op1*value1/value2));
                }else {
                    op2= Double.parseDouble((String) txt2.getText()) * 10 +2;
                    txt2.setText(String.valueOf(op2));
                    txt1.setText(String.valueOf((Double)op2*value2/value1));
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1Selected == 1){
                    op1= Double.parseDouble((String) txt1.getText()) * 10 +3;
                    txt1.setText(String.valueOf(op1));
                    txt2.setText(String.valueOf((Double)op1*value1/value2));
                }else {
                    op2= Double.parseDouble((String) txt2.getText()) * 10 +3;
                    txt2.setText(String.valueOf(op2));
                    txt1.setText(String.valueOf((Double)op2*value2/value1));
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1Selected == 1){
                    op1= Double.parseDouble((String) txt1.getText()) * 10 +4;
                    txt1.setText(String.valueOf(op1));
                    txt2.setText(String.valueOf((Double)op1*value1/value2));
                }else {
                    op2= Double.parseDouble((String) txt2.getText()) * 10 +4;
                    txt2.setText(String.valueOf(op2));
                    txt1.setText(String.valueOf((Double)op2*value2/value1));
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1Selected == 1){
                    op1= Double.parseDouble((String) txt1.getText()) * 10 +5;
                    txt1.setText(String.valueOf(op1));
                    txt2.setText(String.valueOf((Double)op1*value1/value2));
                }else {
                    op2= Double.parseDouble((String) txt2.getText()) * 10 +5;
                    txt2.setText(String.valueOf(op2));
                    txt1.setText(String.valueOf((Double)op2*value2/value1));
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1Selected == 1){
                    op1= Double.parseDouble((String) txt1.getText()) * 10 +6;
                    txt1.setText(String.valueOf(op1));
                    txt2.setText(String.valueOf((Double)op1*value1/value2));
                }else {
                    op2= Double.parseDouble((String) txt2.getText()) * 10 +6;
                    txt2.setText(String.valueOf(op2));
                    txt1.setText(String.valueOf((Double)op2*value2/value1));
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1Selected == 1){
                    op1= Double.parseDouble((String) txt1.getText()) * 10 +7;
                    txt1.setText(String.valueOf(op1));
                    txt2.setText(String.valueOf((Double)op1*value1/value2));
                }else {
                    op2= Double.parseDouble((String) txt2.getText()) * 10 +7;
                    txt2.setText(String.valueOf(op2));
                    txt1.setText(String.valueOf((Double)op2*value2/value1));
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1Selected == 1){
                    op1= Double.parseDouble((String) txt1.getText()) * 10 +8;
                    txt1.setText(String.valueOf(op1));
                    txt2.setText(String.valueOf((Double)op1*value1/value2));
                }else {
                    op2= Double.parseDouble((String) txt2.getText()) * 10 +8;
                    txt2.setText(String.valueOf(op2));
                    txt1.setText(String.valueOf((Double)op2*value2/value1));
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1Selected == 1){
                    op1= Double.parseDouble((String) txt1.getText()) * 10 +9;
                    txt1.setText(String.valueOf(op1));
                    txt2.setText(String.valueOf((Double)op1*value1/value2));
                }else {
                    op2= Double.parseDouble((String) txt2.getText()) * 10 +9;
                    txt2.setText(String.valueOf(op2));
                    txt1.setText(String.valueOf((Double)op2*value2/value1));
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1Selected == 1){
                    op1=(int) (Double.parseDouble((String) txt1.getText())/10);
                    txt1.setText(String.valueOf(op1));
                    txt2.setText(String.valueOf((Double)op1*value1/value2));
                }else {
                    op2= (int)Double.parseDouble((String) txt2.getText())/10;
                    txt2.setText(String.valueOf(op2));
                    txt1.setText(String.valueOf((Double)op2*value2/value1));
                }
            }
        });
        btnCe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1Selected = 1;
                txt2Selected = 0;
                op1 = 0;
                op2 = 0;
                txt1.setText("0");
                txt2.setText("0");
            }
        });

    }



    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
