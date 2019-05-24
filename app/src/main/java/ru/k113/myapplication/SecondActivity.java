package ru.k113.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;


public class SecondActivity extends MvpAppCompatActivity implements SecondView {

    @InjectPresenter
    SecondPresenter presenter;

    @ProvidePresenter
    public SecondPresenter providePresenter() {
        return new SecondPresenter();
    }

    private Button mButton1,mButton2;
    private TextView mTextView;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton1 = findViewById(R.id.button_1_activity_main);
        mButton2 = findViewById(R.id.button_2_activity_main);
        mTextView = findViewById(R.id.text_view);
        mEditText= findViewById(R.id.edit_text);
    }

    public void button1Click(View view){
        presenter.setmEditText(mEditText.getText().toString());
        presenter.onButton1Click();
    }

    public void button2Click(View view){
        presenter.setmEditText(mEditText.getText().toString());
        presenter.onButton2Click();
    }

    public void mSetText(String text) {
        mTextView.setText(text);
    }

    @Override
    public void mSetEditText(String text) {
        mEditText.setText(text);
    }

//    @Override
//    public void setButtonText(int btn_text) {//не знаю, почему int, но на String матерится
//        mButton1.setText(btn_text);
//    }

}
