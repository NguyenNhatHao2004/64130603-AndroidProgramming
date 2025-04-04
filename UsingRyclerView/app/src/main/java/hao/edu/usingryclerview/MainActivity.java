package hao.edu.usingryclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> RecyclerViewDatas;
    RecyclerView recyclerViewLandscape;



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
        RecyclerViewDatas = getDataForRecylerView();

        recyclerViewLandscape = findViewById(R.id.recyclerLand);

        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandscape.setLayoutManager(layoutLinear);
        landScapeAdapter = new LandScapeAdapter(this, RecyclerViewDatas);
        recyclerViewLandscape.setAdapter(landScapeAdapter);
    }
     ArrayList<LandScape> getDataForRecylerView()
    {
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        //dsDuLieu.add(new LandScape("z5293328518459_003_44dba3aa3d71a90524837e18fe3e9b80.jpg","Pháo bông"));
        dsDuLieu.add(new LandScape("ca_phe_sua.jpg","cà phê sữa"));
        dsDuLieu.add(new LandScape("capuchino.jpg","capuchino"));
        return dsDuLieu;
    }
}