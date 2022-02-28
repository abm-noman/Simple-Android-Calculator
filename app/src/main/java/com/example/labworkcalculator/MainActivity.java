package com.example.labworkcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView primaryView, secondaryView;
    String primaryValue, operator;
    double num1, num2, result;
    private boolean last_znak;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primaryView = findViewById(R.id.primaryTextviewID);
        secondaryView = findViewById(R.id.secondaryTextviewID);
    }


    public void numberFunction(View view) {
        primaryValue = primaryView.getText().toString();

        if (view.getId() == R.id.zeroBtnID){
            if (primaryValue.equals("0")){
                primaryView.setText("0");
            }
            else {
                primaryView.setText(primaryValue+ "0");
            }

        }
        else if (view.getId() == R.id.oneBtnID){
            if (primaryValue.equals("0")){
                primaryView.setText("1");
            }
            else {
                primaryView.setText(primaryValue+ "1");
            }

        }
        else if (view.getId() == R.id.twoBtnID){
            if (primaryValue.equals("0")){
                primaryView.setText("2");
            }
            else {
                primaryView.setText(primaryValue+ "2");
            }

        }
        else if (view.getId() == R.id.threeBtnID){
            if (primaryValue.equals("0")){
                primaryView.setText("3");
            }
            else {
                primaryView.setText(primaryValue+ "3");
            }

        }
        else if (view.getId() == R.id.fourBtnID){
            if (primaryValue.equals("0")){
                primaryView.setText("4");
            }
            else {
                primaryView.setText(primaryValue+ "4");
            }

        }
        else if (view.getId() == R.id.fiveBtnID){
            if (primaryValue.equals("0")){
                primaryView.setText("5");
            }
            else {
                primaryView.setText(primaryValue+ "5");
            }

        }
        else if (view.getId() == R.id.sixBtnID){
            if (primaryValue.equals("0")){
                primaryView.setText("6");
            }
            else {
                primaryView.setText(primaryValue+ "6");
            }

        }
        else if (view.getId() == R.id.sevenBtnID){
            if (primaryValue.equals("0")){
                primaryView.setText("7");
            }
            else {
                primaryView.setText(primaryValue+ "7");
            }

        }
        else if (view.getId() == R.id.eightBtnID){
            if (primaryValue.equals("0")){
                primaryView.setText("8");
            }
            else {
                primaryView.setText(primaryValue+ "8");
            }

        }
        else if (view.getId() == R.id.nineBtnID){
            if (primaryValue.equals("0")){
                primaryView.setText("9");
            }
            else {
                primaryView.setText(primaryValue+ "9");
            }

        }

    }

    public void operatorFunction(View view) {
        primaryValue = primaryView.getText().toString();
        num1 = Double.parseDouble(primaryValue);

        if (view.getId() == R.id.additionBtnID){
            operator = "+";
        }
        else if (view.getId() == R.id.subtractBtnID){
            operator = "-";
        }
        else if (view.getId() == R.id.multiplyBtnID){
            operator = "*";
        }
        else if (view.getId() == R.id.divideBtnID) {
            operator = "/";
        }
        else if (view.getId() == R.id.plusMinusBtnID){
            operator = "+/-";
        }

        secondaryView.setText(primaryValue + operator);
        primaryView.setText("0");


    }

    public void resultFunction(View view) {

        num2 = Double.parseDouble(primaryView.getText().toString());

        if (operator.equals("+")){
            result = num1 + num2;
        }
        else if (operator.equals("-")){
            result = num1 - num2;
        }
        else if (operator.equals("*")){
            result = num1 * num2;
        }
        else if (operator.equals("/")) {
            result = num1 / num2;
        }
        else if (operator.equals("+/-")){

        }

        secondaryView.setText(""+num1+ " "+ operator +" "+num2+"=");
        primaryView.setText("" +result);



    }

    public void ClearFunction(View view) {
        primaryValue = primaryView.getText().toString();

        if (view.getId() == R.id.cBtnID){
            primaryView.setText("0");
            secondaryView.setText("");
            num1 = 0;
            num2 = 0;
            operator = "";
        }
        else if (view.getId() == R.id.ceBtnID){
            primaryView.setText("0");
        }

        else if (view.getId() == R.id.cutBtnID){
            if (primaryValue.equals("")){
                primaryView.setText("0");

            }
            else {

                String s = primaryView.getText().toString();
                s = s.substring(0, s.length() - 1);
                primaryView.setText(s);
            }
        }
    }

    public void plusMinusFunction(View view) {

        String result = primaryView.getText().toString();
        if (result.charAt(0) == '-')
            result = result.substring(1, result.length());
        else if (Double.parseDouble(result) == 0)
            result=result;
        else
            result = "-" + result;
        primaryView.setText(result);
    }

    public void percentageFunction(View view) {

        String n_text = primaryView.getText().toString();
        num2 = Double.parseDouble(n_text);

        String s_view =  n_text +"%";
        secondaryView.setText(s_view);
        primaryView.setText( String.valueOf(num2/100) );

    }

    public void squareFunction(View view) {
        String primaryValue=primaryView.getText().toString();

        secondaryView.setText("sqr ("+primaryValue+")");
        result=Double.parseDouble(primaryValue)*Double.parseDouble(primaryValue);

        primaryView.setText(""+result);
    }

    public void decimalFunction(View view) {

        String result = primaryView.getText().toString();
        if (!result.contains("."))
            result += ".";
        primaryView.setText(result);


    }

    public void rootFunction(View view) {
        String n_text = primaryView.getText().toString();
        num1 = Double.parseDouble(n_text);
        if(num1<1){
            secondaryView.setText("Error");
            primaryView.setText("0");
            return;
        }
        String s_view = "√(" + n_text + ")";
        secondaryView.setText(s_view);
        primaryView.setText( String.valueOf(Math.sqrt(num1)));
    }
}