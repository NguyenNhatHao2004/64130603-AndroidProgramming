package hao.edu.ex5_addsubmuldiv_anynomous;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
//khai bao cac doi tuong gan voi dieu khien tuong ung o day
    EditText edittextso1;
    EditText edittextso2;
    EditText edittextkq;
    Button nutcong,nuttru,nutnhan,nutchia;
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
    }
    void TimDieuKhien()
    {
        edittextso1 = (EditText) findViewById(R.id.edtso1);
        edittextso2 = (EditText) findViewById(R.id.edtso2);
        edittextkq = (EditText) findViewById(R.id.edtkq);
        nutcong = (Button) findViewById(R.id.btncong);
        nuttru = (Button) findViewById(R.id.btntru);
        nutnhan = (Button) findViewById(R.id.btnnhan);
        nutchia = (Button) findViewById(R.id.btnchia);

    }

    void XuLyCong(View v)
    {

        String sothu1 = edittextso1.getText().toString();
        String sothu2 = edittextso2.getText().toString();

        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);

        float tong = soA + soB;

        String chuoiKQ = String.valueOf(tong);
        edittextkq.setText(chuoiKQ);


    }

    void XuLyTru(View v)
    {



        String sothu1 = edittextso1.getText().toString();
        String sothu2 = edittextso2.getText().toString();

        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);

        float hieu = soA - soB;

        String chuoiKQ = String.valueOf(hieu);
        edittextkq.setText(chuoiKQ);
    }
    void XuLyNhan(View v)
    {


        String sothu1 = edittextso1.getText().toString();
        String sothu2 = edittextso2.getText().toString();

        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);

        float tich = soA * soB;

        String chuoiKQ = String.valueOf(tich);
        edittextkq.setText(chuoiKQ);
    }
    void XuLyChia(View v)
    {



        String sothu1 = edittextso1.getText().toString();
        String sothu2 = edittextso2.getText().toString();

        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);

        float thuong = soA / soB;

        String chuoiKQ = String.valueOf(thuong);
        edittextkq.setText(chuoiKQ);
    }
}