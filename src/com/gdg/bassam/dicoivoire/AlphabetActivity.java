package com.gdg.bassam.dicoivoire;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import android.widget.AdapterView;

public class AlphabetActivity extends Activity {
	private ListView lvAlphabet;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alphabet);
		lvAlphabet = (ListView)findViewById(R.id.lvAlphabet);
		String[] mot = new String[]{"A","B", "C", "D", "E", "F", "G", "H",
				"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
				"W", "X", "Y", "Z"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(AlphabetActivity.this, android.R.layout.simple_list_item_1, mot);
		lvAlphabet.setAdapter(adapter);
		
		lvAlphabet.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(AlphabetActivity.this, lvAlphabet.getItemAtPosition(arg2).toString(), 3000).show();
				
			}
		});
	}

	
}
