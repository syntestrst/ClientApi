package com.timefeel.rxmovies.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.TextView;

import com.timefeel.rxmovies.R;
import com.timefeel.rxmovies.ui.settings.SettingsFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/*
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.toolbar_title) TextView mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        // Remove default title text
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //TODO: add custom title
        // Adding menu icon to Toolbar
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            VectorDrawableCompat indicator = VectorDrawableCompat.create(getResources(), R.drawable.ic_menu_24dp, getTheme());
            indicator.setTint(ResourcesCompat.getColor(getResources(), R.color.colorWhite, getTheme()));
            supportActionBar.setHomeAsUpIndicator(indicator);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }

        mNavigationView.setNavigationItemSelectedListener(this);

        // Adding main content , MoviesFragment retrieve bundle extra from SelectActivity for building Request API
        getFragmentManager().beginTransaction().replace(R.id.content, new MoviesFragment()).commit();
    }

    */
/**
     * Open Navigation Drawer is icon menu(=) is pressed
     *//*

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            mDrawerLayout.openDrawer(GravityCompat.START);
        } else {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    */
/**
     * Close Navigation Drawer if back button is pressed
     *//*

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    */
/**
     * This method will trigger on item Click of navigation menu
     *//*

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.settings) {
            getFragmentManager().beginTransaction().replace(R.id.content, new SettingsFragment()).commit();

        } else if (id == R.id.settings) {

        } else if (id == R.id.settings) {

        } else if (id == R.id.settings) {

        } else if (id == R.id.settings) {

        } else if (id == R.id.settings) {

        }
        mDrawerLayout.closeDrawer(Gravity.START);
        return true;
    }

}
*/
