package ojasvi.com.task4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ojasvi.com.task4.Main2Activity;
import ojasvi.com.task4.R;

public class MainActivity extends AppCompatActivity {

    public Button button_1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextone = (EditText)findViewById(R.id.editText_1);
        final EditText editTexttwo = (EditText)findViewById(R.id.editText_2);

        button_1 = (Button)findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name1 = editTextone.getText().toString();
                String name2 = editTexttwo.getText().toString();
                Intent one = new Intent(MainActivity.this,Main2Activity.class);

                one.putExtra("MOVIE NAME", name1);
                one.putExtra("MOVIE THEATRE",name2);
                startActivity(one);
            }
        });



    }
}
