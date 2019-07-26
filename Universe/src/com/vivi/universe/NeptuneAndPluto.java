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

public class NeptuneAndPluto extends Activity {
TextView content,contentt;
ImageView i2,i3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_neptune_and_pluto);
		content=(TextView)findViewById(R.id.neptunecontent);
		contentt=(TextView)findViewById(R.id.plutocontent);
		i2=(ImageView)findViewById(R.id.neptuneimage);
		//i3=(ImageView)findViewById(R.id.plutoimage);
		Animation c1=AnimationUtils.loadAnimation(getBaseContext(), R.anim.fadein);
		Animation c2=AnimationUtils.loadAnimation(getBaseContext(), R.anim.fadein);
		Animation ii=AnimationUtils.loadAnimation(getBaseContext(), R.anim.zoom2);
		//Animation iii=AnimationUtils.loadAnimation(getBaseContext(), R.anim.zoom2);
		content.startAnimation(c1);
		//contentt.startAnimation(c2);
		i2.startAnimation(ii);
		//i3.startAnimation(iii);
	}
	public void neptuneimageclick(View v)
	{
		Animation dss=AnimationUtils.loadAnimation(getBaseContext(), R.anim.zoom2);
		i2.startAnimation(dss);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.neptune_and_pluto, menu);
		return true;
	}

}
