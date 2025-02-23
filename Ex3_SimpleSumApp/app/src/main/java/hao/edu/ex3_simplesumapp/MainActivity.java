package hao.edu.ex3_simplesumapp;

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
        //gan layout tuong ung
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void XuLyCong(View view)//lang nghe va xu li sk click len nut tinh tong
    {
        //tim , tham chieu den dieu khien xml
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKQ = findViewById(R.id.edtKQ);
        //lay du lieu ve
        String strA = editTextSoA.getText().toString(); //"2"

        String strB = editTextSoB.getText().toString(); //"4"

        //chuyen du lieu sanng dang so
        int so_A = Integer.parseInt(strA); //2
        int so_B = Integer.parseInt(strB); //4
        //tinh toan theo yeu cau
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong);
        //hien ra man hinh
        editTextKQ.setText(strTong);
    }
}