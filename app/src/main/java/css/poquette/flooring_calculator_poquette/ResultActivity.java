package css.poquette.flooring_calculator_poquette;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ResultActivity extends AppCompatActivity {

    //TextView textViewDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("CIS 3334 Flooring", "moved to result activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //textViewDescription = (TextView) findViewById(R.id.textViewDescription);

        Bundle extras = getIntent().getExtras();
        Double length = extras.getDouble("length");
        Double width = extras.getDouble("width");
        //textViewDescription.setText(orderedPizza.toString());
    }
}