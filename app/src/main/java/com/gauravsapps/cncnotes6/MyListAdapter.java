package com.gauravsapps.cncnotes6;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Gaurav Pawar on 25-05-2019.
 */

public class MyListAdapter extends ArrayAdapter<String>{

    private final Activity context ;
    private final String[] proNames;
    private final Integer[] proImages;

    public MyListAdapter(Activity context, String[] proNames, Integer[] proImages) {

        super(context, R.layout.activity_card_1,proNames);
        this.context = context;
        this.proNames = proNames;
        this.proImages = proImages;
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_card_1,null,true);
        TextView textTitle = (TextView) rowView.findViewById(R.id.tvOflv);
        ImageView imageView =(ImageView) rowView.findViewById(R.id.ivOflv);

        textTitle.setText(proNames[position]);
        imageView.setImageResource(proImages[position]);

        return rowView;
    }
}
