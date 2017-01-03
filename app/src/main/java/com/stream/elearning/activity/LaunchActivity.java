package com.stream.elearning.activity;

import android.content.Intent;
import android.os.Bundle;

import com.stream.elearning.base.BaseActivity;

/**
 * description：
 * ===============================
 * creator：ZhangChuanchuan
 * create time：2017/1/3 12:14
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */

public class LaunchActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startMainActivity();
    }

    /**
     * 开启MainActivity
     */
    private void startMainActivity() {
        Intent intent = new Intent();
        intent.setClass(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}
