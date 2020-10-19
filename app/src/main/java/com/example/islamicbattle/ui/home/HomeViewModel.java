package com.example.islamicbattle.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("ইসলামিক যুদ্ধের ইতিহাস");
    }

    public LiveData<String> getText() {
        return mText;
    }
}