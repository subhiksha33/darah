package com.example.new1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class abpos extends Activity {
	
	Button apos;
	Button aneg;
	Button bpos;
	Button bneg;
	Button abpos;
	Button abneg;
	Button opos;
	Button oneg;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.abpositive);
		
		apos = (Button) findViewById(R.id.apos);
		aneg = (Button) findViewById(R.id.aneg);
		bpos = (Button) findViewById(R.id.bpos);
		bneg = (Button) findViewById(R.id.bneg);
		abpos = (Button) findViewById(R.id.abpos);
		abneg = (Button) findViewById(R.id.abneg);
		opos = (Button) findViewById(R.id.opos);
		oneg = (Button) findViewById(R.id.oneg);
		
		
       apos.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(abpos.this, apos_list.class);
				startActivity(i);

			}
		});
		
         aneg.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(abpos.this, aneg_list.class);
				startActivity(i);

			}
		});
		
	
         bpos.setOnClickListener(new View.OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 				
 				Intent i = new Intent(abpos.this, bpos_list.class);
 				startActivity(i);

 			}
 		});
         
         bneg.setOnClickListener(new View.OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 				
 				Intent i = new Intent(abpos.this, bneg_list.class);
 				startActivity(i);

 			}
 		});
         
         abpos.setOnClickListener(new View.OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 				
 				Intent i = new Intent(abpos.this, abpos_list.class);
 				startActivity(i);

 			}
 		});
 		
          abneg.setOnClickListener(new View.OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 				
 				Intent i = new Intent(abpos.this, abneg_list.class);
 				startActivity(i);

 			}
 		});
 		
 	
          opos.setOnClickListener(new View.OnClickListener() {
  			
  			@Override
  			public void onClick(View v) {
  				// TODO Auto-generated method stub
  				
  				Intent i = new Intent(abpos.this, opos_list.class);
  				startActivity(i);

  			}
  		});
          
          oneg.setOnClickListener(new View.OnClickListener() {
  			
  			@Override
  			public void onClick(View v) {
  				// TODO Auto-generated method stub
  				
  				Intent i = new Intent(abpos.this, oneg_list.class);
  				startActivity(i);

  			}
  		});
  		
 		
		
		
	}

}
