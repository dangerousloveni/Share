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
class HotAdapter extends BaseAdapter{

     private final Context mContext;

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

        }


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
