package com.kop.higheractionbar;

import android.app.Activity;
import android.os.Bundle;

public class CustomActivity extends Activity {

	/**
	 * 看清单文件改activity的theme的引用
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom);
	}


}
