package com.example.conectacuatro;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void takeTurns(){
	ImageButton b = new ImageButton(this);
	b.setImageResource(R.drawable.c4_pressed_button_1);

	}
}
