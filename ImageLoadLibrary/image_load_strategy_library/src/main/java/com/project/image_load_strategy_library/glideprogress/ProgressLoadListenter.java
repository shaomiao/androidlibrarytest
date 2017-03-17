package com.project.image_load_strategy_library.glideprogress;

/**
 * @author shaomiao
 * @Date 2017/3/17
 * @Time 10:17
 */

public interface ProgressLoadListenter {

    void update(int byteRead, int contentLength);

    void onException();

    void onResourceReady();
}
