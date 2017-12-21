package ojasvi.com.task4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

         TextView textViewone = (TextView)findViewById(R.id.textView_1);
         TextView textViewtwo = (TextView)findViewById(R.id.textView_2);



        textViewone.setText(getIntent().getStringExtra("MOVIE NAME"));
        textViewtwo.setText(getIntent().getStringExtra("MOVIE THEATRE"));
    }
}
