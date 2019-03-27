package com.project.finalyear.activity.painting;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.project.finalyear.R;
import com.project.finalyear.activity.MainActivity;
import com.project.finalyear.activity.painting.powertooling.PowerToolingActivity;
import com.project.finalyear.activity.painting.spraypaint.SprayPaintActivity;
import com.project.finalyear.activity.painting.touchup.TouchupActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.project.finalyear.utils.Utils.backButtonOnToolbar;

public class PaintingHomeActivity extends AppCompatActivity {


    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painting_home);
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

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);

        return true;
    }


    @Override
    public void onBackPressed() {


        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);

    }

    @OnClick(R.id.power_tooling)
    public void powerTooling(){
        Intent intent = new Intent(getApplicationContext(), PowerToolingActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }

    @OnClick(R.id.touch_up_painting)
    public void touchup() {
        Intent intent = new Intent(getApplicationContext(), TouchupActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }
    @OnClick(R.id.spray_painting_card)
    public void sprayPaint() {
        Intent intent = new Intent(getApplicationContext(), SprayPaintActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
    }
}
