package com.cherep_corp.bindingdemo;

import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.cherep_corp.bindingcomponents.BindingActivity;
import com.cherep_corp.bindingdemo.databinding.ActivityMainBinding;

public class TestActivity extends BindingActivity<ActivityMainBinding> {

    @NonNull
    @Override
    public ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
        return ActivityMainBinding.inflate(inflater);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding.tvText.setText("Test");
    }

}