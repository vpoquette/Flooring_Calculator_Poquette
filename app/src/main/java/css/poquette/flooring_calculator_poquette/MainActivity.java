package css.poquette.flooring_calculator_poquette;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MainViewModel mainViewModel;
    Button button;
    TextView length;
    TextView width;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
            // we're not really using this are we

        setUpButton(); // separating the button creation + function into another method
    }

    private void setUpButton() {
        // simple variables
        button = findViewById(R.id.showResult);
        length = findViewById(R.id.lengthInput);
        width = findViewById(R.id.widthInput);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334 Flooring", "showResult clicked");   // debug check
                Intent detailActIntent = new Intent(MainActivity.this, ResultActivity.class); // initialize the intent
                // pass data to result activity
                detailActIntent.putExtra("length", Double.parseDouble(length.getText().toString())); // no longer simple variables
                detailActIntent.putExtra("width", Double.parseDouble(width.getText().toString()));
                startActivity(detailActIntent); // move to result activity
            }
        });
    }
}