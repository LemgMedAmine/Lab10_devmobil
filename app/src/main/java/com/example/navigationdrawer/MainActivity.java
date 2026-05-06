package com.example.navigationdrawer;

/**
 * Projet : Navigation Drawer
 * Développeur : Mohammed Amine Lemghili
 * Description : Activité principale gérant la navigation et les fragments.
 */

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configuration de la Toolbar par Mohammed Amine Lemghili
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // Gestion du bouton de menu (Hamburger) - Mohammed Amine Lemghili
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                drawer,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        );
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        // Gestion du bouton retour par Mohammed Amine Lemghili
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                if (drawer.isDrawerOpen(GravityCompat.START)) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    setEnabled(false);
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
        });

        // Fragment par défaut au démarrage - Mohammed Amine Lemghili
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contenu, new BlankFragment())
                    .commit();
            navigationView.setCheckedItem(R.id.nav_fragment1);
        }
    }

    /**
     * Gestion de la sélection dans le menu de navigation
     * Développé par Mohammed Amine Lemghili
     */
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        // Navigation dynamique entre les fragments - Mohammed Amine Lemghili
        if (id == R.id.nav_fragment1) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contenu, new BlankFragment())
                    .commit();
        } else if (id == R.id.nav_fragment2) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contenu, new BlankFragment2())
                    .commit();
        } else if (id == R.id.nav_list) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contenu, new FragmentList())
                    .commit();
        }

        item.setChecked(true);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
