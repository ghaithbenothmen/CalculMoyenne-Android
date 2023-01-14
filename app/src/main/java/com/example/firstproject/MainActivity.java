package com.example.firstproject;

import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.firstproject.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
private ActivityMainBinding binding;


    Button btnCal;
    EditText textNote1,textNote2,textNote3;
    TextView textMoy;
    TextView textView;




        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float note1 =Float.parseFloat(textNote1.getText().toString());
                float note2 =Float.parseFloat(textNote2.getText().toString());
                float note3 =Float.parseFloat(textNote3.getText().toString());


                float moy =(note1+note2+note3)/3;
                textMoy.setText(String.valueOf(moy));
                DecimalFormat df = new DecimalFormat("0.00");
                textMoy.setText(df.format(moy));
                textView.setText("Voila votre moyenne :");
                
            }
        };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnCal = findViewById(R.id.btnCalculer);
        btnCal.setOnClickListener(listener);
        textNote1 = findViewById(R.id.idNote1);
        textNote2 = findViewById(R.id.idNote2);
        textNote3 = findViewById(R.id.idNote3);
        textMoy = findViewById(R.id.txtMoy);
        textView = findViewById(R.id.textView);
    }


    }
/*@Override
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

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }*/

