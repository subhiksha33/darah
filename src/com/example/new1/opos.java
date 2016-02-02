package com.example.new1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class opos extends Activity{
	
	Button opos;
	Button oneg;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.opositive);
		
		opos = (Button) findViewById(R.id.opos);
		oneg = (Button) findViewById(R.id.oneg);
		
		opos.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(opos.this, opos_list.class);
				startActivity(i);

			}
		});
		
		
		oneg.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(opos.this, oneg_list.class);
				startActivity(i);

			}
		});
		
		
		
		
		
	}
	

}
