package edu.pdx.ece558.learnbraille;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * A fragment representing a single LessonQuiz detail screen.
 * This fragment is either contained in a {@link LessonQuizListActivity}
 * in two-pane mode (on tablets) or a {@link LessonQuizDetailActivity}
 * on handsets.
 */
public class LessonQuizDetailFragment extends Fragment implements AdapterView.OnItemSelectedListener{
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";
    public static final String TAG = "LessonQuizDetailFragment";

    /**
     * The dummy content this fragment is presenting.
     */
    private Quiz mItem;
    private String mIndexString;
    private int mIndex;

    ImageView mImageView;
    Spinner mSpinner;
    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public LessonQuizDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            //mIndexString = getArguments().getString(ARG_ITEM_ID);

            //mIndex = Integer.parseInt(mIndexString);
            mIndex = getArguments().getInt(ARG_ITEM_ID);
            String[] mQuizDescriptions = getResources().getStringArray(R.array.quizDescriptions);
            String[] mQuizTitles = getResources().getStringArray(R.array.quizTitles);
            mItem = new Quiz(mIndex,mQuizTitles[mIndex],mQuizDescriptions[mIndex]);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_lessonquiz_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.lessonquiz_detail)).setText(mItem.content);
        }

        mImageView = (ImageView) rootView.findViewById(R.id.lessonquiz_braille_character);
        mImageView.setImageResource(R.drawable.braille_character_a_large);

        mSpinner = (Spinner) rootView.findViewById(R.id.lessonquiz_spinner);

        ArrayAdapter<CharSequence> adapter;
        //Create an ArrayAdapter using the string array and a default spinner layout
        if(mIndex == 1) {
            adapter = ArrayAdapter.createFromResource(getActivity(),
                    R.array.lesson1Characters, android.R.layout.simple_spinner_item);
        }else if (mIndex == 2){
            adapter = ArrayAdapter.createFromResource(getActivity(),
                    R.array.lesson2Characters, android.R.layout.simple_spinner_item);
        }else if (mIndex == 3){
            adapter = ArrayAdapter.createFromResource(getActivity(),
                    R.array.lesson3Characters, android.R.layout.simple_spinner_item);
        }else{
            adapter = ArrayAdapter.createFromResource(getActivity(),
                    R.array.alphabet, android.R.layout.simple_spinner_item);
        }

        //Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Apply the adapter to the spinner
        mSpinner.setAdapter(adapter);
        mSpinner.setOnItemSelectedListener(this);

        return rootView;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // An Item was selected.  You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
        String temp = (String) parent.getItemAtPosition(position);
        Log.v(TAG, "Selected: " + temp);

        switch(temp){
            case "layout":   mImageView.setImageResource(R.drawable.braille_cell_with_dots_numbered_large);
                break;
            case "a":   mImageView.setImageResource(R.drawable.braille_character_a_large);
                break;
            case "b":   mImageView.setImageResource(R.drawable.braille_character_b_large);
                break;
            case "c":   mImageView.setImageResource(R.drawable.braille_character_c_large);
                break;
            case "d":   mImageView.setImageResource(R.drawable.braille_character_d_large);
                break;
            case "e":   mImageView.setImageResource(R.drawable.braille_character_e_large);
                break;
            case "f":   mImageView.setImageResource(R.drawable.braille_character_f_large);
                break;
            case "g":   mImageView.setImageResource(R.drawable.braille_character_g_large);
                break;
            case "h":   mImageView.setImageResource(R.drawable.braille_character_h_large);
                break;
            case "i":   mImageView.setImageResource(R.drawable.braille_character_i_large);
                break;
            case "j":   mImageView.setImageResource(R.drawable.braille_character_j_large);
                break;
            case "k":   mImageView.setImageResource(R.drawable.braille_character_k_large);
                break;
            case "l":   mImageView.setImageResource(R.drawable.braille_character_l_large);
                break;
            case "m":   mImageView.setImageResource(R.drawable.braille_character_m_large);
                break;
            case "n":   mImageView.setImageResource(R.drawable.braille_character_n_large);
                break;
            case "o":   mImageView.setImageResource(R.drawable.braille_character_o_large);
                break;
            case "p":   mImageView.setImageResource(R.drawable.braille_character_p_large);
                break;
            case "q":   mImageView.setImageResource(R.drawable.braille_character_q_large);
                break;
            case "r":   mImageView.setImageResource(R.drawable.braille_character_r_large);
                break;
            case "s":   mImageView.setImageResource(R.drawable.braille_character_s_large);
                break;
            case "t":   mImageView.setImageResource(R.drawable.braille_character_t_large);
                break;
            case "u":   mImageView.setImageResource(R.drawable.braille_character_u_large);
                break;
            case "v":   mImageView.setImageResource(R.drawable.braille_character_v_large);
                break;
            case "w":   mImageView.setImageResource(R.drawable.braille_character_w_large);
                break;
            case "x":   mImageView.setImageResource(R.drawable.braille_character_x_large);
                break;
            case "y":   mImageView.setImageResource(R.drawable.braille_character_y_large);
                break;
            case "z":   mImageView.setImageResource(R.drawable.braille_character_z_large);
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //Another interface callback
        Log.v(TAG, "Nothing selected.");
    }
}
