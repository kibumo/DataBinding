package com.databinding;

import android.view.View;
import android.widget.Toast;

public class User {
    private String name;
    private String nickName;
    private String email;

    private boolean vip;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public void clickName(View view){
        Toast.makeText(view.getContext(),"点击用户名"+name,Toast.LENGTH_SHORT).show();

    }
    public boolean longClickNickName(View view){
        Toast.makeText(view.getContext(),"长按昵称"+nickName,Toast.LENGTH_SHORT).show();
        return true;
    }

}
