package com.vivi.universe;

import android.os.Bundle;


import android.widget.*;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.content.*;
import android.view.View;

public class MainActivity extends Activity {
TextView t;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
t=(TextView)findViewById(R.id.textView1);
		
		Animation an=AnimationUtils.loadAnimation(getBaseContext(), R.anim.fadein);
		t.startAnimation(an);
		
		
	}
	public void click(View v)
	{
		Intent i=new Intent(MainActivity.this,MainActivity1.class);
		startActivity(i);
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
