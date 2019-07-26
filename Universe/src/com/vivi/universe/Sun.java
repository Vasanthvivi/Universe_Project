package com.vivi.universe;

import android.os.Bundle;
import android.widget.*;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Sun extends Activity {
TextView t;
ImageView i;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_sun);
		t=(TextView)findViewById(R.id.suncontent);
		i=(ImageView)findViewById(R.id.sunimage);
		Animation su=AnimationUtils.loadAnimation(getBaseContext(), R.anim.fadein);
		Animation ssu=AnimationUtils.loadAnimation(getBaseContext(), R.anim.zoom2);
		t.startAnimation(su);
		i.startAnimation(ssu);
	}
	public void sunimageclick(View v)
	{
		Animation si=AnimationUtils.loadAnimation(getBaseContext(), R.anim.zoom2);
		i.startAnimation(si);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sun, menu);
		return true;
	}

}
