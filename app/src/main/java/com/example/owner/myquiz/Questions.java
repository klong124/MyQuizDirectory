package com.example.owner.myquiz;

import android.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;


public class Questions extends Activity {
    public static int count = 0;
    public Intent intent;
    public Fragment picFrag = new Picture();
    public Fragment texFrag = new Text();
    public Fragment scoFrag = new Score();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        this.callPicture();
        this.callText();

    }
    public void callPicture()
    {
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, picFrag)
                .addToBackStack(null)
                .commit();
    }
    public void callText()
    {
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, texFrag)
                .addToBackStack(null)
                .commit();
    }

    public void callScore()
    {
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, scoFrag)
                .addToBackStack(null)
                .commit();
    }
    public void returnStart()
    {
        intent = new Intent(this, com.example.owner.myquiz.StartActivity.class);
        startActivity(intent);
    }

}
