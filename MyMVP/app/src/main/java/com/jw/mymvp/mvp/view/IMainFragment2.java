package com.jw.mymvp.mvp.view;
/**
 * Created by Administrator on 2017/7/16.
 */

public interface IMainFragment2{
    void showLoading();
    void dimissLoading();
    void getData();
    void initData();
    void onSuccess(String result);
    void onEmpty();
    void netError();
}
