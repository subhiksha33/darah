package com.example.new1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class oneg extends Activity{
	
	Button oneg;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.onegative);
	
		oneg = (Button) findViewById(R.id.oneg);
		
        oneg.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(oneg.this, oneg_list.class);
				startActivity(i);

			}
		});
		
		
		
	}
	

}
