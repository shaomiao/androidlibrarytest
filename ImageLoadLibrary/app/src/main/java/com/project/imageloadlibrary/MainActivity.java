package com.project.imageloadlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.project.image_load_library.ImageLoaderProxy;
import com.project.image_load_strategy_library.ImageLoaderUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ImageLoaderProxy.getInstance().init(this);
//        ImageLoaderProxy.getInstance().display("http://pic35.nipic.com/20131115/6704106_153707247000_2.jpg" , (ImageView) findViewById(R.id.image));
        ImageLoaderUtil.getInstance().loadImage("http://pic35.nipic.com/20131115/6704106_153707247000_2.jpg" ,(ImageView) findViewById(R.id.image));
    }
}
