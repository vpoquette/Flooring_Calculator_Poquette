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

        setUpButton();
    }

    private void setUpButton() {
        button = findViewById(R.id.showResult);
        length = findViewById(R.id.lengthInput);
        width = findViewById(R.id.widthInput);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334 Flooring", "showResult clicked");   // log button click for debugging using "CIS 3334 Flooring" tag
                Intent detailActIntent = new Intent(this, ResultActivity.class);
                detailActIntent.putExtra("length", length);
                detailActIntent.putExtra("width", width);
                startActivity(detailActIntent);
                //mainViewModel.placeOrder();
            }
        });
    }
}