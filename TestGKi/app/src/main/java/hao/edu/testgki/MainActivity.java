package hao.edu.testgki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnCau1, btnCau2,btnCau3,btnCau4,btnCau5;

    public void TimDieuKhien()
    {
        btnCau1 = (Button) findViewById(R.id.btnCau1);
        btnCau2 = (Button) findViewById(R.id.btnCau2);
        btnCau3 = (Button) findViewById(R.id.btnCau3);
        btnCau4 = (Button) findViewById(R.id.btnCau4);
        btnCau5 = (Button) findViewById(R.id.btnCau5);
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
        btnCau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homie = new Intent(MainActivity.this, MainActivityMH1.class);
                startActivity(homie);
            }
        });

        btnCau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homie = new Intent(MainActivity.this, MainActivityMH2.class);
                startActivity(homie);
            }
        });
        btnCau3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homie = new Intent(MainActivity.this, MainActivityMH3.class);
                startActivity(homie);
            }
        });
        btnCau4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homie = new Intent(MainActivity.this, MainActivityMH4.class);
                startActivity(homie);
            }
        });
        btnCau5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homie = new Intent(MainActivity.this, MainActivityMH5.class);
                startActivity(homie);
            }
        });
    }


}