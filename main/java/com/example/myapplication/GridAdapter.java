package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
    private Context context;
    private String[] countryNames;
    private int[] flags;
    private String[] populations;

    public GridAdapter(Context context, String[] countryNames, int[] flags, String[] populations) {
        this.context = context;
        this.countryNames = countryNames;
        this.flags = flags;
        this.populations = populations;
    }

    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        }

        ImageView flagImage = convertView.findViewById(R.id.flagImage);
        TextView countryName = convertView.findViewById(R.id.countryName);
        TextView population = convertView.findViewById(R.id.population);

        flagImage.setImageResource(flags[position]);
        countryName.setText(countryNames[position]);
        population.setText("Population: " + populations[position]);

        return convertView;
    }
}
