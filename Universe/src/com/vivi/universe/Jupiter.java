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

public class Jupiter extends Activity {
TextView content;
ImageView i;
@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_jupiter);
		content=(TextView)findViewById(R.id.jupitercontent);
		i=(ImageView)findViewById(R.id.jupiterimage);
		Animation q=AnimationUtils.loadAnimation(getBaseContext(), R.anim.fadein);
		content.startAnimation(q);
		Animation qq=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom2);
		i.startAnimation(qq);
		
	}
public void jupiterimageclick(View v)
{
	Animation o=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom2);
	i.startAnimation(o);
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jupiter, menu);
		return true;
	}

}
