package com.palramanathan.criminalintent2;

import android.app.Fragment;
import android.view.MenuItem;


public class CrimeActivity extends SingleFragmentActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
