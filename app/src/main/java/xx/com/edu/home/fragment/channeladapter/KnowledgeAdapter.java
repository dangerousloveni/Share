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
    private int[] images= new  int[] {R.drawable.temp_user13,R.drawable.temp_user14,R.drawable.tempuser15};
    private String[] txtthem=new String[] {"跑步最适合的时间","什么是设计模式？","android教学视频分享"};
    private String[] txtContent=new String[]{"晨起至早餐前 上早餐后2小时至午餐 下午餐后2小时至晚餐前  晚餐后2小时至日落前",
            "设计模式（Design pattern）是一套被反复使用、多数人知晓的、经过分类编目的、代码设计经验的总结","http://pan.baidu.com/s/1pL2F 密码:nj"};
    private String[] txtName=new String[]{"年少不戴花","无敌是多模寂寞","1打9"};
    private String[] phone=new String[]{"187666451615","133050015575","177851542121"};

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
