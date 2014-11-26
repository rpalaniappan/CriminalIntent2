package com.palramanathan.criminalintent2;

import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by palramanathan on 14-11-26.
 */
public class CrimeListFragment extends ListFragment {
    private ArrayList<Crime> mCrimes;
    private static final String TAG = "CrimeListFragment";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crimes_title);
        mCrimes = CrimeLab.get(getActivity()).getCrimes();
        CrimeAdapter adapter = new CrimeAdapter(this, mCrimes);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Crime c = ((CrimeAdapter)getListAdapter()).getItem(position);
        Log.d(TAG, c.getTitle() + " was clicked");
    }

}
