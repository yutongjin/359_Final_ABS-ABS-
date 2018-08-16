package com.bookmarkers.Data.Item;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import com.bookmarkers.Data.User.User;

/**
 * @Author : Yutong Jin
 * @date : 8/15/18
 * @Description :
 */
public abstract class Item {
    private String Id; // id number
    private String name; // item name
    private Date dateCreated;
    private boolean active;
    private Date returnDate;
    private User booker;
    private int[] cost;
    List<String> KeyWord;

    public Item(String id, String name, Date dateCreated, boolean active, Date returnDate, User booker, int[] cost, List<String> keyWord) {
        Id = id;
        this.name = name;
        this.dateCreated = dateCreated;
        this.active = active;
        this.returnDate = returnDate;
        this.booker = booker;
        this.cost = cost;
        KeyWord = keyWord;
    }
}
