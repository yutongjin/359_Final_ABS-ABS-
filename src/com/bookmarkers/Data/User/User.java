package com.bookmarkers.Data.User;

import com.bookmarkers.DB.DatabaseConnection.DataBaseConnection;
import com.bookmarkers.Data.Item.Item;
import com.bookmarkers.Data.Mediator.ConcreteMediator;
import com.bookmarkers.Data.Mediator.Mediator;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;

import java.sql.*;
import java.text.ParseException;
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
    Mediator m;
    public User(String id) {
        this.Id = id;
    }

    public void checkOut(String itemId) throws SQLException, ParseException {

        m = new ConcreteMediator();
        m.checkOutItem(this.Id,itemId);

    }
    public void returnItem(String itemId) throws SQLException {
        m = new ConcreteMediator();
        m.returnItem(this.Id,itemId);


    }


    public void setId(String id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return Id;
    }
}
