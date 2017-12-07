import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import marynakuzmenko.swipewithoutfragments.R;

/**
 * Created by mary on 07/12/17.
 */

public abstract class Presenter {
    protected View view;
    private AppCompatActivity activity;

    public Presenter(AppCompatActivity activity, View view){
        this.activity = activity;
        this.view = view;
        onCreateView();
    }

    public View getView(){
        return view;
    }

    public abstract void onCreateView();

}


public class Step2Presenter extends Presenter{

}
