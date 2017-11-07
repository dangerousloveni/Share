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

public class EmploymentAdapter  extends BaseAdapter {

    private final Context mContext;
    private int[] images= new  int[] {R.drawable.temp_user4,R.drawable.temp_user5,R.drawable.temp_user6,
            R.drawable.temp_user7,R.drawable.temp_user8,R.drawable.temp_user9,
            R.drawable.temp_user10,R.drawable.temp_user11,R.drawable.temp_user12

    };
    private String[] txtthem=new String[] {"精密电子工业有限公司招聘","拓森电子有限公司招聘","装饰设计有限公司招聘",
            "电器有限公司招聘","节能设备有限公司招聘","教育咨询有限公司招聘","科技股份有限公司招聘","实业股份有限公司招聘","2018年赴内地高校招聘教师 ",
    };
    private String[] txtContent=new String[]{"宣讲地点：南校就业大厅\n需求专业：机械、材料成型及控制工程电气",
            "宣讲地点：图书报告大厅\n需求专业:不限专业（有相关销售经验者优先）","宣讲地点：设计与艺术学院\n需求专业：设计类、市场经营、电子商务运营",
            "宣讲地点：图书报告大厅\n需求专业：机械、模具，机电、高分子材料、国际贸易","宣讲地点：南校就业大厅二楼\n" +
            "需求专业：热能与动力工程、建筑环境与设备工程、制冷自动化","宣讲地点：南校就业大厅二楼\n" +
            "专业需求：英语，机械设计制造及其自动化，会计学，化学工程与工艺","宣讲地点：南校就业大厅\n" +
            "专业需求：计算机类，管理科学，电气工程及其自动化，机械设计制造","宣讲地点：南校就业大厅二楼\n" +
            "专业需求：机械设计制造及其自动化，会计学，汉语言文学，法学","宣讲地点：老二教103\n" +
            "专业需求：不限专业"
    };
    private String[] txtName=new String[]{"番禹得意、","瑞安市、","兴森快捷","小熊","芬尼克兹","长沙行笃敬","蓝思","金炬","新疆阿克苏地区乌什县"

    };
    private String[] phone=new String[]{"14375452727","1753868275","15337538524","144527367892","14273587444","14565452525","14747858634","14275386945","14275387785"

    };

    public EmploymentAdapter(Context context) {
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
        EmploymentAdapter.ViewHolder viewHolder;
        if(convertView==null)
        {
            convertView=View.inflate(mContext, R.layout.new_item,null);
            viewHolder=new EmploymentAdapter.ViewHolder();
            viewHolder.imageView= (ImageView) convertView.findViewById(R.id.iv_photo);
            viewHolder.txt_them= (TextView) convertView.findViewById(R.id.tv_Theme);
            viewHolder.txt_content= (TextView) convertView.findViewById(R.id.tv_Content);
            viewHolder.txt_phone=(TextView)convertView.findViewById(R.id.tv_phone);
            viewHolder.txt_name= (TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.txt_them.setTextColor(Color.parseColor("#2e32b2"));
            convertView.setTag(viewHolder);

        }
        else {
            viewHolder= (EmploymentAdapter.ViewHolder) convertView.getTag();
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
