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
class  NewAdapter  extends BaseAdapter{

     private final Context mContext;

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

            convertView=View.inflate(mContext, R.layout.new_item,null);

        return convertView;
    }
    static class ViewHolder{
      ImageView imageView;
        TextView txt_them;
        TextView txt_content;
        TextView txt_phone;


    }



}
