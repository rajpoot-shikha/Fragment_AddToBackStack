package com.example.fragmentindepthapp;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BaseFragment extends Fragment implements View.OnClickListener {

    private Button mFragmentOneBtn;
    private Button mFragmentTwoBtn;
    private Communicator mCommunicator;


    public BaseFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mCommunicator = (Communicator) context;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_base, container, false);
        mFragmentOneBtn = view.findViewById(R.id.fragment_one);
        mFragmentTwoBtn = view.findViewById(R.id.fragment_two);
        mFragmentOneBtn.setOnClickListener(this);
        mFragmentTwoBtn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.fragment_one:
                mCommunicator.openFragment(Constant.FRAGMENT_ONE);
                //getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment, "FragmentOne").addToBackStack(null).commit();
                break;
            case R.id.fragment_two:
                mCommunicator.openFragment(Constant.FRAGMENT_TWO);
                //getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragmentTwo, "FragmentTwo").addToBackStack(null).commit();
                break;
        }

    }
}
