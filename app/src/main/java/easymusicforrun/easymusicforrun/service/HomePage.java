package easymusicforrun.easymusicforrun.service;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(easymusicforrun.easymusicforrun.service.R.layout.activity_homepage);
    }

    public void callMusicPlaying(View view)
    {
        Intent intent = new Intent(HomePage.this, ContextMiddlewareService.class);
        //intent.putExtra("Name of LocalPlayList set by user", userProfileObj.getLocalPlayListName());
        //intent.putExtra("Name of YoutubePlaylist set by user", userProfileObj.getYoutubePlaylistName());
        //intent.putExtra("Minimum Walking Speed set by user", userProfileObj.getMinWalkingSpeed());
        //intent.putExtra("Minimum running speed set by user", userProfileObj.getMinRunningSpeed());
        //startActivity(intent);
    }

    public void callSystemExit(View view) {
        System.exit(0);
    }

}
