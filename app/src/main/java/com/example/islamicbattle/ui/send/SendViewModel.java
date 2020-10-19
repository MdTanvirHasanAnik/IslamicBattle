package com.example.islamicbattle.ui.send;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SendViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SendViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Naeem Aziz \n naeem15-1152@diu.edu.bd");
    }

    public LiveData<String> getText() {
        return mText;
    }
}