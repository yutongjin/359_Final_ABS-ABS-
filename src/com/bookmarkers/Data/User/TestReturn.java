package com.bookmarkers.Data.User;

import java.sql.SQLException;
import java.text.ParseException;

/**
 * @Author : Yutong Jin
 * @date : 8/19/18
 * @Description :
 */
public class TestReturn {
    public static void main(String[] args) throws SQLException, ParseException {
        User user  =new User("Kobe");
        user.returnItem("002");
        user.returnItem("003");
        user.returnItem("004");
        //user.returnItem("002");
    }
}
