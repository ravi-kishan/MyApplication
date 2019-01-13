package com.example.ravi.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class InformationAdapter extends ArrayAdapter {

    public InformationAdapter(Context context, ArrayList<Information> infos) {
        super(context, 0, infos);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        Information info = (Information) getItem(position);

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.information_item, parent, false);
        }

        TextView nameTextView = listItemView.findViewById(R.id.name_textview);
        TextView yearTextView = listItemView.findViewById(R.id.year_textview);

        nameTextView.setText(info.getName());
        yearTextView.setText(info.getYear());
        return listItemView;
    }
}
