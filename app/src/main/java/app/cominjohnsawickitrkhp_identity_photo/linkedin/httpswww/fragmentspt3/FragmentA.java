package app.cominjohnsawickitrkhp_identity_photo.linkedin.httpswww.fragmentspt3;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by John on 12/10/2016.
 */

public class FragmentA extends Fragment {
    int count = 0;
    //TextView mText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_a, container, false);
        Button b = (Button) v.findViewById(R.id.button);
        //mText = (TextView)v.findViewById(R.id.count);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                //setCountText(count);
                //mText.setText("The count in fragment a is "+count);
                MainActivity mainActivity =(MainActivity)getActivity();     //MainActivity is the name of the Java class that receives the data
                mainActivity.incrementValue(count); //send to Java class of the fragment container (activity_main); method defined in main activity510
            }
        });





        return v;
    }

}
