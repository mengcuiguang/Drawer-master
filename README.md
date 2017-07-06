# Drawer-master
抽屉菜单listView

![image](https://github.com/mengcuiguang/Drawer-master/blob/master/test.gif )  

使用方法：

1、布局文件

       <com.meng.drawer_master.SlidingDrawer
            android:id="@+id/slidingdrawer"
            android:layout_width="match_parent"
            android:layout_height="match_parent">

            <ListView
                android:id="@+id/listview"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_margin="16dp"
                android:divider="#00f"
                android:dividerHeight="1dp"
                android:scrollbars="none" />

        </com.meng.drawer_master.SlidingDrawer>
    
2、MainActivity 

        mSlidingDrawer = (SlidingDrawer) findViewById(R.id.slidingdrawer);
        mSlidingDrawer.setClosedPostionHeight(600);
