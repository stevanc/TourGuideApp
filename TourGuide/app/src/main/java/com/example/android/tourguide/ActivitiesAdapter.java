package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivitiesAdapter extends ArrayAdapter<Activities> {

    private int mColorResourceId;

    public ActivitiesAdapter(Context context, ArrayList<Activities> activities, int colorResourceId) {
        super(context, 0, activities);

        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the position of the activity
        Activities currentActivities = getItem(position);

        //Gets the activity name textview
        TextView activityName = (TextView) listItemView.findViewById(R.id.activity_name);

        //Sets the text
        activityName.setText(currentActivities.getActivityName());

        //Gets the description textview
        TextView activityDescription = (TextView) listItemView.findViewById(R.id.activity_description);

        //Sets the text
        activityDescription.setText(currentActivities.getActivityDescription());

        //Gets the icon text view
        ImageView iconImage = (ImageView) listItemView.findViewById(R.id.image);

        //Determines if there is an image or not to be displayed
        //If not then the image textview will be hidden
        if (currentActivities.hasImage()) {

            iconImage.setImageResource(currentActivities.getImageResourceId());

            iconImage.setVisibility(View.VISIBLE);

        } else {
            iconImage.setVisibility(View.GONE);
        }

        //Set the color for each background
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        //Return the full list item view
        return listItemView;
    }
}