package com.example.navigationdrawer;

/**
 * Projet : Navigation Drawer Exercise
 * Développeur : Mohammed Amine Lemghili
 * Description : Fragment affichant une liste d'éléments.
 */

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.ListFragment;

public class FragmentList extends ListFragment {

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Liste de données exemple - Mohammed Amine Lemghili
        String[] items = {
                "Item 1", "Item 2", "Item 3", "Item 4",
                "Item 5", "Item 6", "Item 7", "Item 8",
                "Item 9", "Item 10"
        };

        // Configuration de l'adapter pour lier les données à la vue
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                requireContext(),
                android.R.layout.simple_list_item_1,
                items
        );
        setListAdapter(adapter);
    }
}
