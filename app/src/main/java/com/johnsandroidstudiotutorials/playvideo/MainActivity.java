package com.johnsandroidstudiotutorials.playvideo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView tutorialVideoVideoView;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tutorialVideoVideoView = (VideoView) findViewById(R.id.tutorial_video_video_view);

        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.wifitogglebutton);
        tutorialVideoVideoView.setVideoURI(uri);

        Button playButton = (Button) findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tutorialVideoVideoView.start();
            }
        });
    }

}
