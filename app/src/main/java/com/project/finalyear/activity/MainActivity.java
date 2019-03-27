package com.project.finalyear.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.project.finalyear.R;
import com.project.finalyear.activity.blasting.BlastingHomeActivity;
import com.project.finalyear.activity.painting.PaintingHomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.card_one)
    CardView cardOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setupToolBar();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.about_ssra, menu);

        return super.onCreateOptionsMenu(menu);
    }

    private void setupToolBar() {

        toolbar.setTitle("SSRA");
        setSupportActionBar(toolbar);

    }


    @OnClick(R.id.card_one)
    public void cardOne() {
        Intent intent = new Intent(getApplicationContext(), BlastingHomeActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);

    }

    @OnClick(R.id.card_two)
    public void cardTwo() {
        Intent intent = new Intent(getApplicationContext(), PaintingHomeActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.ic_app_logo).setTitle("Exit");
        builder.setMessage("Are you sure you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }

        });
        builder.setNegativeButton("No", null);
        //builder.show();
        AlertDialog dialog = builder.create();
        dialog.show(); //Only after .show() was called
        dialog.getButton(dialog.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.colorDeepBlue));
        dialog.getButton(dialog.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.colorDeepBlue));


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home:
                return true;
            case R.id.info:
                Intent intentSave = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intentSave);
                overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
