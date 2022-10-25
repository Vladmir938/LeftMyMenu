package com.example.mymenu.ui.newchat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewChatViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NewChatViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Новый секретный чат");
    }

    public LiveData<String> getText() {
        return mText;
    }
}