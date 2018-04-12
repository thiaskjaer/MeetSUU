
package thias.meetsuu;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;

        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Activity> activityList = new ArrayList<>();
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        rv=findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }



    private void initializeData(){
        activityList = new ArrayList<>();
        activityList.add(new Activity("Anyone wanna play soccer?","If anyone is down for some soccer, we can play on school's field. I'm thinking 4v4 or 2v2", 2));
        activityList.add(new Activity("Settles of Catan","Let's play some Settlers!", 2));
    }

    private void initializeAdapter(){
        RecycleAdapter adapter = new RecycleAdapter(activityList);
        rv.setAdapter(adapter);
    }
}
