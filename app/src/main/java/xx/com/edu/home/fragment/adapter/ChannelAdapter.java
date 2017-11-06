package xx.com.edu.home.fragment.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import xx.com.edu.R;

/**
 * @author Administrator
 * @version $Rev$
 * @des ${TODD}
 * @updateAuthor $Author$
 * @updateDes ${TODD}
 */
class ChannelAdapter  extends BaseAdapter{
    private  Context mContext;
    private String[] arrText = new String[]{
          "就业","娱乐","知识","其他"   };
    private int[] arrImages = new int[]{R.drawable.job_channel,R.drawable.play_channel,
            R.drawable.know_channel,R.drawable.other_channel
                };

    public ChannelAdapter(Context context) {
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
        ViewHolder viewHolder;

        if(view ==null) {
            view = View.inflate(mContext, R.layout.item_channel, null);
           viewHolder=new ViewHolder();
            viewHolder.iv_icon= (ImageView) view.findViewById(R.id.iv_channel);
            viewHolder.tv_title= (TextView) view.findViewById(R.id.tv_channel);
            view.setTag(viewHolder);
        }
        else {
            viewHolder=(ViewHolder) view.getTag();
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
