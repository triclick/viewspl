package com.anbtech.viewspl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.annotation.SuppressLint;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setTheme(R.style.Theme_big);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost)findViewById(R.id.tabhost) ;
        tabHost.setup() ;

        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("Tab1") ;
        tabSpec1.setContent(R.id.content1);
        tabSpec1.setIndicator("TAB 1");
        tabHost.addTab(tabSpec1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("Tab2") ;
        tabSpec2.setContent(R.id.content2);
        tabSpec2.setIndicator("TAB 2");
        tabHost.addTab(tabSpec2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("Tab3") ;
        tabSpec3.setContent(R.id.content3);
        tabSpec3.setIndicator("TAB 3");
        tabHost.addTab(tabSpec3);

        //Drawable img = getResources().getDrawable(R.drawable.star) ;
        //TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("Tab3").setIndicator("3rd Tab",img) ;
        //tabSpec3.setContent(R.id.tab3) ;
        //tabHost.addTab(tabSpec3);

        //tabHost.setCurrentTab(0);

        //View myView ;

        Log.e("tag","error message") ;
        Log.w("tag","warning message") ;
        Log.i("tag","information message") ;
        Log.d("tag","debugging message") ;
        Log.v("tag","verbose message") ;
    }
}

