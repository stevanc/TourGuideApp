package com.example.android.tourguide;

public class Activities {

    private String mActivityName;

    private String mActivityDescription;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static int NO_IMAGE_PROVIDED = -1;

    public Activities(String activityName, String activityDescription) {
        mActivityName = activityName;
        mActivityDescription = activityDescription;
    }

    public Activities(String activityName, String activityDescription, int imageResourceId) {
        mActivityName = activityName;
        mActivityDescription = activityDescription;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the activity
     *
     * @return
     */
    public String getActivityName() {
        return mActivityName;
    }

    /**
     * Get the description of the activity
     *
     * @return
     */
    public String getActivityDescription() {
        return mActivityDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}