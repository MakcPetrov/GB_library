package ru.k113.myapplication;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

class SecondPresenter extends MvpPresenter<SecondView> {
    private Model model;
    private MainView mainView;

    public SecondPresenter(){
        model = new Model();
        mainView.mSetText(model.getS());
    }

    public void onButton1Click() {
        model.setS(model.concatS(mainView.getmEditText()));
        mainView.mSetText(model.getS());// так идеологически правильнее, но лишние вызовы, не лучше ли сохранить текст в локальной переменной и с ней оперировать?
        mainView.mSetEditText("");//очистить поле
    }
    public void onButton2Click() {
        mainView.mSetText("");//очистить поле
        model.setS("");//очистить данные в модели//R.string.input требует инта
    }


}
