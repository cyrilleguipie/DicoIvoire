package com.gdg.bassam.dicoivoire;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuActivity extends Activity {
	
	private Button btBaoule, btBete, btMalinke, btSenoufo;
	private Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		btBaoule = (Button)findViewById(R.id.btBaoule);
		btBete = (Button)findViewById(R.id.btBete);
		btMalinke = (Button)findViewById(R.id.btMalinke);
		btSenoufo = (Button)findViewById(R.id.btSenoufo);
		intent = new Intent(MenuActivity.this, SearchActivity.class); 
		
		btBaoule.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.putExtra("dico", "baoule");
				startActivity(intent);
			}
		});
		
		btBete.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.putExtra("dico", "bete");
				startActivity(intent);
			}
		});
		
		btMalinke.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.putExtra("dico", "malinke");
				startActivity(intent);
			}
		});
		
		btSenoufo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.putExtra("dico", "senoufo");
				startActivity(intent);
			}
		});
		
	}

	
}
