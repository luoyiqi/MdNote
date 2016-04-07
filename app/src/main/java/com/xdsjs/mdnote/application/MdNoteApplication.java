package com.xdsjs.mdnote.application;

import android.app.Application;

/**
 * 作者: hzsongjinsheng on 2016-04-07 15:47
 * 邮箱: hzsongjinsheng@corp.netease.com
 */
public class MdNoteApplication extends Application {

    private static MdNoteApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static MdNoteApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
