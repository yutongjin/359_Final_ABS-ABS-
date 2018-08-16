package com.bookmarkers.Data.Item;

import com.bookmarkers.Data.User.User;

import java.util.Date;
import java.util.List;

/**
 * @Author : Yutong Jin
 * @date : 8/15/18
 * @Description :
 */
public class Set extends Item{
    public Set(String id, String name, Date dateCreated, boolean active, Date returnDate, User booker, int[] cost, List<String> keyWord) {
        super(id, name, dateCreated, active, returnDate, booker, cost, keyWord);
    }
}
