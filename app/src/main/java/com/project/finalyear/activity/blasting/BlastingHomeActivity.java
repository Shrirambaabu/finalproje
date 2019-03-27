package com.project.finalyear.activity.blasting;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;

import com.project.finalyear.R;
import com.project.finalyear.activity.MainActivity;
import com.project.finalyear.activity.blasting.abbrasive.AbrasiveBlastingActivity;
import com.project.finalyear.activity.blasting.autoblasting.AutoBlastingActivity;
import com.project.finalyear.activity.blasting.hydroblasting.HydroBlastingActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.project.finalyear.utils.Utils.backButtonOnToolbar;

public class BlastingHomeActivity extends AppCompatActivity {


    @BindView(R.id.toolbar)
    Toolbar toolbar;


    @BindView(R.id.auto_blasting_card)
    CardView autoBlastingCardView;

    @BindView(R.id.hydro_blasting_card)
    CardView rockBlastingCardView;

    @BindView(R.id.abbrasive_blasting_card)
    CardView abbrasiveBlastingCardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blasting_home);
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


    @OnClick(R.id.auto_blasting_card)
    public void autoBlasting(){

        Intent intent=new Intent(getApplicationContext(), AutoBlastingActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);

    }
    @OnClick(R.id.abbrasive_blasting_card)
    public void abrasiveBlasting(){

        Intent intent=new Intent(getApplicationContext(), AbrasiveBlastingActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);

    }@OnClick(R.id.hydro_blasting_card)
    public void hydroBlasting(){

        Intent intent=new Intent(getApplicationContext(), HydroBlastingActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);

    }
}
