package com.vivi.universe;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivityeain extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.earthin);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activityeain, menu);
		return true;
	}

}
