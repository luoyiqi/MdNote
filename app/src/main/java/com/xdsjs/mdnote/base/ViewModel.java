package com.xdsjs.mdnote.base;

import android.content.Context;
import android.databinding.BaseObservable;

import com.xdsjs.mdnote.application.MdNoteApplication;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by rocko on 15-11-5.
 */
public abstract class ViewModel extends BaseObservable { // TODO: Need Context(Activity)?

    protected Context appContext = MdNoteApplication.getInstance();

    /* Just mark a method in ViewModel */
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    protected @interface Command {
    }

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    protected @interface BindView {
    }
    // ... InstanceState in ViewModel
}
