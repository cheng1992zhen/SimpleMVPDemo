package com.example.todomvpdemo;

public interface MainContract {
    interface View extends BaseView<Presenter> {
        void setTextView();
    }

    interface Presenter extends BasePresenter {
        String getMessage();
    }
}
