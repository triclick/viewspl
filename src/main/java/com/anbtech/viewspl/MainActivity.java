package com.anbtech.viewspl;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
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

//SuppressWarnings("deprecation")
//@SuppressLint("UseCompatLoadingForDrawables")
@SuppressWarnings("deprecation")

public class MainActivity extends TabActivity {

    TabHost tabHost ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setTheme(R.style.Theme_big);
        setContentView(R.layout.activity_main);

        tabHost = getTabHost() ;

        // Intent intent ;
        //TabHost tabHost=(TabHost)findViewById(R.id.tabs) ;

        TabHost.TabSpec tapSpec1 = tabHost.newTabSpec("Tab1").setIndicator("1st Tab") ;
        tapSpec1.setContent(R.id.tab1) ;
        tabHost.addTab(tapSpec1);

        TabHost.TabSpec tapSpec2 = tabHost.newTabSpec("Tab2").setIndicator("2nd Tab") ;
        tapSpec2.setContent(R.id.tab2) ;
        tabHost.addTab(tapSpec2);

        Drawable img = getResources().getDrawable(R.drawable.star) ;
        TabHost.TabSpec tapSpec3 = tabHost.newTabSpec("Tab3").setIndicator("3rd Tab",img) ;
        tapSpec1.setContent(R.id.tab3) ;
        tabHost.addTab(tapSpec3);

        tabHost.setCurrentTab(0);

        //View myView ;

        Log.e("tag","error message") ;
        Log.w("tag","warning message") ;
        Log.i("tag","information message") ;
        Log.d("tag","debugging message") ;
        Log.v("tag","verbose message") ;
    }

}