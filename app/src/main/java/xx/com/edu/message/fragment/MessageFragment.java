package xx.com.edu.message.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import xx.com.edu.R;
import xx.com.edu.base.BaseFragment;
import xx.com.edu.home.fragment.adapter.NewAdapter;
import xx.com.edu.message.fragment.activity.MessageListActivity;
import xx.com.edu.message.fragment.activity.MessageReleaseActivity;
import xx.com.edu.message.fragment.adapter.MessageAdapter;

/**
 * @author Administrator
 * @version $Rev$
 * @des ${TODD}
 * @updateAuthor $Author$
 * @updateDes ${TODD}
 */
public class MessageFragment extends BaseFragment{
    private GridView gridView;
    private GridView gridView2;
    Intent intent;
    @Override
    public View initView() {
        View view=View.inflate(mContext, R.layout.fragment_message,null);
        gridView=(GridView)view.findViewById(R.id.mes_grid);
        gridView.setAdapter(new MessageAdapter(mContext));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:case 1:
                        intent=new Intent(mContext,MessageListActivity.class);
                        intent.putExtra("position",i);
                        startActivity(intent);
                        break;
                    case 2:
                        break;
                    case 3:
                        intent=new Intent(mContext,MessageReleaseActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });

        gridView2=(GridView)view.findViewById(R.id.mes_grid2);
        gridView2.setAdapter(new NewAdapter(mContext));
        return view;
    }

    @Override
    public void initData() {

        super.initData();
    }
}
