package com.example.songstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("CGTLxHoBzJVLbr1xGYhhN47hMuPcdF2aKFZgnnHS")
                .clientKey("x9bM1S5rHOrVkCB7nda73KfkWAEBw8ujf4mVS75n")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

/*
We also need to make sure to set the application instance above as the android:name for
the application within the AndroidManifest.xml. This change in the manifest determines
which application class is instantiated when the app is launched and also adding the
application ID metadata tag:
 */
