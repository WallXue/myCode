package com.example.myapp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.*;
import android.widget.*;
import com.example.myapp.base.AbstractActivity;
import com.example.myapp.base.Inject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyActivity extends AbstractActivity {

    @Inject(id = R.id.listView)
    ListView listView;

    @Inject(id = R.id.imageView)
    ImageView imageView;

    TextView shotTitleTextView;

    @Override
    protected void onPreLoad(Bundle savedInstanceState) {
        setContentView(R.layout.main);
    }

    @Override
    protected void init() {

        shotTitleTextView = new TextView(this);
        shotTitleTextView.setX(50);
        shotTitleTextView.setY(50);
        MyActivity.this.addContentView(shotTitleTextView, new ActionBar.LayoutParams(0));


        listView.bringToFront();
        listView.setBackgroundColor(Color.parseColor("#F2F2F2"));
        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            float listViewInitY = 0;

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                if(listViewInitY == 0){
                    listViewInitY = listView.getY();
                }
                if(totalItemCount != 0) {
                    float f = firstVisibleItem;
                    float total = totalItemCount > 20 ? 20 : totalItemCount;
                    float bfb = (total - f) / total;
//                    AlphaAnimation animation = new AlphaAnimation(imageView.getAlpha(), bfb);
//                    animation.setDuration(500);
//                    animation.setFillAfter(true);
//
//
//
//                    AnimationSet as = new AnimationSet(true);
//                    as.addAnimation(animation);
//                    imageView.startAnimation(as);
                    bfb = bfb < 0.4f ? 0.4f : bfb;
                    imageView.setAlpha(bfb);
                    imageView.setScaleX(1 * (bfb) + 1);
                    imageView.setScaleY(1 * (bfb) + 1);
                    TextView tv = (TextView)view.findViewById(R.id.textTitle);
//                    shotTitleTextView.setText(tv.getText());
                    shotTitleTextView.setText(bfb+"");
                    //////////
                    if(firstVisibleItem < 6) {
                        int v = firstVisibleItem * (80 / 5);
//                        if(totalItemCount <= 5){
//                            listView.setY(listViewInitY - 80);
//                        }else
                        listView.setY(listViewInitY - v);
                    }
                }
            }
        });
        listView.setAdapter(new SimpleAdapter(this, getData(), R.layout.list_item, new String[]{"ICON", "TITLE", "SMALL"}, new int[]{R.id.textIcon,R.id.textTitle, R.id.textSmall}));
        listView.setY(listView.getY() + 80);
    }

    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();


        for (int i = 0; i < 100; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("ICON", "S"+i);
            map.put("TITLE", "FD"+i);
            map.put("SMALL", "乎fDS121111"+i);
            list.add(map);
        }
        return list;
    }
}
