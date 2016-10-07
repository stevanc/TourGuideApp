package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    //Based on the position returned, returns the correct fragment
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FoodFragment();
        } else if (position == 1) {
            return new HistoryFragment();
        } else if (position == 2) {
            return new AttractionsFragment();
        } else {
            return new PubsFragment();
        }
    }

    //Get the count of the number of pages for the adapter
    @Override
    public int getCount() {
        return 4;
    }

    //Get the title based on the fragment's position
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_food);
        } else if (position == 1) {
            return mContext.getString(R.string.category_history);
        } else if (position == 2) {
            return mContext.getString(R.string.category_attractions);
        } else {
            return mContext.getString(R.string.category_pubs);
        }
    }
}