package ru.test.moxymvp.mvp.presenters;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import ru.test.moxymvp.R;
import ru.test.moxymvp.mvp.views.HelloWorldView;

@InjectViewState
public class HelloWorldPresenter extends MvpPresenter<HelloWorldView> {
    public HelloWorldPresenter() {
        getViewState().showMessage(R.string.hello_world);
    }
}
