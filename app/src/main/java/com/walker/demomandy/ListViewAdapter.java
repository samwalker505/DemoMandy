package com.walker.demomandy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by samwalker on 25/2/16.
 */
public class ListViewAdapter extends BaseAdapter {

    ArrayList<Student> studentArrayList;
    Context c;

    public ListViewAdapter(ArrayList<Student> studentArrayList, Context c) {
        this.studentArrayList = studentArrayList;
        this.c = c;
    }

    @Override
    public int getCount() {
        return studentArrayList.size();
    }

    @Override
    public Student getItem(int i) {
        return studentArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = View.inflate(c, R.layout.row_student, null);
        TextView txt = (TextView) view.findViewById(R.id.txt);
        Student s = getItem(i);
        txt.setText(String.valueOf(s.getSid())+ " " + s.getClassNo() +" "+ s.getName());
        return view;
    }
}
