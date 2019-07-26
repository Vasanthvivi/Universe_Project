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

public class Venus extends Activity {
TextView content;
ImageView i;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_venus);
		content=(TextView)findViewById(R.id.venuscontent);
		Animation c=AnimationUtils.loadAnimation(getBaseContext(), R.anim.fadein);
		content.startAnimation(c);
		i=(ImageView)findViewById(R.id.venusimage);
		Animation zoom=AnimationUtils.loadAnimation(getBaseContext(), R.anim.zoom2);
		i.startAnimation(zoom);
		
	}
	public void venusimageclick(View v)
	{
		Animation z=AnimationUtils.loadAnimation(getBaseContext(),R.anim.zoom2);
		i.startAnimation(z);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.venus, menu);
		return true;
	}

}
