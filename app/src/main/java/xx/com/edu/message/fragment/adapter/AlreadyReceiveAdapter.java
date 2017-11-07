package xx.com.edu.message.fragment.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import xx.com.edu.R;
import xx.com.edu.home.fragment.adapter.NewAdapter;

/**
 * Created by SwordIng on 2017/11/7.
 */

public class AlreadyReceiveAdapter extends BaseAdapter {

    private final Context mContext;
    private int[] images= new  int[] {R.drawable.userphoto5,R.drawable.uesr2,R.drawable.user3,
            R.drawable.userphoto2,R.drawable.userphoto1,R.drawable.uersphoto4,
            R.drawable.temp_user1,R.drawable.temp_user2,R.drawable.temp_user3
    };
    private String[] txtthem=new String[] {"腾讯云校招大会","爱奇艺会员转卖","低价卖流量",
            "富士康招聘","2018星火教育宣讲会","考研英语长难句攻破",
            "微信解封","快递兼职","发单兼职"};
    private String[] txtContent=new String[]{"面向大四毕业的学生，时间2017年12月3号，地点创业园，希望软件学院的同学踊跃参加",
            "低价会员专买，6块钱一个月，看上的加Q1254127856","湖南省流量5元10G，仅限联通",
            "地点南华就业厅，时间2017年11月12日18.30",
            "年薪6w-12w 时间2017/12/22地点南华就业厅3楼","由何凯文老师主讲，时间12月3号晚七点，文都弘辰教室与你们不见不散",
            "微信解封30元一单，需要的联系我",
            "60名，男女不限，主要工作：快递分拣、扫描、打包等室内工作","招发单兼职人员四名，工资日结60，鸽子酱油尸体勿扰！"};
    private String[] txtName=new String[]{"未来的马化腾","低价会员","卖流量的阿七",
            "富老板","张文好","文都考研",
            "小贱","啥都干","村头老李"
    };
    private String[] phone=new String[]{"173546546521","61845666","15719964443",
            "173232324333","82233303","17333756541",
            "164864613848","13486456","15486468464"
    };

    public AlreadyReceiveAdapter(Context context) {
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
        AlreadyReceiveAdapter.ViewHolder viewHolder;
        if(convertView==null)
        {
            convertView=View.inflate(mContext, R.layout.new_item,null);
            viewHolder=new AlreadyReceiveAdapter.ViewHolder();
            viewHolder.imageView= (ImageView) convertView.findViewById(R.id.iv_photo);
            viewHolder.txt_them= (TextView) convertView.findViewById(R.id.tv_Theme);
            viewHolder.txt_content= (TextView) convertView.findViewById(R.id.tv_Content);
            viewHolder.txt_phone=(TextView)convertView.findViewById(R.id.tv_phone);
            viewHolder.txt_name= (TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.txt_them.setTextColor(Color.parseColor("#2e32b2"));
            convertView.setTag(viewHolder);

        }
        else {
            viewHolder= (AlreadyReceiveAdapter.ViewHolder) convertView.getTag();
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
