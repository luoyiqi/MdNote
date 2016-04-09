package com.xdsjs.mdnote.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.xdsjs.mdnote.R;
import com.xdsjs.mdnote.base.BaseActivity;
import com.xdsjs.mdnote.databinding.ActivityHandWriteBinding;
import com.xdsjs.mdnote.viewModel.HandWriteActVM;

public class HandWriteActivity extends BaseActivity<HandWriteActVM, ActivityHandWriteBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewModel(new HandWriteActVM());
        setBinding(DataBindingUtil.<ActivityHandWriteBinding>setContentView(this, R.layout.activity_hand_write));
        getBinding().setHandWriteVM(getViewModel());
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
            case R.id.nav_review:
                openActivity(ReviewActivity.class);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
