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
public class  NewAdapter  extends BaseAdapter{

     private final Context mContext;
    private int[] images= new  int[] {R.drawable.user1,R.drawable.uesr2,R.drawable.user3};
    private String[] txtthem=new String[] {"腾讯云校招大会","爱奇艺会员转卖","低价卖流量"};
    private String[] txtContent=new String[]{"面向大四毕业的学生，时间2017年12月3号，地点创业园，希望软件学院的同学踊跃参加",
    "低价会员专买，6块钱一个月，看上的加Q1254127856","湖南省流量5元10G，仅限联通"};
    private String[] txtName=new String[]{"未来的马化腾","低价会员","卖流量的阿七"};
    private String[] phone=new String[]{"173546546521","61845666","15719964443"};

    public NewAdapter(Context context) {
           this.mContext=context;
    }

    @Override
    public int getCount() {
        return 3;
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
        ViewHolder viewHolder;
        if(convertView==null)
        {
            convertView=View.inflate(mContext, R.layout.new_item,null);
            viewHolder=new ViewHolder();
            viewHolder.imageView= (ImageView) convertView.findViewById(R.id.iv_photo);
            viewHolder.txt_them= (TextView) convertView.findViewById(R.id.tv_Theme);
            viewHolder.txt_content= (TextView) convertView.findViewById(R.id.tv_Content);
              viewHolder.txt_phone=(TextView)convertView.findViewById(R.id.tv_phone);
            viewHolder.txt_name= (TextView) convertView.findViewById(R.id.tv_name);
            convertView.setTag(viewHolder);

        }
        else {
            viewHolder= (ViewHolder) convertView.getTag();
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
