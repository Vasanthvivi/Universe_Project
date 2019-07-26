package com.vivi.universe;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Mars extends Activity {
TextView t;
ImageView i;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_mars);
		t=(TextView)findViewById(R.id.marscontent);
		i=(ImageView)findViewById(R.id.marsimage);
		Animation fad=AnimationUtils.loadAnimation(getBaseContext(), R.anim.fadein);
		t.startAnimation(fad);
		Animation zo=AnimationUtils.loadAnimation(getBaseContext(), R.anim.zoom2);
		i.startAnimation(zo);
	}
	public void marsimageclick(View v)
	{
		Animation j=AnimationUtils.loadAnimation(getBaseContext(),R.anim.zoom2);
		i.startAnimation(j);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mars, menu);
		return true;
	}

}
