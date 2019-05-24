package ru.k113.myapplication;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

interface SecondView extends MvpView{

    @StateStrategyType(value = AddToEndStrategy.class)

    void mSetText(String text);
    void mSetEditText(String text);
}
