package com.example.new1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bpos extends Activity{
	
	Button bpos;
	Button bneg;
	Button opos;
	Button oneg;
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bpositive);
		
		bpos = (Button) findViewById(R.id.bpos);
		bneg = (Button) findViewById(R.id.bneg);
		opos = (Button) findViewById(R.id.opos);
		oneg = (Button) findViewById(R.id.oneg);
		
		bpos.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(bpos.this, bpos_list.class);
				startActivity(i);

			}
		});
		
         bneg.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(bpos.this, bneg_list.class);
				startActivity(i);

			}
		});
		
	
         opos.setOnClickListener(new View.OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 				
 				Intent i = new Intent(bpos.this, opos_list.class);
 				startActivity(i);

 			}
 		});
         
         oneg.setOnClickListener(new View.OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 				
 				Intent i = new Intent(bpos.this, oneg_list.class);
 				startActivity(i);

 			}
 		});
 		
 		
	}

}
