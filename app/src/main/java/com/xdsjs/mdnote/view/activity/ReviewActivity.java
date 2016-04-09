package com.xdsjs.mdnote.view.activity;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.xdsjs.mdnote.R;
import com.xdsjs.mdnote.base.BaseActivity;
import com.xdsjs.mdnote.databinding.ActivityReviewBinding;
import com.xdsjs.mdnote.viewModel.ReviewActVM;

public class ReviewActivity extends BaseActivity<ReviewActVM, ActivityReviewBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewModel(new ReviewActVM());
        setBinding(DataBindingUtil.<ActivityReviewBinding>setContentView(this, R.layout.activity_review));
        getBinding().setReviewActVM(getViewModel());
        initView();
    }

    private void initView() {
        setSupportActionBar(getBinding().toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //将WebView背景设置成透明的
        getBinding().wvReview.setBackgroundColor(Color.TRANSPARENT);

        Bundle bundle = getIntent().getExtras();
        if (bundle.containsKey("content")) {

            String html = getViewModel().markdownTohtml(bundle.getString("content"));

            getBinding().wvReview.loadData(html, "text/html", "utf-8");
        }
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
