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
public class HotAdapter extends BaseAdapter{

     private final Context mContext;
    private int[] images= new  int[] {R.drawable.user1,R.drawable.uesr2,R.drawable.user3};
    private String[] txtthem=new String[] {"富士康招聘","2018星火教育宣讲会","考研英语长难句攻破"};
   private String[] txtContent=new String[]{"地点南华就业厅，时间2017年11月12日18.30",
          "年薪6w-12w 时间2017/12/22地点南华就业厅3楼","由何凯文老师主讲，时间12月3号晚七点，文都弘辰教室与你们不见不散"};
    private String[] txtName=new String[]{"富老板","张文好","文都考研"};
    private String[] phone=new String[]{"173232324333","82233303","17333756541"};



    public HotAdapter(Context context) {
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
