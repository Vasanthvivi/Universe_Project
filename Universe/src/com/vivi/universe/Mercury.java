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

public class Mercury extends Activity {
TextView mc;
ImageView i;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_mercury);
		mc=(TextView)findViewById(R.id.mercurycontent);
		i=(ImageView)findViewById(R.id.mercuryimage);
		Animation me=AnimationUtils.loadAnimation(getBaseContext(), R.anim.fadein);
		mc.startAnimation(me);
		Animation mr=AnimationUtils.loadAnimation(getBaseContext(), R.anim.zoom2);
		i.startAnimation(mr);
	}
	public void mercuryimageclick(View v)
	{
		Animation mer=AnimationUtils.loadAnimation(getBaseContext(), R.anim.zoom2);
		i.startAnimation(mer);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mercury, menu);
		return true;
	}

}
