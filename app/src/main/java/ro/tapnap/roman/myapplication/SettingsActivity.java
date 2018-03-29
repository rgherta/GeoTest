package ro.tapnap.roman.myapplication;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingsActivity  extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.preference_profile);
        addPreferencesFromResource(R.xml.preferences);

    }

}
