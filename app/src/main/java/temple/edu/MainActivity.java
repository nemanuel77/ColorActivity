package temple.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;


//how could I have done this with an arraylist?
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button colorButton;
    Spinner spinner;



    //ArrayList<String> colors;
    String[] colorTest;
    View myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorButton = findViewById(R.id.btnChangeColor);
        spinner = findViewById(R.id.spinnerColorWheel);
        myView = findViewById(R.id.defaultLayout);

        //this is probably overkill.
        //grab list of colors from pre-defined resource
        colorTest = getResources().getStringArray(R.array.spinner_colors);

        //initialize ColorAdapter and set spinner contents to Adapter's resources
        ColorAdapter colorAdapter = new ColorAdapter(this, colorTest);
        spinner.setAdapter(colorAdapter);



        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //set a variable to spinner value
                String text = spinner.getSelectedItem().toString();
                Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
                toast.show();
                myView.setBackgroundColor(Color.parseColor(text));


            }
        });

    }
}