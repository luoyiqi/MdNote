package com.xdsjs.mdnote.viewModel;

import com.commonsware.cwac.anddown.AndDown;
import com.xdsjs.mdnote.base.BaseViewModel;

/**
 * 作者: hzsongjinsheng on 2016-04-09 10:12
 * 邮箱: hzsongjinsheng@corp.netease.com
 */
public class ReviewActVM extends BaseViewModel {

    public String markdownTohtml(String content) {
        AndDown andDown = new AndDown();
        String html = andDown.markdownToHtml(content);
        return html;
    }
}
