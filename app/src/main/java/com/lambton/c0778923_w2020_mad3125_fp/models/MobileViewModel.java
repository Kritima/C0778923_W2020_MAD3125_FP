package com.lambton.c0778923_w2020_mad3125_fp.models;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MobileViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MobileViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is mobile fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}