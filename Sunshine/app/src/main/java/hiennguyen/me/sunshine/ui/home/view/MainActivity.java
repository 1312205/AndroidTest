package hiennguyen.me.sunshine.ui.home.view;

import android.os.Bundle;

import hiennguyen.me.sunshine.ui.common.SimpleActivity;


public class MainActivity extends SimpleActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new HomeFragment(), false);
    }
}
