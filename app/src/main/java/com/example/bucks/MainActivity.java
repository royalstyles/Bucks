package com.example.bucks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;



import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mainLayout;
    private View drawerView;
    private View mainView;
    private ImageButton main_btnimg_list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mainLayout = (DrawerLayout)findViewById(R.id.main_layout);
        drawerView = (View)findViewById(R.id.drawerView);
        mainView = (View)findViewById(R.id.main_view);
        main_btnimg_list = (ImageButton)findViewById(R.id.main_btnimg_list);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        main_btnimg_list.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                mainLayout.openDrawer(drawerView);
//            }
//        });
    }

    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {
        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {
        }

        @Override
        public void onDrawerStateChanged(int newState) {
        }
    };


}
