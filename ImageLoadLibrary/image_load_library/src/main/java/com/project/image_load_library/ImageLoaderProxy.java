package com.project.image_load_library;

import android.content.Context;
import android.widget.ImageView;

/**
 * @author shaomiao
 * @Date 2017/3/16
 * @Time 15:26
 */

public class ImageLoaderProxy implements ImageLoad {

    private static ImageLoaderProxy imageLoaderProxy;

    private PicassoImageLoad imageLoad;

    public static ImageLoaderProxy getInstance() {
        if (imageLoaderProxy == null) {
            imageLoaderProxy = new ImageLoaderProxy();
        }
        return imageLoaderProxy;
    }

    public ImageLoaderProxy() {
        imageLoad = new PicassoImageLoad();
    }

    @Override
    public void init(Context context) {
        imageLoad.init(context);
    }

    @Override
    public void display(String url, ImageView imageView) {
        imageLoad.display(url,imageView);
    }

    @Override
    public void display(String url, ImageView imageView, int defaultImage) {
        imageLoad.display(url,imageView,defaultImage);
    }

    @Override
    public void display(String url, ImageView imageView, int defaultImage, int errorImage) {
        imageLoad.display(url,imageView,defaultImage,errorImage);
    }
}
