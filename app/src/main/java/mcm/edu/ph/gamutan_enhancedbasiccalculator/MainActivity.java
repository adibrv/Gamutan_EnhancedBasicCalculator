package mcm.edu.ph.gamutan_enhancedbasiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd, btnSub, btnDiv, btnMul, btnMod;


        btnAdd = findViewById(R.id.btnAddition);
        btnSub = findViewById(R.id.btnSubtraction);
        btnDiv = findViewById(R.id.btnDivision);
        btnMul = findViewById(R.id.btnMultiplication);
        btnMod = findViewById(R.id.btnModulo);



        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnMod.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        EditText txtOperand1, txtOperand2;
        TextView txtAnswer;

        txtOperand1 = findViewById(R.id.txtOperand1);
        txtOperand2 = findViewById(R.id.txtOperand2);
        txtAnswer = findViewById(R.id.txtAnswer);

        Double op1 = 0.0;
        Double op2 = 0.0;

        op1 = Double.parseDouble(txtOperand1.getText().toString());
        op2 = Double.parseDouble(txtOperand2.getText().toString());

        switch(v.getId()) {
            case R.id.btnAddition:
                txtAnswer.setText(Double.toString(doAddition(op1,op2)));
                break;
            case R.id.btnSubtraction:
                txtAnswer.setText(Double.toString(doSubtraction(op1,op2)));
                break;
            case R.id.btnDivision:
                txtAnswer.setText(Double.toString(doDivision(op1,op2)));
                break;
            case R.id.btnMultiplication:
                txtAnswer.setText(Double.toString(doMultiplication(op1,op2)));
                break;
            case R.id.btnModulo:
                txtAnswer.setText(Double.toString(doModulo(op1,op2)));
                break;
        }
    }

    public static double doAddition(double op1, double op2){
        return op1 + op2;
    }

    public static double doDivision(double op1, double op2){
        return op1 / op2;
    }

    public static double doMultiplication(double op1, double op2){
        return op1 * op2;
    }

    public static double doSubtraction(double op1, double op2){
        return op1 - op2;
    }

    public static double doModulo(double op1, double op2){
        return op1 % op2;
    }


    

}