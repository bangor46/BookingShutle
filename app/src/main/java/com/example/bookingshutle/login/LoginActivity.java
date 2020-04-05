package com.example.bookingshutle.login;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.bookingshutle.R;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class LoginActivity extends Activity implements ILoginActivityView  {

    ILoginActivityPresenter iLoginActivityPresenter;

    @BindView(R.id.scroll_login)
    ScrollView scrollLogin;
    @BindView(R.id.layout_login)
    LinearLayout layoutLogin;
    @BindView(R.id.image_user_logo)
    ImageView imageUserLogo;
    @BindView(R.id.edit_user_name)
    EditText editUserName;
    @BindView(R.id.edit_password)
    EditText editPassword;
    @BindView(R.id.text_lupa_password)
    TextView textLupaPassword;
    @BindView(R.id.button_login)
    Button buttonLogin;
    @BindView(R.id.text_error_user_name)
    TextView textErrorUserName;
    @BindView(R.id.text_error_password)
    TextView textErrorPassword;

    @OnTextChanged(R.id.edit_user_name)
    void onEditUserNameTextChanged(Editable text){
        iLoginActivityPresenter.setEditUserName (String.valueOf(text));
    }

    @OnTextChanged(R.id.edit_password)
    void onEditPasswordTextChanged(Editable text){
        iLoginActivityPresenter.setEditPassword (String.valueOf(text));
    }

    @OnClick(R.id.button_login)
    void onButtonLoginClicked(){
        iLoginActivityPresenter.setLogin (editUserName.getText ().toString (),editPassword.getText ().toString ());
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    @Override
    public void buttonLogin(boolean isEnable) {
        buttonLogin.setEnabled(isEnable);
    }

    @Override
    public void manageEditUserName(boolean isValid) {
        if (isValid) {
            textErrorUserName.setVisibility(View.GONE);
        } else {
            textErrorUserName.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void manageEditPassword(boolean isValid) {
        if (isValid) {
            textErrorPassword.setVisibility(View.GONE);
        } else {
            textErrorPassword.setVisibility(View.VISIBLE);
        }
    }
}
