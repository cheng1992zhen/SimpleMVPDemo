package com.example.todomvpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

/**
 * activity 充当View层
 * 通过presenter构造方法将View 传递给Presenter层
 * 在presenter构造方法内将Presenter传递给View层
 * 从而实现了P层和V层的相互持有
 *
 * @author Administrator
 */
public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter mPresenter;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv_content);
        mPresenter = new MainPresenter(this);
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        this.mPresenter = presenter;
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void setTextView() {
        textView.setText(mPresenter.getMessage());
    }
}
