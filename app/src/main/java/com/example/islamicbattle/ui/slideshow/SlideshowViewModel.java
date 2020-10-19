package com.example.islamicbattle.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("উহুদের মর্মান্তিক রক্তক্ষয়ী যুদ্ধ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}