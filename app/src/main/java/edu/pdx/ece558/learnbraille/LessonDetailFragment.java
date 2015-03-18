package edu.pdx.ece558.learnbraille;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * A fragment representing a single Lesson detail screen.
 * This fragment is either contained in a {@link LessonListActivity}
 * in two-pane mode (on tablets) or a {@link LessonDetailActivity}
 * on handsets.
 */
public class LessonDetailFragment extends Fragment implements AdapterView.OnItemSelectedListener{
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    public static final String TAG = "Lesson Detail Fragment";

    /**
     * The lesson this fragment is displaying
     */
    private Lesson mItem;
    private int mIndex;

    private ImageView mImageView;
    private Spinner mSpinner;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public LessonDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mIndex = getArguments().getInt(ARG_ITEM_ID);
            String[] mLessonDescriptions = getResources().getStringArray(R.array.lessonDescription);
            String[] mLessonTitles = getResources().getStringArray(R.array.lessonTitles);
            mItem = new Lesson(mIndex,mLessonTitles[mIndex],mLessonDescriptions[mIndex]);
            //mItem = Lessons.ITEM_MAP.get(getArguments().getInt(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_lesson_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.lesson_detail)).setText(mItem.content);
        }

        mImageView = (ImageView) rootView.findViewById(R.id.lesson_braille_character);
        mImageView.setImageResource(R.drawable.braille_character_a_large);

        mSpinner = (Spinner) rootView.findViewById(R.id.lesson_spinner);

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
        Log.v(TAG,"Nothing selected.");
    }
}
