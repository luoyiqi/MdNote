package com.xdsjs.mdnote.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.xdsjs.mdnote.R;
import com.xdsjs.mdnote.base.BaseActivity;
import com.xdsjs.mdnote.databinding.ActivityMdnoteBinding;
import com.xdsjs.mdnote.viewModel.MdNoteActVM;

/**
 * 作者: hzsongjinsheng on 2016-04-08 16:48
 * 邮箱: hzsongjinsheng@corp.netease.com
 */
public class MdNoteActivity extends BaseActivity<MdNoteActVM, ActivityMdnoteBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdnote);
        setViewModel(new MdNoteActVM());
        setBinding(DataBindingUtil.<ActivityMdnoteBinding>setContentView(this, R.layout.activity_mdnote));
        getBinding().setMdNoteVM(getViewModel());
        initView();
    }

    private void initView() {
        setSupportActionBar(getBinding().toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.md_note, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_settings:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
