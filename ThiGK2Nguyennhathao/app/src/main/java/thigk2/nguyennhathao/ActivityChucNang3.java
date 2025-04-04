package thigk2.nguyennhathao;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ActivityChucNang3 extends AppCompatActivity {
    ListView listViewNNLT;
    ArrayList<String> dsNgonNguLT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        listViewNNLT = findViewById(R.id.lvNNLT);
        //b1 chuan bi du lieu
        dsNgonNguLT = new ArrayList<String>();
        dsNgonNguLT.add("Tin học đại cương");
        dsNgonNguLT.add("Lập trình Java");
        dsNgonNguLT.add("Phát triển Ứng dụng Web");
        dsNgonNguLT.add("Khai phá dữ liệu lớn");
        dsNgonNguLT.add("Kinh tế chính trị Mac-Lennin");
        dsNgonNguLT.add("...");

        //b2 adapter
        ArrayAdapter<String> adapterNNLT;
        adapterNNLT = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsNgonNguLT);

        listViewNNLT.setAdapter(adapterNNLT);

        listViewNNLT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String giatridcchon = dsNgonNguLT.get(position);

                Toast.makeText(ActivityChucNang3.this, giatridcchon, Toast.LENGTH_LONG).show();
            }
        });
    }
}