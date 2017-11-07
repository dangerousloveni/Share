package xx.com.edu.message.fragment.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import xx.com.edu.R;
import xx.com.edu.home.fragment.channeladapter.EmploymentAdapter;
import xx.com.edu.home.fragment.channeladapter.EntertainmentAdapter;
import xx.com.edu.home.fragment.channeladapter.KnowledgeAdapter;
import xx.com.edu.message.fragment.adapter.AlreadyReceiveAdapter;
import xx.com.edu.message.fragment.adapter.AlreadyReleaseAdapter;

/**
 * Created by SwordIng on 2017/11/7.
 */

public class MessageListActivity extends Activity{
    GridView gridView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        gridView=(GridView)findViewById(R.id.list_grid);
        textView= (TextView) findViewById(R.id.title_name);


        Intent intent=getIntent();
        int position=intent.getIntExtra("position",0);
        switch (position){
            case 0:
                textView.setText("我已发布");
                gridView.setAdapter(new AlreadyReleaseAdapter(MessageListActivity.this));
                break;

            case 1:
                textView.setText("我已接受");
                gridView.setAdapter(new AlreadyReceiveAdapter(MessageListActivity.this));
                break;
            case 2:
                textView.setText("就业");
                gridView.setAdapter(new EmploymentAdapter(MessageListActivity.this));
                break;
            case 3:
                textView.setText("娱乐");
                gridView.setAdapter(new EntertainmentAdapter(MessageListActivity.this));
                break;
            case 4:
                textView.setText("知识");
                gridView.setAdapter(new KnowledgeAdapter(MessageListActivity.this));
                break;
            case 5:
                textView.setText("其他");
                gridView.setAdapter(new AlreadyReceiveAdapter(MessageListActivity.this));
                break;
        }
    }
}
