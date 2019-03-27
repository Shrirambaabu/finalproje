package com.project.finalyear.activity.blasting.hydroblasting;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.project.finalyear.R;
import com.project.finalyear.activity.blasting.BlastingHomeActivity;
import com.project.finalyear.activity.blasting.hydroblasting.hazards.ConnectionOfWorkActivity;
import com.project.finalyear.activity.blasting.hydroblasting.hazards.DemobilizeHydroActivity;
import com.project.finalyear.activity.blasting.hydroblasting.hazards.EntryActivity;
import com.project.finalyear.activity.blasting.hydroblasting.hazards.PerformingHydroBlastingActivity;
import com.project.finalyear.activity.blasting.hydroblasting.hazards.PumpingOutActivity;
import com.project.finalyear.activity.blasting.hydroblasting.hazards.SetupHydroActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.project.finalyear.utils.Utils.backButtonOnToolbar;

public class HydroBlastingActivity extends AppCompatActivity {


    @BindView(R.id.toolbar)
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hydro_blasting);

        ButterKnife.bind(this);


        backButtonOnToolbar(this);
        setupToolbar();

    }


    private void setupToolbar() {
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
        }
    }


    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(getApplicationContext(), BlastingHomeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);

        return true;
    }


    @Override
    public void onBackPressed() {

        Intent intent = new Intent(getApplicationContext(), BlastingHomeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);

    }

    @OnClick(R.id.step_one_card)
    public void entityCard() {
        Intent intent = new Intent(getApplicationContext(), EntryActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_two_card)
    public void settingHydroCard() {
        Intent intent = new Intent(getApplicationContext(), SetupHydroActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_three_card)
    public void connectionWorkCard() {
        Intent intent = new Intent(getApplicationContext(), ConnectionOfWorkActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_four_card)
    public void performingHydroCard() {
        Intent intent = new Intent(getApplicationContext(), PerformingHydroBlastingActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_five_card)
    public void pumpingCard() {
        Intent intent = new Intent(getApplicationContext(), PumpingOutActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_six_card)
    public void demobilizeCard() {
        Intent intent = new Intent(getApplicationContext(), DemobilizeHydroActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

}
