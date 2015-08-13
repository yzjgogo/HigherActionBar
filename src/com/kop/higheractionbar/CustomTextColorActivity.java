package com.kop.higheractionbar;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;

public class CustomTextColorActivity extends Activity  implements ActionBar.TabListener {

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_abtextcoloer);
		//创建ActionBar Tab选项
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		//不指定文本setText时可在自定义tab样式，进styles.xml看看
		actionBar.addTab(actionBar.newTab()
                .setTabListener(this));
 
        actionBar.addTab(actionBar.newTab()
                .setTabListener(this));
 
        actionBar.addTab(actionBar.newTab().setText("tab3")
                .setTabListener(this));
 
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

}
