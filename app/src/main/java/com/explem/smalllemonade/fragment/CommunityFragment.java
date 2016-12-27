package com.explem.smalllemonade.fragment;

import android.view.View;
import android.widget.TextView;

import com.explem.smalllemonade.base.BaseFragment;
import com.explem.smalllemonade.view.ShowingPage;

/**
 * Created by Pooh on 2016/12/27.
 */

public class CommunityFragment extends BaseFragment{
    @Override
    protected void onload() {
        //设置布局
        CommunityFragment.this.showCurrentPage(ShowingPage.StateType.STATE_LOAD_SUCCESS);
    }

    @Override
    protected View createSuccessView() {
        TextView tv=new TextView(getActivity());
        tv.setText("社区.......");
        return tv;
    }
}