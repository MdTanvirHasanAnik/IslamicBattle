package com.example.islamicbattle.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("মুসলিম ইতিহাসের প্রথম সশস্ত্র যুদ্ধ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}