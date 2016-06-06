package com.dailin.slidingmenuapp;
/*
* 使用slidingmenu
* 1.引入slidingmenu
* 2.继承SlidingFragmentActivity
* 3.类型改成public
* */

import android.os.Bundle;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

public class MainActivity extends SlidingFragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //设置侧边栏
        setBehindContentView(R.layout.left_fragment);
        SlidingMenu slidingMenu = getSlidingMenu();

        //设置全屏触摸
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        //设置侧边栏宽度(设置的是屏幕预留宽度)
        slidingMenu.setBehindOffset(200);
    }
}
