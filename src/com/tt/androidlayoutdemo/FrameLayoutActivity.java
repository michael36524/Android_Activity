package com.tt.androidlayoutdemo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class FrameLayoutActivity extends Activity {
	private ImageView image1;
	private ImageView image2;
	private ImageView image3;
	private ImageView image4;
	private ImageView image5;
	private List<ImageView> list;
	int count = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_frame_layout);
		image1 = (ImageView)findViewById(R.id.image1);
		image2 = (ImageView)findViewById(R.id.image2);
		image3 = (ImageView)findViewById(R.id.image3);
		image4 = (ImageView)findViewById(R.id.image4);
		image5 = (ImageView)findViewById(R.id.image5);
		list = new ArrayList<ImageView>();
		list.add(image1);
		list.add(image2);
		list.add(image3);
		list.add(image4);
		list.add(image5);
		showImage();
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		if (event.getAction() == MotionEvent.ACTION_DOWN){
			showImage();
		}
		return super.onTouchEvent(event);
	}

	private void showImage() {
		// TODO Auto-generated method stub
		count = count % 5;
		for(ImageView img : list){
			img.setVisibility(View.INVISIBLE);
		}
		list.get(count).setVisibility(View.VISIBLE);
		count++;
	}
	
}
