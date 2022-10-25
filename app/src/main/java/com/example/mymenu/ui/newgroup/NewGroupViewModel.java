package com.example.mymenu.ui.newgroup;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewGroupViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NewGroupViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Новая группа");
    }

    public LiveData<String> getText() {
        return mText;
    }
}