package com.tt.androidlayoutdemo;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {						

	String[] layouts = { "FrameLayout", "LinearLayout", "TableLayout",
			"RelativeLayout", "AbsoluteLayout", "LinearDemo" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main); 
		ListView listview = (ListView) findViewById(R.id.lvLayoutTitle);
		SimpleAdapter adapter = new SimpleAdapter(this, GetData(),
				R.layout.listview_title, new String[] { "title" },
				new int[] { R.id.tvTitle });
		listview.setAdapter(adapter);
		listview.setOnItemClickListener(new ListVewOnItemClickListener());
	}

	private ArrayList<HashMap<String, String>> GetData() {
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		for (String layout : layouts) {
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("title", layout);
			list.add(map);
		}
		return list;
	}
	
	class ListVewOnItemClickListener implements OnItemClickListener {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			Class<?> obj = null;
			switch(position){
			case 0:
				obj = FrameLayoutActivity.class;
				break;
			case 1:
				obj = LinearLayoutActivity.class;
				break;
			case 2:
				obj = TableLayoutActivity.class;
				break;
			case 3:
				obj = RelativeLayoutActivity.class;
				break;
			case 4:
				obj = AbsoluteLayoutActivity.class;
			case 5:
				obj = LinearLayoutDemoActivity.class;
				break;
			}
			intent.setClass(MainActivity.this, obj);
			startActivity(intent);
		}
	}

}
