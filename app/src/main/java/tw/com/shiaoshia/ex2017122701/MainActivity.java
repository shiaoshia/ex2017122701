package tw.com.shiaoshia.ex2017122701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
        int Num1=Integer.valueOf(ET1.getText().toString());
        int Num2=Integer.valueOf(ET2.getText().toString());
        int Sum=Num1+Num2;
        TextView TV2;
        TV2=(TextView) findViewById(R.id.textView2);
        TV2.setText(String.valueOf(Sum));
    }

}
