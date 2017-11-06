package xx.com.edu.message.fragment;

import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import xx.com.edu.base.BaseFragment;

/**
 * @author Administrator
 * @version $Rev$
 * @des ${TODD}
 * @updateAuthor $Author$
 * @updateDes ${TODD}
 */
public class MessageFragment extends BaseFragment {
     private TextView textView;
    @Override
    public View initView() {
        textView=new TextView(mContext);

        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(25);
        return textView;
    }

    @Override
    public void initData() {

        super.initData();
        textView.setText("消息内容232323");
    }
}
