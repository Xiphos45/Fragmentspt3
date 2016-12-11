package app.cominjohnsawickitrkhp_identity_photo.linkedin.httpswww.fragmentspt3;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by John on 12/10/2016.
 */

public class FragmentB extends Fragment{
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_b, container, false);
        //textView = (TextView) textView.findViewById(R.id.textViewB);
        //randrom github change
        return v;
    }
    public void setTheCount(int count){
        //textView.setText("Count in fragment B is "+ count);

    }
}