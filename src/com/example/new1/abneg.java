package com.example.new1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class abneg extends Activity{

	
	Button aneg;
	
	Button bneg;
	
	Button abneg;
	
	Button oneg;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.abnegative);
		
		
		aneg = (Button) findViewById(R.id.aneg);
	
		bneg = (Button) findViewById(R.id.bneg);
		
		abneg = (Button) findViewById(R.id.abneg);
		
		oneg = (Button) findViewById(R.id.oneg);
		
		
		 aneg.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent i = new Intent(abneg.this, aneg_list.class);
					startActivity(i);

				}
			});
		 
		 
		 bneg.setOnClickListener(new View.OnClickListener() {
	 			
	 			@Override
	 			public void onClick(View v) {
	 				// TODO Auto-generated method stub
	 				
	 				Intent i = new Intent(abneg.this, bneg_list.class);
	 				startActivity(i);

	 			}
	 		});
	         
		
		 abneg.setOnClickListener(new View.OnClickListener() {
	 			
	 			@Override
	 			public void onClick(View v) {
	 				// TODO Auto-generated method stub
	 				
	 				Intent i = new Intent(abneg.this, abneg_list.class);
	 				startActivity(i);

	 			}
	 		});
		
		
		 oneg.setOnClickListener(new View.OnClickListener() {
	  			
	  			@Override
	  			public void onClick(View v) {
	  				// TODO Auto-generated method stub
	  				
	  				Intent i = new Intent(abneg.this, oneg_list.class);
	  				startActivity(i);

	  			}
	  		});
	  		
	 		
		
	
	
		
	
	}
	
		

}
