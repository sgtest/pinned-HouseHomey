package com.example.househomey.filter.ui;

import android.view.View;

import com.example.househomey.filter.model.FilterCallback;

public class TagFilterFragment extends FilterFragment {

    public TagFilterFragment(String title, View contentView, FilterCallback filterCallback) {
        super(title, contentView, filterCallback);
    }

    @Override
    public void getFilterInput() {
        // TODO: get the filter properties from fragment inputs
    }
}