package com.xdsjs.mdnote.application;

import android.app.Activity;
import android.app.Application;
import android.support.annotation.NonNull;

/**
 * 作者: hzsongjinsheng on 2016-04-07 15:47
 * 邮箱: hzsongjinsheng@corp.netease.com
 */
public class MdNoteApplication extends Application {

    private static MdNoteApplication mInstance;
    private Activity mCurrentActivity;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static MdNoteApplication getInstance() {
        return mInstance;
    }

    public void setCurrentActivity(@NonNull Activity mCurrentActivity) {
        this.mCurrentActivity = mCurrentActivity;
    }

    public Activity getCurrentActivity() {
        return mCurrentActivity;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
