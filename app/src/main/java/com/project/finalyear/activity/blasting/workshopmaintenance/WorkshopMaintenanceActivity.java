package com.project.finalyear.activity.blasting.workshopmaintenance;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.project.finalyear.R;
import com.project.finalyear.activity.blasting.BlastingHomeActivity;
import com.project.finalyear.activity.blasting.workshopmaintenance.hazards.AssembleActivity;
import com.project.finalyear.activity.blasting.workshopmaintenance.hazards.ChemicalCleaningActivity;
import com.project.finalyear.activity.blasting.workshopmaintenance.hazards.ConnectionDisconnectionActivity;
import com.project.finalyear.activity.blasting.workshopmaintenance.hazards.ElectricalPowerSupplyActivity;
import com.project.finalyear.activity.blasting.workshopmaintenance.hazards.HotworkActivity;
import com.project.finalyear.activity.blasting.workshopmaintenance.hazards.OperarationTestActivity;
import com.project.finalyear.activity.blasting.workshopmaintenance.hazards.PressureTestingActivity;
import com.project.finalyear.activity.blasting.workshopmaintenance.hazards.TopingUpActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.project.finalyear.utils.Utils.backButtonOnToolbar;

public class WorkshopMaintenanceActivity extends AppCompatActivity {


    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop_maintenance);

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
    public void cardOne() {
        Intent intent = new Intent(getApplicationContext(), ConnectionDisconnectionActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_two_card)
    public void cardTwo() {
        Intent intent = new Intent(getApplicationContext(), ElectricalPowerSupplyActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_three_card)
    public void cardThree() {
        Intent intent = new Intent(getApplicationContext(), AssembleActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_four_card)
    public void cardFour() {
        Intent intent = new Intent(getApplicationContext(), ChemicalCleaningActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_five_card)
    public void cardFive() {
        Intent intent = new Intent(getApplicationContext(), HotworkActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_six_card)
    public void cardSix() {
        Intent intent = new Intent(getApplicationContext(), TopingUpActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_seven_card)
    public void cardSeven() {
        Intent intent = new Intent(getApplicationContext(), PressureTestingActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_eight_card)
    public void cardEight() {
        Intent intent = new Intent(getApplicationContext(), OperarationTestActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

}
