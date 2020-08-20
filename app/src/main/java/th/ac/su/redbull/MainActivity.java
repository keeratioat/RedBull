package th.ac.su.redbull;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button calculate = findViewById(R.id.button);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editDistance = findViewById(R.id.edit_distance);
                EditText editTime = findViewById(R.id.edit_time);
                String disStr = editDistance.getText().toString();
                String timeStr = editTime.getText().toString();
                double distance = Double.parseDouble(disStr);
                double time = Double.parseDouble(timeStr);
                double velocity = calculated(distance , time);
                double velocityKm = meterToKilo(velocity);
                String str = String.valueOf(velocityKm) + " km/hr";
                Toast toast = Toast.makeText(MainActivity.this ,
                        str,
                        Toast.LENGTH_LONG);
                toast.show();
            }
        });


    }
    public double calculated(double distance , double time){
        return  distance / time ;
    }
    public double meterToKilo(double velocity){
        return  (velocity * 3600) / 1000;
    }

}