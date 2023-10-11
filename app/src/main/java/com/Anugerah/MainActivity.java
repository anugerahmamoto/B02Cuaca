package com.Anugerah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.toolbox.StringRequest;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText etkota, etnegara;
    TextView tvresult
    private final String url = "https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}";
    private final String appid = "270414305f3d9a888bd3df2a26ab5a8d";
    DecimalFormat df = new DecimalFormat("#.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etkota = findViewById(R.id.etkota);
        etnegara = findViewById(R.id.etnegara);
        tvresult = findViewById(R.id.tvresult);
    }

    public void getWeatherDetails(View view) {
        String tempurl = "";
        String kota = etkota.getText().toString().trim();
        String negara = etnegara.getText().toString();
        if(kota.equals("")) {
            tvresult.setText("Kota Field can not empty");
        }else{
            if(negara.equals("")) {
                tempurl = url + "?q=" + kota + "," + negara + "&appid=" + appid;
            }else{
                tempurl = url + "?q=" + kota + "&appid=" + appid;
            }

        }
    }
}