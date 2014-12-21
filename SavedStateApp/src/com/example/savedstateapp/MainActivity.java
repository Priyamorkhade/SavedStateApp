package com.example.savedstateapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

		Button one;
		TextView t;
		EditText e;
		String userInput;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		one=(Button) findViewById(R.id.btn_click);
		t=(TextView) findViewById(R.id.txt_display);
		e=(EditText) findViewById(R.id.edt_plaintxt);
		
		one.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				userInput=e.getText().toString();
				t.setText(userInput);
				
				
				
			}
		});
	}
	@Override
	protected void onSaveInstanceState(Bundle outState) {
	// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
		outState.putString("name", userInput);
		
	}

	@Override
	protected void onRestoreInstanceState(Bundle outState) {
	// TODO Auto-generated method stub
	super.onRestoreInstanceState(outState);
	
	t.setText(outState.getString("name"));
	
	}
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		return true;
	}

}
