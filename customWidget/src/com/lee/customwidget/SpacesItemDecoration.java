package com.lee.customwidget;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by lee on 15/7/10.
 * 设置RecyclerView的间距
 */
public class SpacesItemDecoration extends RecyclerView.ItemDecoration {
    private int mSpace;
    public SpacesItemDecoration(int space) {
        mSpace = space;
    }
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.left = mSpace;
        outRect.right = mSpace;
        outRect.bottom = mSpace;
        // Add top margin only for the first item to avoid double space between items
        if (parent.getChildLayoutPosition(view) == 0)
            outRect.top = mSpace;
    }
}
