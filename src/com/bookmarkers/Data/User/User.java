package com.bookmarkers.Data.User;

import com.bookmarkers.Data.Item.Item;

import java.util.List;

/**
 * @Author : Yutong Jin
 * @date : 8/15/18
 * @Description :
 */
public class User {
    String Id;
    String name;
    String email;
    String phone;
    List<Item> itemList;
    String username;
    String password;
    int[] left;//the number of each type that a user can borrow;

    public void checkOut(String Id){

    }
    public void returnItem(String Id){

    }
    public void showMyStatus(){

    }
}
