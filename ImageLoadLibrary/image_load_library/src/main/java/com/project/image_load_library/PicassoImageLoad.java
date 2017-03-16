package com.project.image_load_library;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * @author shaomiao
 * @Date 2017/3/16
 * @Time 15:29
 */

public class PicassoImageLoad implements ImageLoad {

    private Picasso picasso;

    @Override
    public void init(Context context) {
        picasso = Picasso.with(context);
    }

    @Override
    public void display(String url, ImageView imageView) {
        picasso.load(url).into(imageView);
    }

    @Override
    public void display(String url, ImageView imageView, int defaultImage) {
        picasso.load(url).placeholder(defaultImage).into(imageView);
    }

    @Override
    public void display(String url, ImageView imageView, int defaultImage, int errorImage) {
        picasso.load(url).placeholder(defaultImage).error(errorImage).into(imageView);
    }
}
