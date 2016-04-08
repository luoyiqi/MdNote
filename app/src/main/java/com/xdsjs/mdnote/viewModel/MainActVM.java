package com.xdsjs.mdnote.viewModel;

import android.view.View;

import com.xdsjs.mdnote.base.BaseViewModel;
import com.xdsjs.mdnote.utils.ToastUtils;

/**
 * 作者: hzsongjinsheng on 2016-04-07 17:41
 * 邮箱: hzsongjinsheng@corp.netease.com
 */
public class MainActVM extends BaseViewModel {

    public void onCreateMdNoteClick(View view) {

    }

    public void onCreateNormalNoteClick(View view) {
        ToastUtils.showToast("6666");
    }
}
