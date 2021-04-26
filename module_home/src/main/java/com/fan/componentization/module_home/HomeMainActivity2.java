package com.fan.componentization.module_home;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.fan.componentization.export_cart.CartInfo;
import com.fan.componentization.export_cart.ICartService;

@Route(path = "/home/HomeMainActivity2")
public class HomeMainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);


        findViewById(R.id.to_cart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("222");
//通过路由跳转到 购物车组件的购物车页面（但没有依赖购物车组件）
                ARouter.getInstance()
                        .build("/cart/cartActivity")
                        .withString("key1", "value1")//携带参数1
                        .withString("key2", "value2")//携带参数2
                        .navigation();


//                Class targetClass = com.fan.componentization.module_cart.ARouter$$AAA$module_cart.findTargetClass("/cart/CartMyRouteActivity");
//                if(targetClass == null) {
//                    System.out.println("333");
//                } else {
//                    System.out.println("target bushi null");
//                    startActivity(new Intent(HomeMainActivity.this, targetClass));
//                }


            }
        });


        TextView view = findViewById(R.id.num);
        findViewById(R.id.to_get_num).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ICartService cartService=  (ICartService) ARouter.getInstance().build("/cart/service").navigation();
                CartInfo productCountInCart = cartService.getProductCountInCart();
                int num = productCountInCart.getNum();
                view.setText(num+"");
            }
        });

    }
}