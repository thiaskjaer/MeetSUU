package thias.meetsuu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecycleActivity extends AppCompatActivity {
    TextView description;
    TextView theme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        description = findViewById(R.id.desc);
        theme = findViewById(R.id.theme);
    }



}