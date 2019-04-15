package com.example.car;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Year;

public class MainActivity extends AppCompatActivity {
    private Button btnCar, btnDiesel;
    private EditText Make, year, Color, Price, Size;
    private TextView show;
    private int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCar=findViewById(R.id.btnCar);
        btnDiesel=findViewById(R.id.btnDiesel);
        Size=findViewById(R.id.Size);
        Make=findViewById(R.id.Make);
        year=findViewById(R.id.year);
        Price=findViewById(R.id.Price);
        show=findViewById(R.id.show);
        btnCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                String manuf = Make.getText().toString();
                int years = Integer.parseInt(year.getText().toString());
                float price = Float.parseFloat(Price.getText().toString());
                float size = Float.parseFloat(Size.getText().toString());
                show.append("This is vehicle no. " + i + "\n" + "Manufacturer: " + manuf +
                        "Current value: " + price + "Effective engine size: " + size + "\n");
            }
        });



    }
}
