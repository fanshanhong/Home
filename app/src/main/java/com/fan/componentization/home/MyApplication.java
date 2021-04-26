package com.fan.componentization.home;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @Description:
 * @Author: shanhongfan
 * @Date: 2021/4/22 17:59
 * @Modify:
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 这两行必须写在init之前，否则这些配置在init过程中将无效
        // 打印日志
        ARouter.openLog();
        // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        ARouter.openDebug();
        // 尽可能早，推荐在Application中初始化
        ARouter.init(this);

    }
}
