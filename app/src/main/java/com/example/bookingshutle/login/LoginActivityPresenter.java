package com.example.bookingshutle.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.example.bookingshutle.entity.LoginUser;
import com.example.bookingshutle.model.repository.impl.LoginUserRepository;
import com.example.bookingshutle.shutle.bookingsheat.BookingSheatActivity;
import com.example.bookingshutle.utility.dataenum.StaticData;

import java.util.List;

public class LoginActivityPresenter implements ILoginActivityPresenter  {

    private ILoginActivityView iLoginActivityView;
    private LoginUserRepository loginUserRepository;
    private List<LoginUser> loginUser;
    private Context context;
    private SharedPreferences pref;

    public LoginActivityPresenter(ILoginActivityView iLoginActivityView,Context context){
        this.iLoginActivityView=iLoginActivityView;
        this.context = context;
        loginUserRepository = new LoginUserRepository ();
        pref = context.getSharedPreferences(StaticData.USER_PREFERENCES, Context.MODE_PRIVATE);
    }

    @Override
    public void init() {

    }

    @Override
    public void setEditUserName(String userName) {
        if(userName== null || userName.equals("")){
            iLoginActivityView.manageEditUserName (false);
        }else {
            iLoginActivityView.manageEditUserName (true);
        }
        checkAllVariable();
    }

    @Override
    public void setEditPassword(String password) {
        if(password== null || password.equals("") || password.length() <8){
            iLoginActivityView.manageEditPassword (false);
        }else {
            iLoginActivityView.manageEditPassword (true);
        }
        checkAllVariable();
    }

    @Override
    public void setLogin(String userName, String password) {
        loginUser = loginUserRepository.isValidLogin(userName, password);
        if(loginUser.size() > 0){
            LoginUser entity = loginUser.get(0);
            SharedPreferences.Editor editor = pref.edit();
            editor.putInt("idsaved", entity.getUserId ());
            editor.apply();
            Intent intentToActivity = new Intent (context,BookingSheatActivity.class);
//            intentToActivity.putExtra("isPopulated", isPopulatedSw);
            context.startActivity(intentToActivity);
        }else {
            Toast.makeText(context, "Password yang anda masukkan salah", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void checkAllVariable() {
        iLoginActivityView.buttonLogin(true);
    }
}
