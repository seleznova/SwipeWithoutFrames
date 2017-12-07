package marynakuzmenko.swipewithoutfragments;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setOffscreenPageLimit(2);

        setupViewPager();
    }

    public void setupViewPager(){
        adapter = new ViewPagerAdapter();

        adapter.addView(new Step1Presenter(this, findViewById(R.id.step1_layout)));
        adapter.addView(new Step2Presenter(this, findViewById(R.id.step2_layout)));
        adapter.addView(new Step3Presenter(this, findViewById(R.id.step3_layout)));

        viewPager.setAdapter(adapter);

    }
}
