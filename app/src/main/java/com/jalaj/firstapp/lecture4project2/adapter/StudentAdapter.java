package com.jalaj.firstapp.lecture4project2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jalaj.firstapp.lecture4project2.R;
import com.jalaj.firstapp.lecture4project2.Student;

import java.util.ArrayList;

/**
 * Created by jalajmehta on 7/3/16.
 */

public class StudentAdapter extends BaseAdapter {

    ArrayList<Student> arrayList;
    LayoutInflater layoutInflater;

    public StudentAdapter(ArrayList<Student> arrayList, Context ctx) {
        this.arrayList = arrayList;
layoutInflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.layout_item_view,parent,false);
        Student student = (Student)getItem(position);
        TextView tName = (TextView)convertView.findViewById(R.id.txtName);
        TextView tPhone = (TextView)convertView.findViewById(R.id.txtPhone);
        tName.setText(student.getName());
        tPhone.setText(student.getPhone());
        return convertView;
    }
}
