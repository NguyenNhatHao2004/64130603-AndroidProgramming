package hao.edu.testlistview25_3;

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

public class MainActivity extends AppCompatActivity {
    ListView LVMMT;
    ArrayList<String> dsLV;

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

        LVMMT = findViewById(R.id.LVMMT);
        dsLV =  new ArrayList<String>();
        dsLV.add("Hoa Thúi Địt");
        dsLV.add("Hoa Cứt Lợn");
        dsLV.add("Hoa Sữa");
        dsLV.add("Quả nhàu");

        ArrayAdapter<String> adapterMMT;
        adapterMMT = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsLV);

        LVMMT.setAdapter(adapterMMT);
        LVMMT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String giattri = dsLV.get(position);
                Toast.makeText(MainActivity.this, giattri, Toast.LENGTH_LONG).show();
            }
        });

    }
}