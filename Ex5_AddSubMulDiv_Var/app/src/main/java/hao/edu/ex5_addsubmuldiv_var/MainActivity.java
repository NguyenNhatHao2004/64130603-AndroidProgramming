package hao.edu.ex5_addsubmuldiv_var;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
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
        TimView();
        btncong.setOnClickListener(bolangnghevaxulycong);
        btntru.setOnClickListener(bolangnghevaxulytru);
        btnnhan.setOnClickListener(bolangnghevaxulynhan);
        btnchia.setOnClickListener(bolangnghevaxulychia);

    }

    void TimView()
    {
        edtA = (EditText) findViewById(R.id.edta);
        edtB = (EditText) findViewById(R.id.edtb);
        btncong = (Button) findViewById(R.id.button);
        btntru =(Button) findViewById(R.id.button2);
        btnnhan = (Button) findViewById(R.id.button3);
        btnchia =(Button) findViewById(R.id.button4);
    }
    //.....//
    //tao bo lang nghe
    View.OnClickListener bolangnghevaxulycong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //code xu ly cong o day
            String strso1 = edtA.getText().toString();
            String strso2 = edtB.getText().toString();

            double soA = Double.parseDouble(strso1);
            double soB = Double.parseDouble(strso2);

            double tong = soA + soB;

            String strkq = String.valueOf(tong);

            edtKQ.setText(strkq);
        }
    };

    View.OnClickListener bolangnghevaxulytru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //code xu ly cong o day
            String strso1 = edtA.getText().toString();
            String strso2 = edtB.getText().toString();

            double soA = Double.parseDouble(strso1);
            double soB = Double.parseDouble(strso2);

            double tru = soA - soB;

            String strkq = String.valueOf(tru);

            edtKQ.setText(strkq);
        }
    };

    View.OnClickListener bolangnghevaxulynhan= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //code xu ly cong o day
            String strso1 = edtA.getText().toString();
            String strso2 = edtB.getText().toString();

            double soA = Double.parseDouble(strso1);
            double soB = Double.parseDouble(strso2);

            double tich = soA * soB;

            String strkq = String.valueOf(tich);

            edtKQ.setText(strkq);
        }
    };

    View.OnClickListener bolangnghevaxulychia = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //code xu ly cong o day
            String strso1 = edtA.getText().toString();
            String strso2 = edtB.getText().toString();

            double soA = Double.parseDouble(strso1);
            double soB = Double.parseDouble(strso2);

            double thuong = soA / soB;

            String strkq = String.valueOf(thuong);

            edtKQ.setText(strkq);
        }
    };
    //.....//

    //khai bao cac doi tuong các dieu khien
    EditText edtA;
    EditText edtB;
    Button btncong, btntru, btnnhan,btnchia;

    TextView edtKQ;

}