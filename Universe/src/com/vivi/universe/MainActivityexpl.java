package com.vivi.universe;

import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivityexpl extends Activity {
	Button v,ma,e,j,s,me,ur,np,su,ab;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activityexpl);
		
ma.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
		
				Intent mars=new Intent(MainActivityexpl.this,Mars.class);
				startActivity(mars);
			}
		});
e.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent ea=new Intent(MainActivityexpl.this,Earth.class);
		startActivity(ea);
	}
});
v.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {

		Intent eath=new Intent(MainActivityexpl.this,Venus.class);
		startActivity(eath);
	}
});
j.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent ju=new Intent(MainActivityexpl.this,Jupiter.class);
		startActivity(ju);
	}
});
s.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent satu=new Intent(MainActivityexpl.this,Saturn.class);
		startActivity(satu);
	}
});	
me.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent merc=new Intent(MainActivityexpl.this,Mercury.class);
		startActivity(merc);
	}
});
ur.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent uranu=new Intent(MainActivityexpl.this,Uranus.class);
		startActivity(uranu);
	}
});
 np.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent nepplu=new Intent(MainActivityexpl.this,NeptuneAndPluto.class);
		startActivity(nepplu);
	}
});
 su.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent sunn=new Intent(MainActivityexpl.this,Sun.class);
		startActivity(sunn);
	}
});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activityexpl, menu);
		return true;
	}

}
