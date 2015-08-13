package com.kop.higheractionbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	private Button bt_custom_abTheme;
	private Button bt_custom_abTextColor;
	private Button bt_actonbar_voerlay;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt_custom_abTheme = (Button) findViewById(R.id.bt_custom_abTheme);
		bt_custom_abTextColor = (Button) findViewById(R.id.bt_custom_abTextColor);
		bt_actonbar_voerlay = (Button) findViewById(R.id.bt_actonbar_voerlay);
		bt_custom_abTheme.setOnClickListener(this);
		bt_custom_abTextColor.setOnClickListener(this);
		bt_actonbar_voerlay.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bt_custom_abTheme:
			Intent intent = new Intent(this,CustomActivity.class);
			startActivity(intent);
			break;
		case R.id.bt_custom_abTextColor:
			Intent intentTextColor = new Intent(this,CustomTextColorActivity.class);
			startActivity(intentTextColor);
			break;
		case R.id.bt_actonbar_voerlay:
			Intent intentOverlay = new Intent(this,ActionBarOverLayActivity.class);
			startActivity(intentOverlay);
			break;
		default:
			break;
		}
	}
}
