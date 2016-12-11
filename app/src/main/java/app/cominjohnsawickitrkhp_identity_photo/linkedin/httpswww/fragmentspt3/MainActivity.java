package app.cominjohnsawickitrkhp_identity_photo.linkedin.httpswww.fragmentspt3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     public void incrementValue(int count){      //receive the input from the first fragment (A)
            FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment_b);   //make sure it is AppCompatActivity and not v4
            //Toast.makeText(this, "The count is main is "+count,Toast.LENGTH_SHORT).show();
            fragmentB.setTheCount(count);   //send to the second fragment (B), method defined in FragmentB.java
        }

}
