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
		
		if(getIntent().getExtras() != null){
			
			if((getIntent().getExtras().getString("dico")).equals("baoule")){
				btInfos.setText("Infos sur les Baoules");
				
			}else if((getIntent().getExtras().getString("dico")).equals("bete")){
				btInfos.setText("Infos sur les Betes");
			}
			else if((getIntent().getExtras().getString("dico")).equals("malinke")){
				btInfos.setText("Infos sur les Malinkes");
				
			}else if((getIntent().getExtras().getString("dico")).equals("senoufo")){
				btInfos.setText("Infos sur les Senoufos");
			}
		}
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
