package com.gdg.bassam.dicoivoire;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class InfosActivity extends Activity {
	private WebView wvInfos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_infos);
		wvInfos = (WebView)findViewById(R.id.wvInfos);
		if(getIntent().getExtras() != null){
			
			if((getIntent().getExtras().getString("infos")).equals("baoule")){
				wvInfos.loadUrl("file:///android_res/raw/baoule.html");
				
			}else if((getIntent().getExtras().getString("infos")).equals("bete")){
				wvInfos.loadUrl("file:///android_res/raw/bete.html");
			}
			else if((getIntent().getExtras().getString("infos")).equals("malinke")){
				wvInfos.loadUrl("file:///android_res/raw/malinke.html");
				
			}else if((getIntent().getExtras().getString("infos")).equals("senoufo")){
				wvInfos.loadUrl("file:///android_res/raw/senoufo.html");
			}
			//
		}
	}

	

}
