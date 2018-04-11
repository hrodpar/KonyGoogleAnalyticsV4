package com.mapfre.ffi;

import com.konylabs.android.KonyMain;

import android.content.Context;
import android.util.Log;
import info.androidhive.googleanalytics.app.MyApplication;

public class AnalyticsWrapper {
	
	public static final String TAG = MyApplication.class
            .getSimpleName();
	
	public static void trackEvent(String category, String action, String label) {		
		Log.d(TAG, "AnalyticsWrapper dice: trackEvent ---> " + category + " - " + action + " - " + label);
		Context loContext = KonyMain.getAppContext().getApplicationContext();
		((MyApplication) loContext).trackEvent(category, action, label);			
	}

}
