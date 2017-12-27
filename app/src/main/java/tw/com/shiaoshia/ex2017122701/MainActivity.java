package tw.com.shiaoshia.ex2017122701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View v){

        EditText ET1,ET2;
        ET1=(EditText) findViewById(R.id.editText);
        ET2=(EditText) findViewById(R.id.editText2);
        double Num1=Double.valueOf(ET1.getText().toString());
        double Num2=Double.valueOf(ET2.getText().toString());
        double Sum=add(Num1,Num2);

        TextView TV2;
        TV2=(TextView) findViewById(R.id.textView2);
        TV2.setText(String.valueOf(Sum));
    }

    public static double add(double v1, double v2)
    {
        //使用import java.math.BigDecimal;
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

}
