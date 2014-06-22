package com.example.newboston;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	int counter;
	Button add;
	Button sub;
	TextView display;
	String tvDisplay;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		counter = 0;
		add 	= (Button)findViewById(R.id.a1_bAdd);
		sub 	= (Button)findViewById(R.id.a1_bSub);
		display = (TextView) findViewById(R.id.a1_tvDisplay);
		tvDisplay = getResources().getString(R.string.a1_display);
		
		add.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++;
				display.setText(tvDisplay + "" + counter);
			}
		});
		
		sub.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				display.setText(tvDisplay + "" + counter);
			}
			
		});
		
	}
	
	
}
