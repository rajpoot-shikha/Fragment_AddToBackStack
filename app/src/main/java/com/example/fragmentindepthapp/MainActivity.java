package com.example.fragmentindepthapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {
    FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentManager = getSupportFragmentManager();
        addFragment(new BaseFragment());

    }

    private void addFragment(Fragment fragment) {
        mFragmentManager.beginTransaction().add(R.id.fragment_container, fragment, "BaseFragment").commit();
    }

    /*
     *opens the fragment as per user clicks
     */
    @Override
    public void openFragment(String fragmentName) {
        switch (fragmentName) {
            case Constant.FRAGMENT_ONE:
                replaceFragment(new FragmentOne(), Constant.FRAGMENT_ONE);
                break;
            case Constant.FRAGMENT_TWO:
                replaceFragment(new FragmentTwo(), Constant.FRAGMENT_TWO);
                break;
        }
    }

    /*
    * replaces the fragment and adds the replaced fragment to back stack
    */
    private void replaceFragment(Fragment targetFragment, String fragmentTag) {
        mFragmentManager.beginTransaction().replace(R.id.fragment_container, targetFragment, fragmentTag).addToBackStack(null).commit();
    }
}
