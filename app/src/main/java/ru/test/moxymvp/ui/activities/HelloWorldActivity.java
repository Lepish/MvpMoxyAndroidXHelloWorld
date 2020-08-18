package ru.test.moxymvp.ui.activities;

import android.os.Bundle;
import android.widget.TextView;


import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

import ru.test.moxymvp.R;
import ru.test.moxymvp.mvp.presenters.HelloWorldPresenter;
import ru.test.moxymvp.mvp.views.HelloWorldView;

public class HelloWorldActivity extends MvpAppCompatActivity implements HelloWorldView {

    @InjectPresenter
    HelloWorldPresenter mHelloWorldPresenter;

    private TextView mHelloWorldTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloworld);

        mHelloWorldTextView = ((TextView)findViewById(R.id.tv_helloWorld));
    }

    @Override
    public void showMessage(int message) {
        mHelloWorldTextView.setText(message);
    }
}
