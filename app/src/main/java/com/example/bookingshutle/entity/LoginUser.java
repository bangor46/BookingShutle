package com.example.bookingshutle.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.List;

@Entity(tableName = "USER")
public class LoginUser implements Serializable {
    @ColumnInfo(name = "ID")
    @PrimaryKey(autoGenerate = true)
    private long id;

    @ColumnInfo(name = "USER_ID")
    private int userId;

    @ColumnInfo(name = "USER_NAME")
    private String userName;

    @ColumnInfo(name = "EMAIL")
    private String email;

    @ColumnInfo(name = "PASSWORD")
    private int password;

    @ColumnInfo(name = "FIREBASE_TOKEN")
    private String firebaseToken;

    @ColumnInfo(name = "USER_LEVEL")
    private int userLevel;

    @ColumnInfo(name = "STATUS")
    private int status;

    @ColumnInfo(name = "CREATED_BY")
    private String createdBy;

    @ColumnInfo(name = "CREATED_BY_NAME")
    private String createdByName;

    @ColumnInfo(name = "CREATED_TERMINAL")
    private String createdTerminal;

    @Ignore
    private List<LoginUser> loginUserListViewModel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getFirebaseToken() {
        return firebaseToken;
    }

    public void setFirebaseToken(String firebaseToken) {
        this.firebaseToken = firebaseToken;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    public String getCreatedTerminal() {
        return createdTerminal;
    }

    public void setCreatedTerminal(String createdTerminal) {
        this.createdTerminal = createdTerminal;
    }

    public List<LoginUser> getLoginUserListViewModel() {
        return loginUserListViewModel;
    }

    public void setLoginUserListViewModel(List<LoginUser> loginUserListViewModel) {
        this.loginUserListViewModel = loginUserListViewModel;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "id=" + id +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", firebaseToken='" + firebaseToken + '\'' +
                ", userLevel=" + userLevel +
                ", status=" + status +
                ", createdBy='" + createdBy + '\'' +
                ", createdByName='" + createdByName + '\'' +
                ", createdTerminal='" + createdTerminal + '\'' +
                ", loginUserListViewModel=" + loginUserListViewModel +
                '}';
    }
}
