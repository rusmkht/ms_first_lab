package com.example.ms_first_lab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String [] groupMates;
    LayoutInflater inflater;

    public CustomBaseAdapter(Context contextt, String[] groupMatess){
        this.context = contextt;
        this.groupMates = groupMatess;
        this.inflater = LayoutInflater.from(contextt);
    }

    @Override
    public int getCount() {
        return groupMates.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_main3, null);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(groupMates[i]);
        return view;
    }
}
