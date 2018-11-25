package com.temka.dictionary.activity.fragment;


import android.os.Bundle;

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.temka.dictionary.R;


public class SearchFragment extends Fragment {


    public static SearchFragment newInstance() {
        SearchFragment searchFragment =new SearchFragment();
        return searchFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

}
