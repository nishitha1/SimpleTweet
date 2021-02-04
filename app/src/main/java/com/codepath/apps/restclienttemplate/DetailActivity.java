package com.codepath.apps.restclienttemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.codepath.apps.restclienttemplate.models.Tweet;

import org.parceler.Parcels;

public class DetailActivity extends AppCompatActivity {

    ImageView ivProfileImage;
    TextView tvBody;
    TextView tvScreenName;
    TextView tvDate;
    TextView tvUsername;
    Tweet tweet;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivProfileImage = findViewById(R.id.ivProfileImage);
        tvBody = findViewById(R.id.tvBody);
        tvScreenName = findViewById(R.id.tvScreenName);
        tvDate = findViewById(R.id.tvDate);
        tvUsername = findViewById(R.id.tvUsername);

//        tweet = Parcels.unwrap(getIntent().getParcelableExtra("tweet"));
//        tvBody.setText(tweet.body);
//        tvScreenName.setText("@" + tweet.user.screenName);
//        Glide.with(context).load(tweet.user.profileImageUrl).placeholder(R.drawable.loading).into(ivProfileImage);
//        tvDate.setText(tweet.getFormattedTimestamp(tweet.createdAt));
//        tvUsername.setText(tweet.user.username);
    }
}