package com.meng.drawer_master;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SlidingDrawer mSlidingDrawer;
    private ListView mlistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSlidingDrawer = (SlidingDrawer) findViewById(R.id.slidingdrawer);
        mSlidingDrawer.setClosedPostionHeight(600);
//        mSlidingDrawer.setPartlyPositionHeight(400);
//        mSlidingDrawer.setAutoRewindHeight(280);

        mlistView = (ListView) findViewById(R.id.listview);
        mlistView.setAdapter(new ListViewAdapter());
        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                Toast.makeText(MainActivity.this, "item click:" + position, Toast.LENGTH_SHORT).show();
            }
        });

    }

    private class ListViewAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 30;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null)
                view = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_listview, null);
            ((TextView) view.findViewById(R.id.tv_listview)).setText(i + 1 + "碗胡辣汤");
            return view;
        }
    }
}
