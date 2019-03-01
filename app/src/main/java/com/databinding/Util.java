package com.databinding;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

public class Util {
    @BindingAdapter({"imageurl"})
    public static void loadImage(ImageView view,String url){
        if(url==null){
            view.setImageResource(R.mipmap.ic_launcher);
        }else {

        }
    }
}
