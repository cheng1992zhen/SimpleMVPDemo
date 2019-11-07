package com.example.todomvpdemo;

import androidx.annotation.NonNull;

public class MainPresenter implements MainContract.Presenter {

    @NonNull
    private final MainContract.View rootView;

    public MainPresenter(MainContract.View rootView) {
        this.rootView = rootView;
        rootView.setPresenter(this);
    }

    @Override
    public String getMessage() {
        return "chengzhen";
    }


    @Override
    public void start() {
        rootView.setTextView();
    }
}
