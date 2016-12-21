package com.beloo.chipslayoumanager.sample.ui;

import android.content.Context;
import android.support.annotation.VisibleForTesting;
import android.support.v7.widget.RecyclerView;

import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;

@VisibleForTesting
public class LayoutManagerFactory {
    public RecyclerView.LayoutManager layoutManager(Context context) {
        return ChipsLayoutManager.newBuilder(context)
                .setOrientation(ChipsLayoutManager.HORIZONTAL)
                .build();
    }
}