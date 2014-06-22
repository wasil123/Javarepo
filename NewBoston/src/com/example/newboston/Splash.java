package com.example.newboston;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.lang.Thread;

public class Splash extends Activity {
	
	MediaPlayer ourSong;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		ourSong =MediaPlayer.create(Splash.this, R.raw.scratch);
		ourSong.start();
		
		Thread timer = new Thread(){
			
			public void run() {
				// TODO Auto-generated method stub
				try {
					sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					Intent openStartingPoint = new Intent("com.example.newboston.MENU");
					startActivity(openStartingPoint);
				}
			}
		};
		timer.start();
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
	}
}
