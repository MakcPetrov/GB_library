package ru.k113.myapplication;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class SecondPresenter extends MvpPresenter<SecondView> {
    private Model model;

    public void setmEditText(String editText) {
        mEditText = editText;
    }

    private String mEditText;


    public SecondPresenter(){
        this.model = new Model();
//        getViewState().mSetText(model.getS());
    }

    public void onButton1Click() {
        model.setS(model.concatS(mEditText));
        getViewState().mSetText(model.getS());// так идеологически правильнее, но лишние вызовы, не лучше ли сохранить текст в локальной переменной и с ней оперировать?
        getViewState().mSetEditText("");//очистить поле
    }
    public void onButton2Click() {
        getViewState().mSetText("");//очистить поле
        model.setS("");//очистить данные в модели//R.string.input требует инта
    }


}
