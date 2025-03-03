package hao.edu.bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
    }

    void XuLy(View v)
    {
        EditText edittextso1 = findViewById(R.id.edtso1);
        EditText edittextso2 = findViewById(R.id.edtso2);

        String sothu1 = edittextso1.getText().toString();
        String sothu2 = edittextso2.getText().toString();

        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);

        float BMI = soA / (soB * soB);

        EditText edittextkq = findViewById(R.id.edtkq);

        String Ketqua = String.valueOf(BMI);

        edittextkq.setText(Ketqua);

    }
}