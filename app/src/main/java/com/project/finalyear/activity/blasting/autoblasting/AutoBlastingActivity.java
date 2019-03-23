package com.project.finalyear.activity.blasting.autoblasting;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;

import com.project.finalyear.R;
import com.project.finalyear.activity.BlastingHomeActivity;
import com.project.finalyear.activity.blasting.autoblasting.hazards.LiftingActivity;
import com.project.finalyear.activity.blasting.autoblasting.hazards.MaintainanceActivity;
import com.project.finalyear.activity.blasting.autoblasting.hazards.SettingUpActivity;
import com.project.finalyear.activity.blasting.autoblasting.hazards.SprayMaterialActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.project.finalyear.utils.Utils.backButtonOnToolbar;

public class AutoBlastingActivity extends AppCompatActivity {


    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.step_one_card)
    CardView liftingCardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_blasting);


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
    public void lifitingCard() {
        Intent intent = new Intent(getApplicationContext(), LiftingActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_two_card)
    public void settingCard() {
        Intent intent = new Intent(getApplicationContext(), SettingUpActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_three_card)
    public void sprayCard() {
        Intent intent = new Intent(getApplicationContext(), SprayMaterialActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_four_card)
    public void maintainanceCard() {
        Intent intent = new Intent(getApplicationContext(), MaintainanceActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }
}
