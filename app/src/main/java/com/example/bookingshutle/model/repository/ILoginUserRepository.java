package com.example.bookingshutle.model.repository;

import com.example.bookingshutle.entity.LoginUser;

import java.util.List;

public interface ILoginUserRepository {
    boolean saveNewUser(LoginUser entity);
    boolean isExistUsername(String username);
    List<LoginUser> isValidLogin(String username, String password);
}
