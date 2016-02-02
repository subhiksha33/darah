package com.example.new1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class apos extends Activity{
	
	Button apos;
	Button aneg;
	Button opos;
	Button oneg;
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.apositive);
		
		apos = (Button) findViewById(R.id.aposi);
		aneg = (Button) findViewById(R.id.anega);
		opos = (Button) findViewById(R.id.oposi);
		oneg = (Button) findViewById(R.id.onega);
		
		apos.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(apos.this, apos_list.class);
				startActivity(i);

			}
		});
		
         aneg.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(apos.this, aneg_list.class);
				startActivity(i);

			}
		});
		
	
         opos.setOnClickListener(new View.OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 				
 				Intent i = new Intent(apos.this, opos_list.class);
 				startActivity(i);

 			}
 		});
         
         oneg.setOnClickListener(new View.OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 				
 				Intent i = new Intent(apos.this, oneg_list.class);
 				startActivity(i);

 			}
 		});
 		
 		
	}
	
}
