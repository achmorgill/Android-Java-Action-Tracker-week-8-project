package com.codeclan.example.childactiontracker;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 29/05/2017.
 */
public class ActivityListTest {

    @Test
    public void getActivityListTest() {
        ActivityList activityList = new ActivityList();
        assertNotNull(activityList.getMealList());
    }

}