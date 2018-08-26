package com.bookmarkers.Data.User;

import java.sql.SQLException;
import java.text.ParseException;

/**
 * @Author : Yutong Jin
 * @date : 8/17/18
 * @Description :
 */
public class TestCheckout {
    public static void main(String[] args) throws SQLException, ParseException {
        User user  =new User("Kobe");
        user.checkOut("002");
        user.checkOut("003");
        user.checkOut("004");
        //user.returnItem("002");
    }
}
