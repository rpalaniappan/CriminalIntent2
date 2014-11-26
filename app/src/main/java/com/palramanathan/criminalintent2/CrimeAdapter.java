package com.palramanathan.criminalintent2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
* Created by palramanathan on 14-11-26.
*/
class CrimeAdapter extends ArrayAdapter<Crime> {

    private CrimeListFragment crimeListFragment;

    public CrimeAdapter(CrimeListFragment crimeListFragment, ArrayList<Crime> crimes) {
        super(crimeListFragment.getActivity(), 0, crimes);
        this.crimeListFragment = crimeListFragment;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // If we weren't given a view, inflate one
        if (convertView == null) {
            convertView = crimeListFragment.getActivity().getLayoutInflater()
                    .inflate(R.layout.list_item_crime, null);
        }

        // Configure the view for this Crime
        Crime c = getItem(position);

        TextView titleTextView =
                (TextView)convertView.findViewById(R.id.crime_list_item_titleTextView);
        titleTextView.setText(c.getTitle());
        TextView dateTextView =
                (TextView)convertView.findViewById(R.id.crime_list_item_dateTextView);
        dateTextView.setText(c.getDate().toString());
        CheckBox solvedCheckBox =
                (CheckBox)convertView.findViewById(R.id.crime_list_item_solvedCheckBox);
        solvedCheckBox.setChecked(c.isSolved());

        return convertView;
    }
}
