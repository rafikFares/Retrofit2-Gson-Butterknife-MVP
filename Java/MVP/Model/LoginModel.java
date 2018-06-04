package com.example.paramedics.myrxjava.MVP.Model;

import android.util.Log;

import com.example.paramedics.myrxjava.MVP.Presenter.LoginPresenter;
import com.example.paramedics.myrxjava.MVP.Singleton;
import com.example.paramedics.myrxjava.MVP.View.LoginView;
import com.example.paramedics.myrxjava.Taxi;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import rx.functions.Action0;

public class LoginModel implements LoginPresenter {

    private LoginView loginView;

    private String mUserName;
    private String mPassword;
    private Single<Boolean> booleanObservable;


    public LoginModel(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void connectMe() {
        if (loginView.getName() == null || loginView.getPassword() == null || loginView.getName().equals("") || loginView.getPassword().equals("")) {
            loginView.empty();
        } else {
            mUserName = loginView.getName();
            mPassword = loginView.getPassword();

            booleanObservable = connect();

            booleanObservable.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(t ->setResult(t),
                            throwable -> throwable.printStackTrace());

        }

    }

    Single<Boolean> connect() {
        return Singleton.getApiInterface().txVerification(mUserName, mPassword)   // la reponse est un objet Taxi
                .map(Taxi::isSuccess);                                   // extract results from response retourne la liste de drivers
    }

    private void setResult(Boolean tmp) {
        if (tmp) {
            loginView.success();
        } else {
            loginView.fail();
        }
    }


}
