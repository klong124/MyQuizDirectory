package com.example.owner.myquiz;

import android.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;


public class Questions extends Activity {
    public static int count = 0;
    public static String moveTo = "Picture";
    public Intent intent;
    public Fragment picFrag = new Picture();
    public Fragment texFrag = new Text();
    public Fragment scoFrag = new Score();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        if (moveTo.equals("Picture"))
            this.callPicture();
        if (moveTo.equals("Text"))
            this.callText();
        if (moveTo.equals("Score"))
            this.callScore();
        if (moveTo.equals("Start"))
            this.returnStart();
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
