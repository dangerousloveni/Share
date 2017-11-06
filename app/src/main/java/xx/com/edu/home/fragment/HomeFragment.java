package xx.com.edu.home.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import xx.com.edu.R;
import xx.com.edu.base.BaseFragment;
import xx.com.edu.home.fragment.adapter.HomeFragmentAdapter;

/**
 * @author Administrator
 * @version $Rev$
 * @des ${TODD}
 * @updateAuthor $Author$
 * @updateDes ${TODD}
 */
public class HomeFragment extends BaseFragment {
    private RecyclerView rv_home;
   private TextView tv_search_home;
    private HomeFragmentAdapter adapter;
    @Override
    public View initView() {
      View view=View.inflate(mContext, R.layout.fragment_home,null);
        tv_search_home=view.findViewById(R.id.tv_search_home);
        rv_home= view.findViewById(R.id.rv_home);
        adapter=new HomeFragmentAdapter(mContext);
        rv_home.setAdapter(adapter);
        rv_home.setLayoutManager(new GridLayoutManager(mContext,1));
        initListener();
        return view;
    }

    private void initListener() {
        tv_search_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,"搜索",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void initData() {

        super.initData();

    }
}
