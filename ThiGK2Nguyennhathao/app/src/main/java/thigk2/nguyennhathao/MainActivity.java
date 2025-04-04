package thigk2.nguyennhathao;

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

    Button btnCau1, btnCau2,btnCau3,btnCau4;

    public void TimDieuKhien()
    {
        btnCau1 = (Button) findViewById(R.id.btnmh2);
        btnCau2 = (Button) findViewById(R.id.btnmh3);
        btnCau3 = (Button) findViewById(R.id.btnmh4);
        btnCau4 = (Button) findViewById(R.id.btnmhme);
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
                Intent homie = new Intent(MainActivity.this, ActivityChucNang2.class);
                startActivity(homie);
            }
        });

        btnCau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homie = new Intent(MainActivity.this, ActivityChucNang3.class);
                startActivity(homie);
            }
        });
        btnCau3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homie = new Intent(MainActivity.this, ActivityChucNang4.class);
                startActivity(homie);
            }
        });
        btnCau4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homie = new Intent(MainActivity.this, ActivityAboutMe.class);
                startActivity(homie);
            }
        });
    }
}