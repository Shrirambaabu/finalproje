package com.project.finalyear.activity.blasting.abbrasive;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.project.finalyear.R;
import com.project.finalyear.activity.blasting.BlastingHomeActivity;
import com.project.finalyear.activity.blasting.abbrasive.hazards.CleanGritbActivity;
import com.project.finalyear.activity.blasting.abbrasive.hazards.ClearingGritbActivity;
import com.project.finalyear.activity.blasting.abbrasive.hazards.ConnectionWorkActivity;
import com.project.finalyear.activity.blasting.abbrasive.hazards.DemobilizeActivity;
import com.project.finalyear.activity.blasting.abbrasive.hazards.PickupBlastingActivity;
import com.project.finalyear.activity.blasting.abbrasive.hazards.RecyclerAbrasiveActivity;
import com.project.finalyear.activity.blasting.abbrasive.hazards.SetupActivity;
import com.project.finalyear.activity.blasting.abbrasive.hazards.SweepBlastingActivity;
import com.project.finalyear.activity.blasting.abbrasive.hazards.WorkingHeightActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.project.finalyear.utils.Utils.backButtonOnToolbar;

public class AbrasiveBlastingActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abrasive_blasting);
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
    public void setupCard() {

        Intent intent = new Intent(getApplicationContext(), SetupActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_two_card)
    public void connectionCard() {

        Intent intent = new Intent(getApplicationContext(), ConnectionWorkActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_three_card)
    public void heightCard() {

        Intent intent = new Intent(getApplicationContext(), WorkingHeightActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_four_card)
    public void sweepCard() {

        Intent intent = new Intent(getApplicationContext(), SweepBlastingActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_five_card)
    public void cleanGribCard() {

        Intent intent = new Intent(getApplicationContext(), CleanGritbActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_six_card)
    public void pickupCard() {

        Intent intent = new Intent(getApplicationContext(), PickupBlastingActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_seven_card)
    public void clearingGribCard() {

        Intent intent = new Intent(getApplicationContext(), ClearingGritbActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_eight_card)
    public void recyclingCard() {

        Intent intent = new Intent(getApplicationContext(), RecyclerAbrasiveActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_nine_card)
    public void demobilixeCard() {

        Intent intent = new Intent(getApplicationContext(), DemobilizeActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }
}
