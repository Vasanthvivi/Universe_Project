package com.vivi.universe;

import android.os.Bundle;
import android.widget.*;
import android.app.Activity;
import android.animation.*;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Earth extends Activity {
TextView content;
ImageView i;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_earth);
		content=(TextView)findViewById(R.id.contentearth);
		i=(ImageView)findViewById(R.id.earthimage);
		Animation as=AnimationUtils.loadAnimation(getBaseContext(), R.anim.fadein);
		content.startAnimation(as);
		Animation sa=AnimationUtils.loadAnimation(getBaseContext(),R.anim.zoom2);
		i.startAnimation(sa);
	}
public void earthimageclick(View v)
{
	Animation qw=AnimationUtils.loadAnimation(getBaseContext(), R.anim.zoom2);
	i.startAnimation(qw);
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.earth, menu);
		return true;
	}

}
