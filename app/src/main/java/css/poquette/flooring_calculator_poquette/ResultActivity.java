package css.poquette.flooring_calculator_poquette;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView lengthResult;
    TextView widthResult;
    TextView areaResult;
    Button returnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("CIS 3334 Flooring", "moved to result activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // connect to UI elements
        lengthResult = (TextView) findViewById(R.id.lengthResult);
        widthResult = (TextView) findViewById(R.id.widthResult);
        areaResult = (TextView) findViewById(R.id.areaResult);

        Bundle extras = getIntent().getExtras(); // retrieve all passed variables
        // retrieve specific values
        Double length = extras.getDouble("length");
        Double width = extras.getDouble("width");
        Double area = (length * width); // calculate area

        // display values
        lengthResult.setText(length.toString());
        widthResult.setText(width.toString());
        areaResult.setText(area.toString());

        setUpButton(); // self-explanatory method
    }

    private void setUpButton() {
        returnHome = findViewById(R.id.returnHome);
        returnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334 Flooring", "newCalculation clicked"); // debug tag
                finish(); // delete current activity and return to initial screen
                    // beats the alternative of painting over the current activity amirite
            }
        });
    }
}