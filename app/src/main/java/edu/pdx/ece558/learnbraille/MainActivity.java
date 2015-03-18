package edu.pdx.ece558.learnbraille;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends Activity{

    //Tag string for debug
    static final String TAG="MainActivity";

    //Hooks for menu items
    Button mIntroductionButton;
    Button mLessonsButton;
    Button mQuizesButton;
    Button mGamesButton;

    ImageView mImageView;
    Spinner mSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mImageView = (ImageView) findViewById(R.id.braille_character);
        //mImageView.setImageResource(R.drawable.braille_character_a_large);

        //Introduction Button Handler
        mIntroductionButton = (Button) findViewById(R.id.introductionButton);
        mIntroductionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Go to Introduction Activity
                Log.v(TAG, "Hit Introduction Button");
                Toast.makeText(getApplicationContext(),"Hit Introduction Button",Toast.LENGTH_SHORT).show();

                //Setup new intent for Introduction Activity
                Intent i = new Intent(MainActivity.this, IntroductionActivity.class);
                Log.d(TAG, "Introduction Intent Created");

                //Start new introduction activity
                startActivityForResult(i, 0);
            }
        });

        //LessonsActivity Button Handler
        mLessonsButton = (Button) findViewById(R.id.lessonsButton);
        mLessonsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Go to edu.pdx.ece558.learnbraille.Lessons Activity
                Log.v(TAG, "Hit LessonsActivity Button");
                Toast.makeText(getApplicationContext(),"Hit LessonsActivity Button",Toast.LENGTH_SHORT).show();

                //Setup new intent for edu.pdx.ece558.learnbraille.Lessons Activity
                //Intent i = new Intent(MainActivity.this, LessonsActivity.class);
                Intent i = new Intent(MainActivity.this, LessonListActivity.class);
                Log.d(TAG, "LessonsActivity Intent Created");

                //Start new introduction activity
                startActivityForResult(i, 0);
            }
        });

        //Quizes Button Handler
        mQuizesButton = (Button) findViewById(R.id.quizesButton);
        mQuizesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Go to Quizes Activity
                Log.v(TAG, "Hit Quizes Button");
                Toast.makeText(getApplicationContext(),"Hit Quizes Button",Toast.LENGTH_SHORT).show();

                //Setup new intent for Quizes Activity
                Intent i = new Intent(MainActivity.this, LessonQuizListActivity.class);
                Log.d(TAG, "QuizesActivity Intent Created");

                //Start new introduction activity
                startActivityForResult(i, 0);
            }
        });

        //Games Button Handler
        mGamesButton = (Button) findViewById(R.id.gamesButton);
        mGamesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Go to introduction view
                Log.v(TAG, "Hit Games Button");
                Toast.makeText(getApplicationContext(),"Hit Games Button",Toast.LENGTH_SHORT).show();

                //Setup new intent for Games Activity
                Intent i = new Intent(MainActivity.this, GamesActivity.class);
                Log.d(TAG, "GamesActivity Intent Created");

                //Start new introduction activity
                startActivityForResult(i, 0);
            }
        });
    }
}
