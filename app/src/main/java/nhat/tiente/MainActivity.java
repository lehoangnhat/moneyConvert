package nhat.tiente;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        final Spinner inputSpinner = (Spinner) findViewById(R.id.inputSpinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner

        inputSpinner.setAdapter(adapter);
       // inputSpinner.setOnItemSelectedListener(this);

        final Spinner outputSpinner = (Spinner) findViewById(R.id.outputSpinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner

        outputSpinner.setAdapter(adapter2);
        //outputSpinner.setOnItemSelectedListener(this);

        Button convert = (Button) findViewById(R.id.btnChange);
        final EditText input = (EditText) findViewById(R.id.inputText);
        final EditText output = (EditText) findViewById(R.id.outputText);
        convert.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        String temp;
                        String temp2;
                        double result;
                        temp = inputSpinner.getSelectedItem().toString();
                        temp2 = outputSpinner.getSelectedItem().toString();
                        if ((temp.equals("USD") && temp2.equals("USD"))||(temp.equals("EUR") && temp2.equals("EUR"))||(temp.equals("VND") && temp2.equals("VND"))
                        || (temp.equals("JPY") && temp2.equals("JPY"))||(temp.equals("GBP") && temp2.equals("GBP"))) {
                            result = Double.parseDouble(input.getText().toString());
                            output.setText(String.valueOf(result));
                        }

                        else if(temp.equals("USD") && temp2.equals("VND")) {
                            result = Double.parseDouble(input.getText().toString())*22800;
                            output.setText(String.valueOf(result));
                        }
                        else if(temp.equals("VND") && temp2.equals("USD")) {
                            result = Double.parseDouble(input.getText().toString())/22800;
                            output.setText(String.valueOf(result));
                        }
                        else if(temp.equals("GBP") && temp2.equals("VND")) {
                            result = Double.parseDouble(input.getText().toString())*28400;
                            output.setText(String.valueOf(result));
                        }
                        else if(temp.equals("VND") && temp2.equals("GBP")) {
                            result = Double.parseDouble(input.getText().toString())/28400;
                            output.setText(String.valueOf(result));
                        }
                        else if(temp.equals("EUR") && temp2.equals("VND")) {
                            result = Double.parseDouble(input.getText().toString())*24200;
                            output.setText(String.valueOf(result));
                        }else if(temp.equals("VND") && temp2.equals("EUR")) {
                            result = Double.parseDouble(input.getText().toString())/24200;
                            output.setText(String.valueOf(result));
                        }
                        else if(temp.equals("JPY") && temp2.equals("VND")) {
                            result = Double.parseDouble(input.getText().toString())*200;
                            output.setText(String.valueOf(result));
                        }else if(temp.equals("VND") && temp2.equals("JPY")) {
                            result = Double.parseDouble(input.getText().toString())/200;
                            output.setText(String.valueOf(result));
                        }
                        else if(temp.equals("EUR") && temp2.equals("VND")) {
                            result = Double.parseDouble(input.getText().toString())*24200;
                            output.setText(String.valueOf(result));
                        }else if(temp.equals("VND") && temp2.equals("EUR")) {
                            result = Double.parseDouble(input.getText().toString())/24200;
                            output.setText(String.valueOf(result));
                        }

                        else if(temp.equals("EUR") && temp2.equals("USD")) {
                            result = Double.parseDouble(input.getText().toString())*1.07;
                            output.setText(String.valueOf(result));
                        }else if(temp.equals("USD") && temp2.equals("EUR")) {
                            result = Double.parseDouble(input.getText().toString())/1.07;
                            output.setText(String.valueOf(result));
                        }
                        else if(temp.equals("EUR") && temp2.equals("JPY")) {
                            result = Double.parseDouble(input.getText().toString())*118;
                            output.setText(String.valueOf(result));
                        }else if(temp.equals("JPY") && temp2.equals("EUR")) {
                            result = Double.parseDouble(input.getText().toString())/118;
                            output.setText(String.valueOf(result));
                        }
                        else if(temp.equals("EUR") && temp2.equals("GBP")) {
                            result = Double.parseDouble(input.getText().toString())*0.86;
                            output.setText(String.valueOf(result));
                        }else if(temp.equals("GBP") && temp2.equals("EUR")) {
                            result = Double.parseDouble(input.getText().toString())/0.86;
                            output.setText(String.valueOf(result));
                        }

                        else if(temp.equals("USD") && temp2.equals("GBP")) {
                            result = Double.parseDouble(input.getText().toString())*0.8;
                            output.setText(String.valueOf(result));
                        }else if(temp.equals("GBP") && temp2.equals("USD")) {
                            result = Double.parseDouble(input.getText().toString())/0.8;
                            output.setText(String.valueOf(result));
                        }
                        else if(temp.equals("USD") && temp2.equals("JPY")) {
                            result = Double.parseDouble(input.getText().toString())*110;
                            output.setText(String.valueOf(result));
                        }else if(temp.equals("JPY") && temp2.equals("USD")) {
                            result = Double.parseDouble(input.getText().toString())/110;
                            output.setText(String.valueOf(result));
                        }

                        else if(temp.equals("JPY") && temp2.equals("GBP")) {
                            result = Double.parseDouble(input.getText().toString())/138;
                            output.setText(String.valueOf(result));
                        }else if(temp.equals("GBP") && temp2.equals("JPY")) {
                            result = Double.parseDouble(input.getText().toString())*138;
                            output.setText(String.valueOf(result));
                        }
                        else {
                            output.setText("not valid");
                        }



                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id){
        switch (position){
            case 0 :

                break;
        }
    }
}
