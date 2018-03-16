package edu.temple.gridcolors;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.lang.reflect.Parameter;

// custom grid adapter
public class GridAdapter extends BaseAdapter {

    private final String[] colors;  // a list of colors
    private final Context context;  // context

    // constructor
    public GridAdapter(String[] colors, Context context) {

        this.colors = colors;
        this.context = context;

    }

    // get the number of colors
    @Override
    public int getCount() {
        return colors.length;
    }

    // get the color at a specific position
    @Override
    public Object getItem(int position) {

        return colors[position];

    }

    // get the item id
    @Override
    public long getItemId(int position) {

        return position;

    }

    // make the grid view
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        final String colorShade[] = {"red", "blue", "green", "black", "white", "gray", "cyan", "magenta", "yellow", "lightgray"};

        TextView t = new TextView(context);

        t.setText(colors[position].toString());

        t.setBackgroundColor(Color.parseColor(colorShade[position]));

        if (view == null) {

            t = new TextView(context);

        }

        //t.setTextAlignment();

        return t;

    }

}



