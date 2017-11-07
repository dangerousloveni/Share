package xx.com.edu.user.fragment;

import android.view.Gravity;
import android.view.View;
import android.widget.GridView;
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
    TextView textView;
    GridView gridView;
    @Override
    public View initView() {
        View view=View.inflate(mContext, R.layout.user_fragment,null);
        textView=(TextView)view.findViewById(R.id.title_name);
        textView.setText("个人");
        gridView=(GridView)view.findViewById(R.id.grid_usercenter);
        gridView.setAdapter(new UserCenterAdapter(mContext));
        return view;
    }



    @Override
    public void initData() {
        super.initData();
    }
}
