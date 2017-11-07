package xx.com.edu.user.fragment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import xx.com.edu.R;

/**
 * Created by SwordIng on 2017/11/7.
 */

public class UserCenterAdapter extends BaseAdapter {
    private Context mContext;
    private String[] arrText = new String[]{
            "资料","钱包","签到"};
    private int[] arrImages = new int[]{
            R.drawable.person_usercenter,
            R.drawable.wallet_usercenter,
            R.drawable.sign_usercenter
    };

    public UserCenterAdapter(Context context) {
        this.mContext=context;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        UserCenterAdapter.ViewHolder viewHolder;

        if(view ==null) {
            view = View.inflate(mContext, R.layout.mes_item, null);
            viewHolder=new UserCenterAdapter.ViewHolder();
            viewHolder.iv_icon= (ImageView) view.findViewById(R.id.mes_image);
            viewHolder.tv_title= (TextView) view.findViewById(R.id.mes_txt);
            view.setTag(viewHolder);
        }
        else {
            viewHolder=(UserCenterAdapter.ViewHolder) view.getTag();
        }
        viewHolder.iv_icon.setImageResource(arrImages[i]);
        viewHolder.tv_title.setText(arrText[i]);
        return view;
    }
    static  class ViewHolder{

        ImageView iv_icon;
        TextView tv_title;
    }

}
