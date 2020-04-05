package com.example.bookingshutle.login;

public interface ILoginActivityPresenter {
    void init();
    void setEditUserName(String userName);
    void setEditPassword(String password);
    void setLogin(String userName,String password);
    void checkAllVariable();
}
