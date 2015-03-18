package edu.pdx.ece558.learnbraille;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class IntroductionActivity extends Activity {

    static final String TAG="IntroductionActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        Log.v(TAG, "In onCreate");
    }
}
