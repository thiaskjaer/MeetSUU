package thias.meetsuu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SendPost();
            }
        });
    }

    private void SendPost(){
        //Activity act = new Activity(titleField.getText().toString(),descField.getText().toString(), themeField.getSelectedItem().toString());
        Intent returnIntent = new Intent();
        returnIntent.putExtra("title", titleField.getText().toString());
        returnIntent.putExtra("description", descField.getText().toString());
        returnIntent.putExtra("theme", themeField.getSelectedItem().toString());
        setResult(EditPostActivity.RESULT_OK,returnIntent);
        finish();
    }

}
