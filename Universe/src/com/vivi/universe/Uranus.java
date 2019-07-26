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

public class Uranus extends Activity {
TextView uc;
ImageView i;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_uranus);
		uc=(TextView)findViewById(R.id.uranuscontent);
		i=(ImageView)findViewById(R.id.uranusimage);
		Animation ur=AnimationUtils.loadAnimation(getBaseContext(), R.anim.fadein);
		uc.startAnimation(ur);
		Animation ura=AnimationUtils.loadAnimation(getBaseContext(), R.anim.zoom2);
		i.startAnimation(ura);
		}
	public void uranusimageclick(View v)
	{
		Animation uran=AnimationUtils.loadAnimation(getBaseContext(), R.anim.zoom2);
		i.startAnimation(uran);
;	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.uranus, menu);
		return true;
	}

}
