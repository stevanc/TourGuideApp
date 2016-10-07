package com.example.android.tourguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    public FoodFragment() {
        //empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activities_list, container, false);

        // Create a list of words
        ArrayList<Activities> activities = new ArrayList<Activities>();
        activities.add(new Activities(getString(R.string.food_name_1), getString(R.string.food_desc_1)));
        activities.add(new Activities(getString(R.string.food_name_2), getString(R.string.food_desc_2)));
        activities.add(new Activities(getString(R.string.food_name_3), getString(R.string.food_desc_3)));
        activities.add(new Activities(getString(R.string.food_name_4), getString(R.string.food_desc_4)));
        activities.add(new Activities(getString(R.string.food_name_5), getString(R.string.food_desc_5)));
        activities.add(new Activities(getString(R.string.food_name_6), getString(R.string.food_desc_6)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ActivitiesAdapter adapter = new ActivitiesAdapter(getActivity(), activities, R.color.category_food);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activities_list.xmlst.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}