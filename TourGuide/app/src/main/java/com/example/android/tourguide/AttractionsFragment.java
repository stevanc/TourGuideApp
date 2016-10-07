package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        //empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activities_list, container, false);

        // Create a list of words
        ArrayList<Activities> activities = new ArrayList<Activities>();
        activities.add(new Activities(getString(R.string.attraction_name_1), getString(R.string.attraction_desc_1), R.drawable.buckingham));
        activities.add(new Activities(getString(R.string.attraction_name_2), getString(R.string.attraction_desc_2), R.drawable.zoo));
        activities.add(new Activities(getString(R.string.attraction_name_3), getString(R.string.attraction_desc_3), R.drawable.eye));
        activities.add(new Activities(getString(R.string.attraction_name_4), getString(R.string.attraction_desc_4), R.drawable.shard));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ActivitiesAdapter adapter = new ActivitiesAdapter(getActivity(), activities, R.color.category_attractions);

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