package com.sayam.news.Screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sayam.news.R;

public class NewsDetailActivity extends AppCompatActivity {

    String title, description , image,url,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);
        title = getIntent().getStringExtra("title");
        description = getIntent().getStringExtra("description");
        image = getIntent().getStringExtra("image");
        url = getIntent().getStringExtra("url");
        content = getIntent().getStringExtra("content");
    }
}