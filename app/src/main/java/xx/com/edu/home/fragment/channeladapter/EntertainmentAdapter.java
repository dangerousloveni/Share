package xx.com.edu.home.fragment.channeladapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import xx.com.edu.R;

/**
 * Created by SwordIng on 2017/11/7.
 */

public class EntertainmentAdapter extends BaseAdapter {

    private final Context mContext;
    private int[] images= new  int[] {R.drawable.temp_user12,R.drawable.temp_user6,R.drawable.temp_user8};
    private String[] txtthem=new String[] {"新店特惠","低价出两张电影票","台球"};
    private String[] txtContent=new String[]{"荣记餐馆开业大酬宾，满500减50，快来进店品尝吧！\n地点：洪辰商业步行街",
            "11月11日晚六点场，《生化危机-终章》\n地点：万达影视城","为回馈新老顾客，办会员充多少送多少\n地点：北校小小台球厅"};
    private String[] txtName=new String[]{"仁豪","从头再来","北校扛把子"};
    private String[] phone=new String[]{"15376576852","17895264275","153333257544"};

    public EntertainmentAdapter(Context context) {
        this.mContext=context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        EntertainmentAdapter.ViewHolder viewHolder;
        if(convertView==null)
        {
            convertView=View.inflate(mContext, R.layout.new_item,null);
            viewHolder=new EntertainmentAdapter.ViewHolder();
            viewHolder.imageView= (ImageView) convertView.findViewById(R.id.iv_photo);
            viewHolder.txt_them= (TextView) convertView.findViewById(R.id.tv_Theme);
            viewHolder.txt_content= (TextView) convertView.findViewById(R.id.tv_Content);
            viewHolder.txt_phone=(TextView)convertView.findViewById(R.id.tv_phone);
            viewHolder.txt_name= (TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.txt_them.setTextColor(Color.parseColor("#2e32b2"));
            convertView.setTag(viewHolder);

        }
        else {
            viewHolder= (EntertainmentAdapter.ViewHolder) convertView.getTag();
        }
        viewHolder.imageView.setImageResource(images[position]);
        viewHolder.txt_name.setText(txtName[position]);
        viewHolder.txt_phone.setText(phone[position]);
        viewHolder.txt_content.setText(txtContent[position]);
        viewHolder.txt_them.setText(txtthem[position]);

        return convertView;
    }
    static class ViewHolder{
        ImageView imageView;
        TextView txt_them;
        TextView txt_content;
        TextView txt_phone;
        TextView txt_name;


    }

}
