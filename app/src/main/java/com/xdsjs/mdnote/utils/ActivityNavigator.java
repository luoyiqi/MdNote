package com.xdsjs.mdnote.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import com.xdsjs.mdnote.application.MdNoteApplication;

/**
 * Created by rocko on 15-11-3.
 * Activity Navigator
 */
public class ActivityNavigator {

	/**
	 * @param targetActivity
	 */
	public static void navigateTo(@NonNull Class<? extends Activity> targetActivity) {
		navigateTo(targetActivity, new Intent(MdNoteApplication.getInstance().getCurrentActivity(), targetActivity));
	}

	/**
	 * @param targetActivity
	 * @param intent
	 */
	public static void navigateTo(@NonNull Class<? extends Activity> targetActivity, @NonNull Intent intent) {
		Activity currentActivity = MdNoteApplication.getInstance().getCurrentActivity();
		navigateTo(currentActivity, targetActivity, intent);
	}

	/**
	 * Used in onCreate(before onResume) method to ensure current activity is not null.
	 *
	 * @param context
	 * @param targetActivity
	 * @param intent
	 */
	public static void navigateTo(@NonNull Context context, @NonNull Class<? extends Activity> targetActivity, @NonNull Intent intent) {
		context.startActivity(intent);
	}

	public static void finish() {
		MdNoteApplication.getInstance().getCurrentActivity().finish();
	}
}
