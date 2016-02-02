package com.example.new1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bneg extends Activity {
	
	Button bneg;
	Button oneg;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bnegative);
		
		bneg = (Button) findViewById(R.id.bneg);
		oneg = (Button) findViewById(R.id.oneg);
		
       bneg.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(bneg.this, bneg_list.class);
				startActivity(i);

			}
		});
       
       
       oneg.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(bneg.this, oneg_list.class);
				startActivity(i);

			}
		});
		
	
	
	}

}
