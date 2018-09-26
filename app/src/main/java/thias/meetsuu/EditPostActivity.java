package thias.meetsuu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class EditPostActivity extends AppCompatActivity {
    private TextView titleField, descField;
    private Spinner themeField;
    private Button postButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_post);
        titleField = findViewById(R.id.titleField);
        descField = findViewById(R.id.descField);
        themeField = findViewById(R.id.themeField);
        postButton = findViewById(R.id.postButton);
    }

}
