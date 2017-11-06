package xx.com.edu.message.fragment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import xx.com.edu.R;


/**
 * Created by SwordIng on 2017/11/6.
 */

public class MessageAdapter extends BaseAdapter {
    private Context mContext;
    private String[] arrText = new String[]{
            "我已发布","我已接受","我的收藏","我要发布"   };
    private int[] arrImages = new int[]{R.drawable.mes_already,
            R.drawable.mes_receive,
            R.drawable.mes_collection,
            R.drawable.mes_release
    };

    public MessageAdapter(Context context) {
        this.mContext=context;
    }

    @Override
    public int getCount() {
        return 4;
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
        MessageAdapter.ViewHolder viewHolder;

        if(view ==null) {
            view = View.inflate(mContext, R.layout.mes_item, null);
            viewHolder=new MessageAdapter.ViewHolder();
            viewHolder.iv_icon= (ImageView) view.findViewById(R.id.mes_image);
            viewHolder.tv_title= (TextView) view.findViewById(R.id.mes_txt);
            view.setTag(viewHolder);
        }
        else {
            viewHolder=(MessageAdapter.ViewHolder) view.getTag();
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
