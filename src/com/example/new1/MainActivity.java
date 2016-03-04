package com.example.newproject;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity{
	Button ok,cancel;
	String name,dob,gender,bloodgroup,emailid,phonenum,address,area;
	 TextView ename,edob,num,eadd,email;
	 RadioGroup radioGroup;
	 RadioButton radioSexButton;
	 Spinner s1;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ok=(Button)findViewById(R.id.ok);
		cancel=(Button)findViewById(R.id.cl);
		s1=(Spinner)findViewById(R.id.group);
		ename=(EditText) findViewById(R.id.ename);
		edob=(EditText) findViewById(R.id.edob);
		num=(EditText) findViewById(R.id.editText2);
		eadd=(EditText) findViewById(R.id.eadd);
		email=(EditText) findViewById(R.id.eemail);
		//e6=(EditText) findViewById(R.id.editText6);
		//e7=(EditText) findViewById(R.id.editText7);
		radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
		
		
		
	/*cancel=(Button)findViewById(R.id.cancel);
		cancel.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i2= new Intent(MainActivity.this,home.class);
				startActivity(i2);
			}
		});*/
		//ok=(Button)findViewById(R.id.ok1);  
		ok.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			       // get selected radio button from radioGroup
			       int selectedId = radioGroup.getCheckedRadioButtonId();
			 
			       // find the radiobutton by returned id
			       radioSexButton = (RadioButton) findViewById(selectedId);
			 
			       

			
			name = ename.getText().toString();
			  dob = edob.getText().toString();
			   gender = ((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId() )).getText().toString();
			//gender=.toString();
			   bloodgroup=s1.getSelectedItem().toString();
			   emailid=email.getText().toString();
			   gender=radioSexButton.getText().toString();
			   phonenum=num.getText().toString();
			   address=eadd.getText().toString();
			  // area=e7.getText().toString();
				try {
					
					name = URLEncoder.encode(name, "UTF-8");
					dob = URLEncoder.encode(dob, "UTF-8");
				    gender=URLEncoder.encode(gender,"UTF-8");
				    bloodgroup=URLEncoder.encode(bloodgroup,"UTF-8");
				    emailid=URLEncoder.encode(emailid,"UTF-8");
				  gender=URLEncoder.encode(gender,"UTF-8");
				   phonenum=URLEncoder.encode(phonenum,"UTF-8");
				   address=URLEncoder.encode(address,"UTF-8");
				 // area=URLEncoder.encode(area,"UTF-8");
				    
				    
					
					
					String url = "http://localhost/bloodcircle.php?name="+ name.trim() + "&dob="+ dob.trim() + "&gender="+gender.trim() +
					"&bloodgroup="+bloodgroup.trim() + "&emailid="+ emailid.trim() +"&phno="+phonenum.trim()+"&address="+address.trim();
					System.out.println(url);
					pass_value_to_db get = new pass_value_to_db();
					get.execute(new String[] { url });

				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

	}

	public class pass_value_to_db extends AsyncTask<String, Void, String> {

		ProgressDialog dialog;

		@Override
		protected void onPreExecute() { // TODO Auto-generated method stub
			dialog = new ProgressDialog(MainActivity.this);
			dialog.setTitle("Processing...");
			dialog.setMessage("Please wait.");
			dialog.setCancelable(false);
			dialog.show();
		}

		@Override
		protected String doInBackground(String... urls) {
			String result = "";
			for (String url : urls) {
				InputStream is = null;
				try {

					HttpClient httpclient = new DefaultHttpClient();
					HttpPost httppost = new HttpPost(url);
					HttpResponse response = httpclient.execute(httppost);
					int status = response.getStatusLine().getStatusCode();
					Log.d("KG", "status=" + status);

					if (status == 200) {
						HttpEntity entity = response.getEntity();
						is = entity.getContent();
						BufferedReader reader = new BufferedReader(
								new InputStreamReader(is, "iso-8859-1"), 8);
						String line = "";
						while ((line = reader.readLine()) != null) {
							result += line;
						}
						is.close();

						Log.v("KG", result);

					}
				} catch (Exception ex) {
					Log.e("Error", ex.toString());
				}
				
				//Toast.makeText(getApplicationContext(),"Registered successfully", Toast.LENGTH_LONG).show();
				//Intent i=new Intent(SubActivity.this,MainActivity.class);
				//startActivity(i);
			}
			return result;
		}

		protected void onPostExecute(String result) {
			Log.v("KG", "output=" + result);
			result = result.trim(); //
			// Toast.makeText(getApplicationContext(), result, //
			// Toast.LENGTH_LONG).show();
			if (result.equals("false")) {

				
				Toast.makeText(getApplicationContext()," Please try again later...", Toast.LENGTH_SHORT).show();
				
			} else {
			Toast.makeText(getApplicationContext(),"Login Sucessful", Toast.LENGTH_SHORT).show();
			Intent i = new Intent(MainActivity.this,next.class);
			startActivity(i);
			}

			if (dialog != null)
				dialog.dismiss();

		}
	}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
}


	
}
	
	


			
			
 

