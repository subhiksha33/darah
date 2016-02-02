package com.example.new1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aneg extends Activity{
	
	Button aneg;
	Button oneg;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anegative);
		
		aneg = (Button) findViewById(R.id.aneg);
		oneg = (Button) findViewById(R.id.oneg);
		
       aneg.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(aneg.this, aneg_list.class);
				startActivity(i);

			}
		});
       
       
       oneg.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(aneg.this, oneg_list.class);
				startActivity(i);

			}
		});
		
	
	
	}

}
