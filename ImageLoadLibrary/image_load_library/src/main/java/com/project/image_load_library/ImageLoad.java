package com.project.image_load_library;

import android.content.Context;
import android.widget.ImageView;

/**
 * @author shaomiao
 * @Date 2017/3/16
 * @Time 15:19
 */

public interface ImageLoad {

    void init(Context context);

    void display(String url, ImageView imageView);

    void display(String url, ImageView imageView, int defaultImage);

    void display(String url, ImageView imageView, int defaultImage,int errorImage);
}
