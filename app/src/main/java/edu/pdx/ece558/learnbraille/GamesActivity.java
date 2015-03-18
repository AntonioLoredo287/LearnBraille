package edu.pdx.ece558.learnbraille;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class GamesActivity extends Activity {
    static final String TAG="GamesActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        Log.v(TAG,"In onCreate");
    }
}
