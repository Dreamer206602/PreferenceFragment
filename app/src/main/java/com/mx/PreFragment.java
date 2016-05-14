package com.mx;


import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.support.v4.app.Fragment;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PreFragment extends PreferenceFragment {



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
       addPreferencesFromResource(R.xml.preferences);

        findPreference(getString(R.string.checkbox_preference)).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                Toast.makeText(getActivity(),"CheckBox",Toast.LENGTH_SHORT).show();
                return true;
            }
        });

//        findPreference(getString(R.string.list_preference)).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
//            @Override
//            public boolean onPreferenceClick(Preference preference) {
//                Toast.makeText(getActivity(),"ListView",Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });



    }
}
