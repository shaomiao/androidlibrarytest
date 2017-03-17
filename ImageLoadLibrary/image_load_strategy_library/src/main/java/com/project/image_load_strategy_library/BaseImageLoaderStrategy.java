package com.project.image_load_strategy_library;

import android.content.Context;
import android.widget.ImageView;

import com.project.image_load_strategy_library.glideprogress.ProgressLoadListenter;

/**
 * @author shaomiao
 * @Date 2017/3/17
 * @Time 9:52
 * abstract class/interface defined to load image
 */

public interface BaseImageLoaderStrategy {

    // 无占位图
    void loadImage(String url, ImageView imageView);

    void loadImage(String url, int placeholder, ImageView imageView);

    void loadImage(Context context, String url, int placeholder, ImageView imageView);

    void loadGifImage(String url, int placeholder, ImageView imageView);

    // 加载图片进度
    void loadImageWithProgress(String url, ImageView imageView, ProgressLoadListenter listenter);

    void loadGifWithProgress(String url, ImageView imageView, ProgressLoadListenter listenter);

    // 清楚硬盘缓存
    void clearImageDiskCache(final Context context);

    // 清楚内存缓存
    void clearImageMemoryCache(Context context);

    // 根据不同的内存状态 来响应不同的内存释放策略
    void trimMemory(Context context,int level);

    // 获取缓存大小
    String getCacheSize(Context context);
}
