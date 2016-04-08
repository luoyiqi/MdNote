package com.xdsjs.mdnote.utils;

import android.widget.Toast;

import com.xdsjs.mdnote.application.MdNoteApplication;

/**
 * Created by xdsjs on 2015/11/27.
 */
public class ToastUtils {
    public static void showToast(String msg) {
        Toast toast = Toast.makeText(MdNoteApplication.getInstance(), msg, Toast.LENGTH_SHORT);
        toast.show();
    }
}
