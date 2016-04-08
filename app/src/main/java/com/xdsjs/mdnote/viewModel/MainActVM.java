package com.xdsjs.mdnote.viewModel;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableList;
import android.view.View;

import com.xdsjs.mdnote.application.MdNoteApplication;
import com.xdsjs.mdnote.base.BaseViewModel;
import com.xdsjs.mdnote.model.bean.Note;
import com.xdsjs.mdnote.utils.ActivityNavigator;
import com.xdsjs.mdnote.utils.ToastUtils;
import com.xdsjs.mdnote.view.activity.MdNoteActivity;
import com.xdsjs.mdnote.view.adapter.MainActAdapter;

/**
 * 作者: hzsongjinsheng on 2016-04-07 17:41
 * 邮箱: hzsongjinsheng@corp.netease.com
 */
public class MainActVM extends BaseViewModel {

    public final ObservableField<MainActAdapter> mainActAdapter = new ObservableField<>();
    public final ObservableList<Note> notes = new ObservableArrayList<>();

    public void onCreateMdNoteClick(View view) {
        ActivityNavigator.navigateTo(MdNoteActivity.class);
    }

    public void onCreateNormalNoteClick(View view) {
        ToastUtils.showToast("6666");
    }

    public void loadNote() {
        notes.add(new Note("a", "1", "1"));
        notes.add(new Note("a", "2", "2"));
        notes.add(new Note("a", "3", "3"));
        notes.add(new Note("a", "4", "4"));
        notes.add(new Note("a", "5", "5"));
        notes.add(new Note("a", "6", "6"));
        MainActAdapter adapter = new MainActAdapter(MdNoteApplication.getInstance(), notes);
        mainActAdapter.set(adapter);
    }
}
