package com.example.navigationdrawer;

/**
 * Projet : Navigation Drawer Exercise
 * Développeur : Mohammed Amine Lemghili
 * Description : Deuxième fragment de contenu.
 */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class BlankFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Chargement du layout pour le fragment 2 - Par Mohammed Amine Lemghili
        return inflater.inflate(R.layout.fragment_blank2, container, false);
    }
}
