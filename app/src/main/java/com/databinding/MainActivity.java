package com.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.databinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        User user=new User();
        user.setName("名字");
        user.setNickName("昵称");
        user.setEmail("1@1.net");

        user.setVip(true);

        User user1=new User();
        user1.setName("新人");
        user1.setNickName("DB");
        user1.setEmail("2@2.net");
        user1.setVip(false);

        List<User> users=new ArrayList<>();
        users.add(user);
        users.add(user1);
        binding.setUsers(users);
    }
}
