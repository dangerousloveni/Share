package xx.com.edu;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import xx.com.edu.base.BaseFragment;
import xx.com.edu.home.fragment.HomeFragment;
import xx.com.edu.message.fragment.MessageFragment;
import xx.com.edu.user.fragment.UserFragment;

public class MainActivity extends FragmentActivity {

    @Bind(R.id.framelayout)
    FrameLayout mFramelayout;
    @Bind(R.id.rg_main)
    RadioGroup mRgMain;
    private ArrayList<BaseFragment> fragments;
     private  int position;
    private BaseFragment tempFragemnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ButterKnife 和当前Activity绑定
        ButterKnife.bind(this);
        initFragment();
        initListener();


    }

    private void initListener() {
        mRgMain.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i)
                {
                    case R.id.rb_home:
                        position=0;
                        break;
                    case R.id.rb_message:
                        position=1;
                        break;
                    case R.id.rb_user:
                        position=2;
                        break;
                    default:
                        position=0;
                        break;
                }
                //根据位置取不同的Fragment
                BaseFragment to= getFragment(position);
                switchFragment(tempFragemnt,to);

            }
        });
        mRgMain.check(R.id.rb_home);
    }
    private  BaseFragment getFragment(int position)
    {
        if(fragments!=null && fragments.size()>0)
        {
            BaseFragment baseFragment=fragments.get(position);
            return baseFragment;
        }
        return null;
    }

    private void initFragment() {
        fragments=new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new MessageFragment());
        fragments.add(new UserFragment());
    }
    private  void switchFragment(BaseFragment fromFragment,BaseFragment nextFragment)
    {
        if (tempFragemnt != nextFragment) {
            tempFragemnt = nextFragment;
            if (nextFragment != null) {
                FragmentTransaction transaction =
                        getSupportFragmentManager().beginTransaction();
                // 判断 nextFragment 是否添加
                if (!nextFragment.isAdded()) {
                    // 隐藏当前 Fragment
                    if (fromFragment != null) {
                        transaction.hide(fromFragment);
                    }
                    transaction.add(R.id.framelayout, nextFragment).commit();
                } else {
                    // 隐藏当前 Fragment
                    if (fromFragment != null) {
                        transaction.hide(fromFragment);
                    }
                    transaction.show(nextFragment).commit();
                }
            }
        }
    }


}
