package xx.com.edu.home.fragment.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnLoadImageListener;
import com.zhy.magicviewpager.transformer.ScaleInTransformer;

import java.util.ArrayList;
import java.util.List;

import xx.com.edu.MessageInfoActivity;
import xx.com.edu.R;
import xx.com.edu.home.fragment.bean.MessageBean;
import xx.com.edu.message.fragment.activity.MessageListActivity;
import xx.com.edu.message.fragment.activity.MessageReleaseActivity;

/**
 * @author Administrator
 * @version $Rev$
 * @des ${TODD}
 * @updateAuthor $Author$
 * @updateDes ${TODD}
 */
public class HomeFragmentAdapter extends RecyclerView.Adapter {

    public static final int BANNER = 0;
    public static final int LIST = 1;
    public static final int NEW = 3;
    public static final int ACT = 2;
    public static final int HOT = 4;
    private Context context;
    private LayoutInflater mLayoutInflater;
    private static final String MESSAGE_BEAN ="messageBean" ;
    private int currentType = BANNER;

    public HomeFragmentAdapter(Context context) {
        this.context = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == BANNER) {
            return new BannerViewHolder(context, mLayoutInflater.inflate(R.layout.banner_viewpager, null));
        }
        if (viewType == LIST) {
            return new ChannelViewHolder(context, mLayoutInflater.inflate(R.layout.channel_item, null));
        }
        if (viewType == ACT) {
            return new ActViewHolder(context, mLayoutInflater.inflate(R.layout.act_view, null));
        }
        if (viewType == NEW) {
            return new NewViewHolder(context, mLayoutInflater.inflate(R.layout.new_view, null));
        }
        if(viewType ==HOT)
        {
            return  new HotViewHolder(context,mLayoutInflater.inflate(R.layout.hot_view,null));
        }
        return null;
    }

    class BannerViewHolder extends RecyclerView.ViewHolder {

        private Context context;
        private View itemView;
        private Banner banner;

        public BannerViewHolder(Context context, View itemView) {
            super(itemView);
            this.context = context;
            this.banner = (Banner) itemView.findViewById(R.id.banner);
        }

        public void setData() {
            banner.setBannerAnimation(Transformer.Accordion);
            banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
            List<String> imagesurl = new ArrayList<>();
            imagesurl.add("http://47.94.248.204:8080/atguigu/img/1478770583835.png");
            imagesurl.add("http://47.94.248.204:8080/atguigu/img/1478770583836.png");
            imagesurl.add("http://47.94.248.204:8080/atguigu/img/ss.jpg");
            banner.setImages(imagesurl, new OnLoadImageListener() {
                @Override
                public void OnLoadImage(ImageView view, Object url) {
                    Glide.with(context).load(url).into(view);
                }
            });
            banner.setImages(imagesurl);

        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == BANNER) {
            BannerViewHolder bannerViewHolder = (BannerViewHolder) holder;
            bannerViewHolder.setData();
        }
        if (getItemViewType(position) == LIST) {
            ChannelViewHolder channelViewHolder = (ChannelViewHolder) holder;
            channelViewHolder.setData();
        }
        if (getItemViewType(position) == ACT) {
            ActViewHolder actViewHolder = (ActViewHolder) holder;
            actViewHolder.setData();
        }
        if (getItemViewType(position) == NEW) {
            NewViewHolder newViewHolder = (NewViewHolder) holder;
            newViewHolder.setData();

        }    if (getItemViewType(position) == HOT) {
            HotViewHolder hotViewHolder = (HotViewHolder) holder;
            hotViewHolder.setData();

        }

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    //得到类型
    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case BANNER:
                currentType = BANNER;
                break;
            case LIST:
                currentType = LIST;
                break;
            case ACT:
                currentType = ACT;
                break;
            case NEW:
                currentType = NEW;
                break;
            case HOT:
                currentType = HOT;
                break;


        }
        return currentType;
    }

    private class ChannelViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;
        private GridView gv_channel;
        private ChannelAdapter adapter;
        Intent intent;

        public ChannelViewHolder(Context context, View itemView) {
            super(itemView);
            this.mContext = context;
            gv_channel = (GridView) itemView.findViewById(R.id.gv_channel);
            gv_channel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    intent=new Intent(mContext,MessageListActivity.class);
                    intent.putExtra("position",i+2);
                    mContext.startActivity(intent);
                }
            });

        }

        public void setData() {
            adapter = new ChannelAdapter(mContext);
            gv_channel.setAdapter(adapter);
        }

    }

    private class NewViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;
        private GridView gv_new;
        private NewAdapter adpter;
        private int[] images= new  int[] {R.drawable.userphoto5,R.drawable.uesr2,R.drawable.user3};
        private String[] txtthem=new String[] {"腾讯云校招大会","爱奇艺会员转卖","低价卖流量"};
        private String[] txtContent=new String[]{"面向大四毕业的学生，时间2017年12月3号，地点创业园，希望软件学院的同学踊跃参加",
                "低价会员专买，6块钱一个月，看上的加Q1254127856","湖南省流量5元10G，仅限联通"};
        private String[] txtName=new String[]{"未来的马化腾","低价会员","卖流量的阿七"};
        private String[] phone=new String[]{"173546546521","61845666","15719964443"};

        public NewViewHolder(Context context, View itemView) {
            super(itemView);
            this.mContext = context;


            gv_new = (GridView) itemView.findViewById(R.id.gv_new);
            gv_new.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(mContext, "position" + i, Toast.LENGTH_SHORT).show();
                    MessageBean message=new MessageBean();
                    message.setIamgesID(images[i]);
                    message.setTheme(txtthem[i]);
                    message.setContent(txtContent[i]);
                    message.setUserName(txtName[i]);
                    message.setPhoneNumber(phone[i]);

                    startGoodsInfoActivity(message);
                }
            });

        }

        public void setData() {

            adpter = new NewAdapter(mContext);
            gv_new.setAdapter(adpter);
        }

    }

    private void startGoodsInfoActivity(MessageBean goodsBean) {
        Intent intent=new Intent(context, MessageInfoActivity.class);
        intent.putExtra(MESSAGE_BEAN,goodsBean);
         context.startActivity(intent);


    }

    private class ActViewHolder extends RecyclerView.ViewHolder {

        private Context mContext;
        private ViewPager act_viewpanger;
        private int[] arrImages = new int[]{R.drawable.show1,R.drawable.show3,
                R.drawable.show2
        };

        public ActViewHolder(Context mContext, View itemView) {

            super(itemView);
            this.mContext = mContext;
            act_viewpanger = (ViewPager) itemView.findViewById(R.id.act_viewpager);

        }

        public void setData() {
            act_viewpanger.setPageMargin(20);

            //有数据了
            //设置适配器
            act_viewpanger.setOffscreenPageLimit(3);//>=3

            //setPageTransformer 决定动画效果
            act_viewpanger.setPageTransformer(true, new
                    ScaleInTransformer());

            act_viewpanger.setAdapter(new PagerAdapter() {
                @Override
                public int getCount() {
                    return 3;
                }

                @Override
                public boolean isViewFromObject(View view, Object object) {
                    return view == object;
                }

                @Override
                public Object instantiateItem(ViewGroup container, final int position) {
                    ImageView imageView = new ImageView(mContext);
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    imageView.setImageResource(arrImages[position]);
                    container.addView(imageView);

                    //设置点击事件
                    imageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(mContext, "position==" + position, Toast.LENGTH_SHORT).show();
                        }
                    });

                    return imageView;
                }

                @Override
                public void destroyItem(ViewGroup container, int position, Object object) {
                    container.removeView((View) object);
                }
            });
            act_viewpanger.setCurrentItem(1);
        }
    }

    private class HotViewHolder extends RecyclerView.ViewHolder {
        private  GridView gv_hot;
        private  Context mContext;
        private HotAdapter adpter;
        public HotViewHolder(Context context, View itemView) {
            super(itemView);
            this.mContext=context;
            gv_hot= (GridView) itemView.findViewById(R.id.gv_hot);
            gv_hot.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(mContext, "position" + i, Toast.LENGTH_SHORT).show();
                }
            });
        }
        public void setData(){
            adpter= new HotAdapter(mContext);
            gv_hot.setAdapter(adpter);

        }
    }
}
