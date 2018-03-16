package edu.temple.gridcolors;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PaletteFragment extends android.support.v4.app.Fragment {

    public static PaletteFragment newInstance() {

        return new PaletteFragment();
    }

    public PaletteFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // create the colors
        //Resources res = getResources(); // create a new resource
        //final String[] colors = res.getStringArray(R.array.colors); // create a list of colors
       // final String cShade[] = {"red", "blue", "green", "black", "white", "gray", "cyan", "magenta", "yellow", "lightgray"}; // colors for background

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palette, container, false);
       // GridView gridViewFrag = (GridView) view.findViewById(R.id.gridFragment);
       // gridViewFrag.setAdapter(new GridAdapter(colors, (MainActivity) getContext().getApplicationContext()));   // set the adapter
        return view;
    }

} // end class PaletteFragment
