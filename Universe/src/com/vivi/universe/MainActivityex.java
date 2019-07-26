package com.vivi.universe;

import android.os.Bundle;
import android.os.Environment;
import android.content.*;
import android.widget.*;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

import java.io.*;

public class MainActivityex extends Activity {
	Button v,ma,e,j,s,me,ur,np,su,ab;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activityex);
		v=(Button)findViewById(R.id.veb);
		e=(Button)findViewById(R.id.eab);
		ma=(Button)findViewById(R.id.mab);
		j=(Button)findViewById(R.id.jub);
		s=(Button)findViewById(R.id.sab);
		me=(Button)findViewById(R.id.meb);
		ur=(Button)findViewById(R.id.urb);
		np=(Button)findViewById(R.id.neplb);
		su=(Button)findViewById(R.id.sunb);
		ab=(Button)findViewById(R.id.aboutb);
		ab.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent ai=new Intent(MainActivityex.this,About.class);
				
			}
		});
		v.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
		     
				Intent vi=new Intent(MainActivityex.this,Venus.class);
				startActivity(vi);
			}
		});
e.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
		     
				Intent vi=new Intent(MainActivityex.this,Earth.class);
				startActivity(vi);
			}
		});
j.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
     
		Intent vi=new Intent(MainActivityex.this,Jupiter.class);
		startActivity(vi);
	}
});

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activityex, menu);
		return true;
	}

}
