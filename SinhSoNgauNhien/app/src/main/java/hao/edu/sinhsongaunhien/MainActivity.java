package hao.edu.sinhsongaunhien;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int a,b,kqdung;
    Button btnso1,btnso2,btnso3,btnso4,btnso5,btnso6,btnso7,btnso8,btnso9;
    EditText edtNumber;

    TextView tvA,tvB;

    Button btnkq;
    public void TimDieuKhien()
    {
        btnso1 = (Button) findViewById(R.id.btnso1);
        btnso2 = (Button) findViewById(R.id.btnso2);
        btnso3 = (Button) findViewById(R.id.btnso3);
        btnso4 = (Button) findViewById(R.id.btnso4);
        btnso5 = (Button) findViewById(R.id.btnso5);
        btnso6 = (Button) findViewById(R.id.btnso6);
        btnso7 = (Button) findViewById(R.id.btnso7);
        btnso8 = (Button) findViewById(R.id.btnso8);
        btnso9 = (Button) findViewById(R.id.btnso9);

        edtNumber = (EditText) findViewById(R.id.editTextNumber);

        tvA = (TextView) findViewById(R.id.tvsoA);
        tvB = (TextView) findViewById(R.id.tvsoB);

        btnkq = (Button) findViewById(R.id.btnKQ);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();
        btnso1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumber.setText("1");
            }
        });
        btnso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumber.setText("2");
            }
        });
        btnso3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumber.setText("3");
            }
        });
        btnso4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumber.setText("4");
            }
        });
        btnso5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumber.setText("5");
            }
        });
        btnso6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumber.setText("6");
            }
        });
        btnso7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumber.setText("7");
            }
        });
        btnso8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumber.setText("8");
            }
        });
        btnso9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumber.setText("9");
            }
        });

        a = (int) (Math.random()*5);
        b = (int) (Math.random()*5);
        kqdung = a+b;
        tvA.setText(String.valueOf(a));
        tvB.setText(String.valueOf(b));

        btnkq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (Integer.parseInt(edtNumber.getText().toString())== kqdung)
                {
                    Toast.makeText(MainActivity.this,"Chính xác",Toast.LENGTH_LONG).show();
                     a = (int) (Math.random()*5);
                     b = (int) (Math.random()*5);
                     kqdung = a+b;

                    tvA.setText(String.valueOf(a));
                    tvB.setText(String.valueOf(b));

                    edtNumber.getText().clear();
                }
                else {
                    Toast.makeText(MainActivity.this,"Sai rồi",Toast.LENGTH_LONG).show();

                }
            }

        });


    }
}