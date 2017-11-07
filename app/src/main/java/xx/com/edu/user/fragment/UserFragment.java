package xx.com.edu.user.fragment;

import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import xx.com.edu.R;
import xx.com.edu.base.BaseFragment;

/**
 * @author Administrator
 * @version $Rev$
 * @des ${TODD}
 * @updateAuthor $Author$
 * @updateDes ${TODD}
 */
public class UserFragment extends BaseFragment {
    @Override
    public View initView() {
        View view=View.inflate(mContext, R.layout.user_fragment,null);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
    }
}
