import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import marynakuzmenko.swipewithoutfragments.R;

/**
 * Created by mary on 07/12/17.
 */

public class Step1Presenter extends Presenter{

    TextView textViewStep1;

    public Step1Presenter(AppCompatActivity activity, View view){
        super(activity,view);
    }

    @Override
    public void onCreateView(){
        textViewStep1 = (TextView) view.findViewById(R.id.step1_textView);
    }
}
