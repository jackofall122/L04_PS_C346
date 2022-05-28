package sg.edu.rp.c346.id21017005.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button cfmBtn;
    EditText et;
    DatePicker dp;
    TimePicker tp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cfmBtn = findViewById(R.id.btn);
        et = (EditText) findViewById(R.id.et);
        dp = findViewById(R.id.dp);
        tp = findViewById(R.id.tp);
        tp.setIs24HourView(true);

        cfmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et.getText().toString();
                int day = dp.getDayOfMonth();
                int month = dp.getMonth()+1;
                int year = dp.getYear();

                int timeMinute = tp.getCurrentMinute();
                int timeHour = tp.getCurrentHour();

                String toastMsg = "Reservation for "+name.toUpperCase()+" on "+day+" / "+month+" / "+
                        year+" at "+timeHour+" : "+timeMinute+" confirmed";

                Toast toast = Toast.makeText(getApplicationContext(), toastMsg, Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }


}