package com.example.lbw.guaniu.personhome;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.lbw.guaniu.ActivityCollector;
import com.example.lbw.guaniu.MusicPlayerActivity;
import com.example.lbw.guaniu.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lbw on 2017/8/9.
 */

public class PersonHome extends AppCompatActivity {
    private List<MyNews> list;
    private ListView listView;
    private LinearLayout back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_home);
        ActivityCollector.addActivity(this);
        listView = (ListView)findViewById(R.id.my_news_list);
        initData();
        MyNewsAdapter adapter = new MyNewsAdapter(PersonHome.this,R.layout.my_news_item,list);
        listView.setAdapter(adapter);
        back = (LinearLayout)findViewById(R.id.back_to_home);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(PersonHome.this, MusicPlayerActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initData() {
        list = new ArrayList<>();
        MyNews myNews1 = new MyNews("2017/08/09",R.mipmap.katong2,"我读了春晓,可好听了,快来点赞吧,呵呵,来了一定喜欢","112个","10条");
        list.add(myNews1);
        list.add(myNews1);
        list.add(myNews1);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.remoreActivity(this);
    }
}
