
package thias.meetsuu;

        import android.content.Intent;
        import android.support.design.widget.FloatingActionButton;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.view.View;
        import android.widget.Toast;

        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Activity> activityList = new ArrayList<>();
    private RecyclerView rv;
    private FloatingActionButton fb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        rv=findViewById(R.id.rv);
        fb=findViewById(R.id.newPost);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);
        fb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                createPost();
            }
        });

        initializeData();
        initializeAdapter();
    }



    private void initializeData(){
        //activityList = new ArrayList<>();
        activityList.add(new Activity("Anyone wanna play soccer?","If anyone is down for some soccer, we can play on the school's field. I'm thinking 4v4 or 2v2", "sport"));
        activityList.add(new Activity("Settlers of Catan","Let's play some Settlers!", "snow"));
    }

    private void addCard(){
        activityList.add(new Activity("Snowboarding","Let's go to Brian Head", "snow"));
    }

    private void initializeAdapter(){
        RecycleAdapter adapter = new RecycleAdapter(activityList);
        rv.setAdapter(adapter);
    }

    //starts new intent for creating a post
    private void createPost() {
        //initializes intent for EditPostActivity
        Intent CreatePostIntent = new Intent(this, EditPostActivity.class);
        //using startActivityForResult for getting an intent with info for new activity
        startActivityForResult(CreatePostIntent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == 1) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                //add result information to activitylist as an activity
                activityList.add(new Activity(data.getStringExtra("title"),data.getStringExtra("description"), data.getStringExtra("theme")));
                //refresh the activities
                initializeAdapter();
            }else{
                //If user cancels (most likely pressing back button) display toast
                Toast.makeText(getApplicationContext(), "Post cancelled", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
