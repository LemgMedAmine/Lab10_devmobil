package com.example.navigationdrawer;

/**
 * Projet : Navigation Drawer Exercise
 * Développeur : Mohammed Amine Lemghili
 * Description : Premier fragment de contenu affiché par défaut.
 */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class BlankFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate le layout pour ce fragment - Réalisé par Mohammed Amine Lemghili
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
}
