package com.example.mymenu.ui.newchannel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewChannelViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NewChannelViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Новый канал");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
