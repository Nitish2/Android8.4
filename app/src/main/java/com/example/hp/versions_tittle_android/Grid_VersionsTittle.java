package com.example.hp.versions_tittle_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Hp on 18-08-2017.
 */

// BaseAdapter is common base class of common implementation for an Adapter
//Creating a class and extend it with BaseAdapter
public class Grid_VersionsTittle extends BaseAdapter {
    //Declaring variables
    private int images[];
    private String tittles[];
    private Context context;


    public Grid_VersionsTittle(Context context, int images[],String tittles[]){ // Creating method
        this.context=context; //Giving reference to the object
        this.images=images;
        this.tittles=tittles;

    }
    // Creating BaseAdapter methods
    @Override
    public int getCount() {
        return tittles.length;
    }

    @Override
    public Object getItem(int position) {
        return tittles[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    // getView method will creates new View for every image that is added to our adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridView = convertView ;
        if (convertView==null){ //If statement
            //LayoutInflator is use to manipulate XML file into its corresponding View objects
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.custom_versions_tittle,null);
        }
        // Creating and initializing image view object by id
        ImageView imageView =(ImageView) gridView.findViewById(R.id.images);
        TextView textView=(TextView) gridView.findViewById(R.id.tittles);
        // It displays the images and names at specified position in data set.
        imageView.setImageResource(images[position]);
        textView.setText(tittles[position]);

        return gridView; //Return statement
    }
}
