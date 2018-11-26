package com.trantan.viewpagerex.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.trantan.viewpagerex.fragment.HomeFragment;
import com.trantan.viewpagerex.fragment.NotificationFragment;
import com.trantan.viewpagerex.fragment.SearchFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final static int HOME_FRAGMENT = 0;
    private final static int SEARCH_FRAGMENT = 1;
    private final static int NOTIFICATION_FRAGMENT = 2;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case HOME_FRAGMENT:
                return new HomeFragment();
            case SEARCH_FRAGMENT:
                return new SearchFragment();
            case NOTIFICATION_FRAGMENT:
                return new NotificationFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
