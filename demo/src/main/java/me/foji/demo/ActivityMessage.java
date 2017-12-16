package me.foji.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.youngfeng.annotations.EnableDragToClose;

/**
 * Created by scott on 2016/11/6.
 */
@EnableDragToClose()
public class ActivityMessage extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message1);
    }
}
