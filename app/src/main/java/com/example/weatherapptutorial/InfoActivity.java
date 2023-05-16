package com.example.weatherapptutorial;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView linkTextView1 = findViewById(R.id.GithubProfile);
        linkTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://github.com/Sanjeevk03");
            }
        });

        TextView linkTextView2 = findViewById(R.id.RepoLink);
        linkTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://github.com/Sanjeevk03/Weather-app-in-Android-Studio");
            }
        });
    }

    private void openLink(String url) {
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
