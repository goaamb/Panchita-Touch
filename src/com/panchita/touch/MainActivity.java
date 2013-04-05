package com.panchita.touch;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

@SuppressLint("SetJavaScriptEnabled")
public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		WebView wv = (WebView) findViewById(R.id.vistaWeb);
		wv.loadUrl("http://192.168.0.101/cocina/cocina");
		wv.getSettings().setLoadWithOverviewMode(true);
		wv.getSettings().setUseWideViewPort(true);
		wv.getSettings().setSupportZoom(true);
		wv.getSettings().setBuiltInZoomControls(true);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.setOnLongClickListener(new View.OnLongClickListener() {
			public boolean onLongClick(View arg0) {
				return true;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
