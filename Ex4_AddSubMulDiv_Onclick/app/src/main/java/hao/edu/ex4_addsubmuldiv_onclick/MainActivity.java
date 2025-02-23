package hao.edu.ex4_addsubmuldiv_onclick;

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
    //khai bao doi tuong gan voi dieu khien tuong ung o day
    EditText edittextso1;
    EditText edittextso2;
    EditText edittextkq;

    Button NutCong,NutTru,NutNhan,NutChia;

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
        EditText edittextso1 =(EditText) findViewById(R.id.edtso1);
        EditText edittextso2 =(EditText) findViewById(R.id.edtso2);
        EditText edittextkq =(EditText) findViewById(R.id.edtkq);
        NutCong = (Button) findViewById(R.id.btncong);
        NutTru = (Button) findViewById(R.id.btntru);
        NutNhan = (Button) findViewById(R.id.btnnhan);
        NutChia = (Button) findViewById(R.id.btnchia);
    }
    public void XuLyCong(View v)
    {
        //code xu ly cong
        //b1 lay du lieu hia so
        //b1.1 tim edittext so 1 va

        //b1.2 lAy du lieu tu 2 dkhien do
        String Sothu1 = edittextso1.getText().toString();
        String Sothu2 = edittextso2.getText().toString();
        //b1.3 chuyen du lieu thanh so
        float soA = Float.parseFloat(Sothu1);
        float soB = Float.parseFloat(Sothu2);
        //tinh toan
        float tong = soA +soB;
        //b3 hien ket qua
        //b3.1 tim edit text kq

        //b3.2 chuan bi cdu lieu de xuat, bien thanh dang chuoi
        String ChuoiKQ = String.valueOf(tong);
        //b3.3 gan ket qua len dieu khien
        edittextkq.setText(ChuoiKQ);
    }
   public void XuLyTru(View v)
    {
        //code xu ly tru
        //code xu ly cong
        //b1 lay du lieu hia so
        //b1.1 tim edittext so 1 va 2

        //b1.2 lAy du lieu tu 2 dkhien do
        String Sothu1 = edittextso1.getText().toString();
        String Sothu2 = edittextso2.getText().toString();
        //b1.3 chuyen du lieu thanh so
        float soA = Float.parseFloat(Sothu1);
        float soB = Float.parseFloat(Sothu2);
        //tinh toan
        float tru = soA - soB;
        //b3 hien ket qua
        //b3.1 tim edit text kq

        //b3.2 chuan bi cdu lieu de xuat, bien thanh dang chuoi
        String ChuoiKQ = String.valueOf(tru);
        //b3.3 gan ket qua len dieu khien
        edittextkq.setText(ChuoiKQ);
    }
   public void XuLyNhan(View v)
    {
        //code xu ly nhan
        //code xu ly cong
        //b1 lay du lieu hia so
        //b1.1 tim edittext so 1 va 2

        //b1.2 lAy du lieu tu 2 dkhien do
        String Sothu1 = edittextso1.getText().toString();
        String Sothu2 = edittextso2.getText().toString();
        //b1.3 chuyen du lieu thanh so
        float soA = Float.parseFloat(Sothu1);
        float soB = Float.parseFloat(Sothu2);
        //tinh toan
        float nhan = soA * soB;
        //b3 hien ket qua
        //b3.1 tim edit text kq

        //b3.2 chuan bi cdu lieu de xuat, bien thanh dang chuoi
        String ChuoiKQ = String.valueOf(nhan);
        //b3.3 gan ket qua len dieu khien
        edittextkq.setText(ChuoiKQ);

    }
   public void XuLyChia(View v)
    {
        //code xu ly chia
        //code xu ly cong
        //b1 lay du lieu hia so
        //b1.1 tim edittext so 1 va 2

        //b1.2 lAy du lieu tu 2 dkhien do
        String Sothu1 = edittextso1.getText().toString();
        String Sothu2 = edittextso2.getText().toString();
        //b1.3 chuyen du lieu thanh so
        float soA = Float.parseFloat(Sothu1);
        float soB = Float.parseFloat(Sothu2);
        //tinh toan
        float chia = soA / soB;
        //b3 hien ket qua
        //b3.1 tim edit text kq

        //b3.2 chuan bi cdu lieu de xuat, bien thanh dang chuoi
        String ChuoiKQ = String.valueOf(chia);
        //b3.3 gan ket qua len dieu khien
        edittextkq.setText(ChuoiKQ);

    }
}