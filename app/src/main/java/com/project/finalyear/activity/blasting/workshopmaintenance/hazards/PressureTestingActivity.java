package com.project.finalyear.activity.blasting.workshopmaintenance.hazards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.project.finalyear.R;

import butterknife.BindView;

public class PressureTestingActivity extends AppCompatActivity {



    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure_testing);
    }
}
