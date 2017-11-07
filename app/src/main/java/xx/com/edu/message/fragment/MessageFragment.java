package xx.com.edu.message.fragment;

import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import xx.com.edu.R;
import xx.com.edu.base.BaseFragment;
import xx.com.edu.home.fragment.adapter.HomeFragmentAdapter;
import xx.com.edu.home.fragment.adapter.NewAdapter;

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
    @Override
    public View initView() {
        View view=View.inflate(mContext, R.layout.fragment_message,null);
        gridView=(GridView)view.findViewById(R.id.mes_grid);
        gridView.setAdapter(new MessageAdapter(mContext));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(mContext,MessageReleaseActivity.class);
                startActivity(intent);
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
