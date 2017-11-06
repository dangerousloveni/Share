package xx.com.edu.home.fragment.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnLoadImageListener;

import java.util.ArrayList;
import java.util.List;

import xx.com.edu.R;

/**
 * @author Administrator
 * @version $Rev$
 * @des ${TODD}
 * @updateAuthor $Author$
 * @updateDes ${TODD}
 */
public class HomeFragmentAdapter extends RecyclerView.Adapter {

     public static final int BANNER=0;
     public static final int LIST=1;
     public static final int VIEDIO=2;
    private  Context context;
    private  LayoutInflater mLayoutInflater;

    private  int currentType=BANNER;

    public HomeFragmentAdapter(Context context) {
        this.context=context;
        mLayoutInflater= LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType== BANNER)
        {
                 return  new BannerViewHolder(context,mLayoutInflater.inflate(R.layout.banner_viewpager,null));
        }
        return null;
    }
    class  BannerViewHolder extends  RecyclerView.ViewHolder{

             private  Context context;
             private  View   itemView;
            private Banner  banner;
        public BannerViewHolder(Context context, View itemView) {
            super(itemView);
            this.context=context;
             this.banner=itemView.findViewById(R.id.banner);
        }

        public void setData() {
            banner.setBannerAnimation(Transformer.Accordion);
            banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
          List<String> imagesurl=new ArrayList<>();
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
        if(getItemViewType(position)==BANNER){
            BannerViewHolder bannerViewHolder= (BannerViewHolder) holder;
            bannerViewHolder.setData();
        }

    }

    @Override
    public int getItemCount() {
        return 1;
    }
   //得到类型
    @Override
    public int getItemViewType(int position) {
        switch (position){
            case BANNER:
                currentType=BANNER;
                break;
            case LIST:
                currentType=LIST;
                break;
            case VIEDIO:
                currentType=VIEDIO;
                break;

        }
        return currentType;
    }
}
