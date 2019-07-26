package com.vivi.universe;

import android.os.Bundle;
import android.widget.*;
import android.animation.*;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Saturn extends Activity {
TextView t;
ImageView i;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_saturn);
		t=(TextView)findViewById(R.id.saturncontent);
		i=(ImageView)findViewById(R.id.saturnimage);
		Animation sas=AnimationUtils.loadAnimation(getBaseContext(), R.anim.fadein);
		t.startAnimation(sas);
		Animation es=AnimationUtils.loadAnimation(getBaseContext(), R.anim.zoom2);
		i.startAnimation(es);
		
	}
	public void saturnimageclick(View v)
	{
		Animation is=AnimationUtils.loadAnimation(getBaseContext(), R.anim.zoom2);
		i.startAnimation(is);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.saturn, menu);
		return true;
	}

}
