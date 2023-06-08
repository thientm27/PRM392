package com.example.lab3presentation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FuirdAdapter extends BaseAdapter {
    private Context context;
    private int layout;

    private final List<Fuird> legends;

    public FuirdAdapter(Context context, int layout, List<Fuird> legends) {
        this.context = context;
        this.layout = layout;
        this.legends = legends;
    }

    @Override
    public int getCount() {
        return legends.size();
    }

    @Override
    public Object getItem(int position) {
        return legends.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        TextView tvFullName = view.findViewById(R.id.tvFullName);
        TextView tvDOB = view.findViewById(R.id.tvDOB);
        ImageView countryFlag = view.findViewById(R.id.countryFlag);
        ImageView imageResource = view.findViewById(R.id.imageResource);

        Fuird legend = legends.get(position);
        tvFullName.setText(legend.getFullName());
        tvDOB.setText(legend.getDescriptionString());
        imageResource.setImageResource(legend.getImageResource());
        return view;
    }
}
