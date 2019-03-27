package com.project.finalyear.activity.painting.spraypaint;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.project.finalyear.R;
import com.project.finalyear.activity.painting.PaintingHomeActivity;
import com.project.finalyear.activity.painting.spraypaint.hazards.CleanUpActivity;
import com.project.finalyear.activity.painting.spraypaint.hazards.SettingSprayActivity;
import com.project.finalyear.activity.painting.spraypaint.hazards.SprayPaintWorkActivity;
import com.project.finalyear.activity.painting.spraypaint.hazards.WorkingHeightActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.project.finalyear.utils.Utils.backButtonOnToolbar;

public class SprayPaintActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spray_paint);
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
        Intent intent = new Intent(getApplicationContext(), PaintingHomeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);

        return true;
    }


    @Override
    public void onBackPressed() {

        Intent intent = new Intent(getApplicationContext(), PaintingHomeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);

    }

    @OnClick(R.id.step_one_card)
    public void firstCard() {

        Intent intent = new Intent(getApplicationContext(), SettingSprayActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_two_card)
    public void secondCard() {

        Intent intent = new Intent(getApplicationContext(), SprayPaintWorkActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_three_card)
    public void thirdCard() {

        Intent intent = new Intent(getApplicationContext(), WorkingHeightActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.step_four_card)
    public void fourCard() {

        Intent intent = new Intent(getApplicationContext(), CleanUpActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }
}
