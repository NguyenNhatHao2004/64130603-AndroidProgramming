package hao.edu.viduloichao;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnChao;
    EditText edtTen;

    public void TimDieuKhien()
    {
        btnChao = (Button) findViewById(R.id.btnChao);
        edtTen = (EditText) findViewById(R.id.edtTen);
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
        btnChao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edtTen.getText().toString();
                Toast.makeText(MainActivity.this,"Chào\t" + data,Toast.LENGTH_LONG).show();
            }
        });
    }
}