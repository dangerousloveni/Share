package xx.com.edu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import xx.com.edu.home.fragment.bean.MessageBean;

public class MessageInfoActivity extends AppCompatActivity {

    private MessageBean messageBean;
    private ImageView  user_photo;
    private TextView name;
    private TextView phone;
    private  TextView theme;
    private  TextView content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_info);
        messageBean= (MessageBean) getIntent().getSerializableExtra("messageBean");
        user_photo= (ImageView) findViewById(R.id.im_userphone);
        name= (TextView) findViewById(R.id.tv_ssname);
        phone= (TextView) findViewById(R.id.tv_ssphone);
        theme=(TextView)findViewById(R.id.tv_stheme);
        content=(TextView)findViewById(R.id.tv_scontent);
        if (messageBean!=null)
        initView(messageBean);

    }

    private void initView(MessageBean messageBean) {
        user_photo.setImageResource(messageBean.getIamgesID());
        name.setText(messageBean.getUserName());
        phone.setText(messageBean.getPhoneNumber());
        theme.setText(messageBean.getTheme());
        content.setText(messageBean.getContent());

    }
}
