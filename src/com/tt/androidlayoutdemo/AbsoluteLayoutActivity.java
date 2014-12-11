package com.tt.androidlayoutdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;


public class AbsoluteLayoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_absolute_layout);
		LinearLayout rl = (LinearLayout)findViewById(R.id.linearlayout);
		TextView tv1 = new TextView(this);
		TextView tv2 = new TextView(this);
		tv1.setText("ted");
		tv2.setText("john");
		rl.addView(tv1);
		rl.addView(tv2);
	}
}
