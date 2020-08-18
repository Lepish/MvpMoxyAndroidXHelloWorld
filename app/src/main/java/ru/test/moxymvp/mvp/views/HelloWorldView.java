package ru.test.moxymvp.mvp.views;

import com.arellomobile.mvp.MvpView;

public interface HelloWorldView extends MvpView {
    void showMessage(int message);
}
