package com.example.new1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class loginpage extends Activity {

	Button login_user;
	Button signup_user;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		login_user = (Button) findViewById(R.id.login);
		signup_user = (Button) findViewById(R.id.signup);
		
		
		
		
	}
		

}