package com.can2do.bencaopinwe.search;

import com.dream.myqiyi.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
	Context mContext;
	String[] test1 = new String[] { "党参", "核桃", "核桃", "核桃", "核桃",
			"雪莲", "雪莲", "红枣", "雪莲", "枸杞" };

	public GridAdapter(Context cnt) {
		this.mContext = cnt;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return test1.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		if (arg1 == null) {
			arg1 = LayoutInflater.from(mContext).inflate(
					R.layout.search_grid_item, null);
		}
		TextView tv = (TextView) arg1.findViewById(R.id.title);
		tv.setText(test1[arg0]);
		return arg1;
	}

}
