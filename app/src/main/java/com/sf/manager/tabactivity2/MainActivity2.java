package com.sf.manager.tabactivity2;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;

/**
 * Created by mj on 2015/12/1.
 */
public class MainActivity2 extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);

        //获得当前TabActivity的TabHost
        TabHost tabHost = getTabHost();

        LayoutInflater.from(this).inflate(R.layout.tab, tabHost.getTabContentView(), true);

        tabHost.addTab(tabHost.newTabSpec("tab1")
                .setIndicator("主页")
                .setContent(R.id.view1));
        tabHost.addTab(tabHost.newTabSpec("tab2")
                .setIndicator("标题")
                .setContent(R.id.view2));
        tabHost.addTab(tabHost.newTabSpec("tab3")
                .setIndicator("简介")
                .setContent(R.id.view3));
        tabHost.addTab(tabHost.newTabSpec("tab4")
                .setIndicator("关于")
                .setContent(R.id.view4));
    }


}
