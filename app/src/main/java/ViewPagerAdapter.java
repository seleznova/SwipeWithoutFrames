import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by mary on 07/12/17.
 */

public class ViewPagerAdapter extends PagerAdapter {
    private final List<Presenter> mPresenterList = new ArrayList<>();

    @Override
    public boolean isViewFromObject(View view, Object object){
        return view == object;
    }

    @Override
    public int getCount(){
        return mPresenterList.size();
    }

    public void addView(Presenter presenter){
        mPresenterList(presenter);
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        View currentView = mPresenterList.get(position).getView();
    }
}
