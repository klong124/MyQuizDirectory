package com.example.owner.myquiz;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class StartActivity extends Activity {
    Intent intent;
    private Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        intent = new Intent(this, Questions.class);
        btnClick = (Button)findViewById(R.id.start);
        btnClick.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                            startActivity(intent);
                                        }
                                    }
        );
    }



}
