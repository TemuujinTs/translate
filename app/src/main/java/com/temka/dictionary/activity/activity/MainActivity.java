package com.temka.dictionary.activity.activity;

import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.temka.dictionary.R;
import com.temka.dictionary.activity.fragment.FavoriteFragment;
import com.temka.dictionary.activity.fragment.OptionsFragment;
import com.temka.dictionary.activity.fragment.SearchFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        setFragment(SearchFragment.newInstance());

    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
                case R.id.nav_search:
                    setFragment(SearchFragment.newInstance());
                return true;

                case R.id.nav_menus:
                    setFragment(OptionsFragment.newInstance());
                    return true;


                case R.id.nav_favorite:
                    setFragment(FavoriteFragment.newInstance());
                    return true;
            }
            return false;
        }

        };
    private void setFragment(Fragment fragment){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.content, fragment);
        transaction.commit();

    }
}
