package hao.edu.vidu2;

import android.content.Intent;
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

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnXacNhan = (Button) findViewById(R.id.btnOK);

        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //xu ly dang nhap
                //layy du lieu
                //b1.tim tham chieu den dk
                EditText edtTenDN = (EditText) findViewById(R.id.edtUserName);
                EditText edtPass = (EditText) findViewById(R.id.edtPass);
                String tenDangNhap = edtTenDN.getText().toString();
                String mk = edtPass.getText().toString();
                //ktra mat khau
                if (tenDangNhap.equals("nguyennhathao")&& mk.equals("123"))
                {
                    Intent iQuiz = new Intent(LoginActivity.this,HomeActivity.class);
                    iQuiz.putExtra("ten_dang_nhap",tenDangNhap);
                    iQuiz.putExtra("mk_dang_nhap",mk);
                }
                else {
                    Toast.makeText(LoginActivity.this,"Wrong",Toast.LENGTH_LONG);
                }
            }
        });
    }
}