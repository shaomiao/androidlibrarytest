package com.umeng.soexample;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;

import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMWeb;

/**
 * @author shaomiao
 * @Date 2017/3/20
 * @Time 11:48
 */

public class ShareUtil {
    public static void shareUrl(@NonNull Activity context, @NonNull Object thumb, @NonNull String url, String title, String description, @NonNull UMShareListener listener) {
        if (thumb == null) {
            return;
        }
        UMImage image = null;
        if (thumb instanceof Bitmap) {
            image = new UMImage(context, (Bitmap) thumb);
        } else if (thumb instanceof Integer) {
            image = new UMImage(context, (Integer) thumb);
        }else if (thumb instanceof String) {
            image = new UMImage(context, (String) thumb);
        }
        UMWeb web = new UMWeb(url);
        web.setTitle(title);//标题
        web.setThumb(image);  //缩略图
        web.setDescription(description);//描述
        new ShareAction(context)
                .withMedia(web)
                .setDisplayList(SHARE_MEDIA.QQ,SHARE_MEDIA.SINA,SHARE_MEDIA.WEIXIN)
                .setCallback(listener).open();

    }


}
