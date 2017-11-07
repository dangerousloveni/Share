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

public class KnowledgeAdapter extends BaseAdapter {

    private final Context mContext;
    private int[] images= new  int[] {R.drawable.userfragment_touxiang,R.drawable.userfragment_touxiang,R.drawable.userfragment_touxiang};
    private String[] txtthem=new String[] {"新店特惠","快递兼职","发单兼职"};
    private String[] txtContent=new String[]{"荣记餐馆开业",
            "60名，男女不限，主要工作：快递分拣、扫描、打包等室内工作","招发单兼职人员四名，工资日结60，鸽子酱油尸体勿扰！"};
    private String[] txtName=new String[]{"东阳、","东阳、","东阳、"};
    private String[] phone=new String[]{"15333328275","15333328275","15333328275"};

    public KnowledgeAdapter(Context context) {
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
        KnowledgeAdapter.ViewHolder viewHolder;
        if(convertView==null)
        {
            convertView=View.inflate(mContext, R.layout.new_item,null);
            viewHolder=new KnowledgeAdapter.ViewHolder();
            viewHolder.imageView= (ImageView) convertView.findViewById(R.id.iv_photo);
            viewHolder.txt_them= (TextView) convertView.findViewById(R.id.tv_Theme);
            viewHolder.txt_content= (TextView) convertView.findViewById(R.id.tv_Content);
            viewHolder.txt_phone=(TextView)convertView.findViewById(R.id.tv_phone);
            viewHolder.txt_name= (TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.txt_them.setTextColor(Color.parseColor("#2e32b2"));
            convertView.setTag(viewHolder);

        }
        else {
            viewHolder= (KnowledgeAdapter.ViewHolder) convertView.getTag();
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
