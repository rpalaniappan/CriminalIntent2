package com.palramanathan.criminalintent2;


import android.support.v4.app.Fragment;

/**
 * Created by palramanathan on 14-11-26.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
