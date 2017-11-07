package xx.com.edu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import xx.com.edu.home.fragment.bean.MessageBean;

public class MessageInfoActivity extends AppCompatActivity {

    private MessageBean messageBean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_info);
        messageBean= (MessageBean) getIntent().getSerializableExtra("messageBean");

    }
}
