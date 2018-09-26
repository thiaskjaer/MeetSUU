package thias.meetsuu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class EditPostActivity extends AppCompatActivity {
    private TextView titleField, descField;
    private Spinner themeField;
    private Button postButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_post);
        //setup activity elements
        titleField = findViewById(R.id.titleField);
        descField = findViewById(R.id.descField);
        themeField = findViewById(R.id.themeField);
        postButton = findViewById(R.id.postButton);
        //add setOnClickListener to post button which posts data to MainActivity
        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SendPost();
            }
        });
    }

    //bundles intent with data from fields and sends to MainActivity
    private void SendPost(){
        //If the user did not enter information, display toast
        if(titleField.getText().toString().equals("") || descField.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Please fill out all fields", Toast.LENGTH_SHORT).show();

        }else{
            Intent returnIntent = new Intent();
            //if text was entered, bundle and pass
            returnIntent.putExtra("title", titleField.getText().toString());
            returnIntent.putExtra("description", descField.getText().toString());
            returnIntent.putExtra("theme", themeField.getSelectedItem().toString());
            //bundles field data and confirmation that intent was successful
            setResult(EditPostActivity.RESULT_OK,returnIntent);
            finish();
        }

    }

}
