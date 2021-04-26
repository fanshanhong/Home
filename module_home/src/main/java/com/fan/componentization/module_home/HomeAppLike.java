package com.fan.componentization.module_home;

import android.content.Context;

import com.fan.componentization.apt_annotation.AppLifeCycle;
import com.fan.componentization.common.IAppLike;
import com.fan.componentization.module_comm.BaseAppLike;
import com.fan.componentization.module_comm.MyCommon;

/**
 * @Description:
 * @Author: shanhongfan
 * @Date: 2021/4/25 13:50
 * @Modify:
 */
@AppLifeCycle
public class HomeAppLike implements IAppLike {

    @Override
    public int getPriority() {
        return 5;
    }

    @Override
    public void onCreate(Context context) {
        System.out.println("=-=====HomeAppLike 执行了");
    }

    @Override
    public void onTerminate() {

    }
}
