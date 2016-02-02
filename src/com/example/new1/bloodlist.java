package com.example.new1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bloodlist extends Activity {


		Button a_pos;
		Button a_neg;
		Button b_pos;
		Button b_neg;
		Button ab_pos;
		Button ab_neg;
		Button o_pos;
		Button o_neg;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.bloodgroup);
			
			a_pos = (Button) findViewById(R.id.a_positive);
			a_neg = (Button) findViewById(R.id.a_negative);
			b_pos = (Button) findViewById(R.id.b_positive);
			b_neg = (Button) findViewById(R.id.b_negative);
			ab_pos = (Button) findViewById(R.id.ab_positive);
			ab_neg = (Button) findViewById(R.id.ab_negative);
			o_pos = (Button) findViewById(R.id.o_positive);
			o_neg = (Button) findViewById(R.id.o_negative);
			
			
			a_pos.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent i = new Intent(bloodlist.this, apos.class);
					startActivity(i);

				}
			});
			
			a_neg.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent i = new Intent(bloodlist.this, aneg.class);
					startActivity(i);

				}
			});
			
			b_pos.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent i = new Intent(bloodlist.this, bpos.class);
					startActivity(i);

				}
			});
			
			
			b_neg.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent i = new Intent(bloodlist.this, bneg.class);
					startActivity(i);

				}
			});
			
			
			ab_pos.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent i = new Intent(bloodlist.this, abpos.class);
					startActivity(i);

				}
			});
			
			
			ab_neg.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent i = new Intent(bloodlist.this, abneg.class);
					startActivity(i);

				}
			});
			
			
			o_pos.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent i = new Intent(bloodlist.this, opos.class);
					startActivity(i);

				}
			});
			
			
			o_neg.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent i = new Intent(bloodlist.this, oneg.class);
					startActivity(i);

				}
			});
}
}
