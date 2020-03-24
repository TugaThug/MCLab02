package my.pack.helloworld.pt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("SISE", "I'm alive");

        final Button button = findViewById(R.id.myButton);
        button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                Log.d("SISE", "Button clicked!");
                Toast.makeText(button.getContext(), "Hello", Toast.LENGTH_LONG).show();
                }
            });
        }
    }

