package com.project.image_load_strategy_library;

import android.content.Context;
import android.widget.ImageView;

import com.project.image_load_strategy_library.glideprogress.ProgressLoadListenter;

/**
 * @author shaomiao
 * @Date 2017/3/17
 * @Time 9:48
 * use this class to load image,single instance
 */

public class ImageLoaderUtil {

    // 图片默认加载类型
    public static final int PIC_DEFAULT_TYPE = 0;

    // 图片默认加载策略
    public static final int LOAD_STRATEGY_DEFAULT = 0;

    private static ImageLoaderUtil mInstance;

    private BaseImageLoaderStrategy mStrategy;

    public ImageLoaderUtil() {
        mStrategy = new GlideImageLoaderStrategy();
    }

    // 单例模式，节省资源
    public static ImageLoaderUtil getInstance() {
        if (mInstance == null) {
            synchronized (ImageLoaderUtil.class) {
                if (mInstance == null) {
                    mInstance = new ImageLoaderUtil();
                    return mInstance;
                }
            }
        }
        return mInstance;
    }

    /**
     * 统一使用App context
     * 可能带来的问题：http://stackoverflow.com/questions/31964737/glide-image-loading-with-application-context
     * @param url
     * @param placeholder
     * @param imageView
     */
    public void loadImage(String url, int placeholder, ImageView imageView) {
        mStrategy.loadImage(imageView.getContext(),url,placeholder,imageView);
    }

    public void loadGifImage(String url, int placeholder, ImageView imageView) {
        mStrategy.loadGifImage(url,placeholder,imageView);
    }

    public void loadImage(String url, ImageView imageView) {
        mStrategy.loadImage(url, imageView);
    }

    /**
     * 展示图片加载进度
     */
    public void loadImageWithProgress (String url, ImageView imageView, ProgressLoadListenter listenter) {
        mStrategy.loadImageWithProgress(url, imageView, listenter);
    }

    public void loadGifWithProgress(String url, ImageView imageView,ProgressLoadListenter listenter) {
        mStrategy.loadGifWithProgress(url,imageView,listenter);
    }

    /**
     * 策略模式的注入操作
     * @param strategy
     */
    public void setLoadImgStrategy(BaseImageLoaderStrategy strategy) {
        mStrategy = strategy;
    }

    /**
     * 清除图片磁盘缓存
     * @param context
     */
    public void clearImageDiskCache(final Context context) {
        mStrategy.clearImageDiskCache(context);
    }

    /**
     * 清除图片内存缓存
     * @param context
     */
    public void clearImaeMemoryCache(Context context) {
        mStrategy.clearImageMemoryCache(context);
    }

    /**
     * 根据不同的内存状态 来响应不同的内存释放策略
     */
    public void trimMemory(Context context, int level) {
        mStrategy.trimMemory(context,level);
    }

    /**
     * 清除图片所有缓存
     * @param context
     */
    public void clearImageAllCache(Context context) {
        clearImageDiskCache(context.getApplicationContext());
        clearImaeMemoryCache(context.getApplicationContext());
    }

    /**
     * 获取缓存大小
     * @param context
     * @return
     */
    public String getCacheSize(Context context) {
        return mStrategy.getCacheSize(context);
    }

}
