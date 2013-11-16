package com.gdg.bassam.dicoivoire;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SearchActivity extends Activity {
	private Button btDico, btInfos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
		btDico = (Button)findViewById(R.id.btDico);
		btInfos = (Button)findViewById(R.id.btInfos);
		
		
		btInfos.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(SearchActivity.this, InfosActivity.class);
				intent.putExtra("infos", getIntent().getExtras().getString("dico"));
				startActivity(intent);
			}
		});
		btDico.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent1 = new Intent(SearchActivity.this, AlphabetActivity.class);
				//intent1.putExtra("infos", getIntent().getExtras().getString("dico"));
				startActivity(intent1);
			}
		});
		
	}

	

}
