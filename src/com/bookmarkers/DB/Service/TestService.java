package com.bookmarkers.DB.Service;

import com.bookmarkers.DB.Factory.DAOFactory.ServiceFactory;
import com.bookmarkers.DB.Service.Impl.UserServiceImpl;
import com.bookmarkers.Data.User.User;

import java.sql.SQLException;

/**
 * @Author : Yutong Jin
 * @date : 8/20/18
 * @Description :
 */
public class TestService {
    public static void main(String[] args) {
        //checkOut("001");
        //returnItem("Yuin");
        //returnItem("001");
        //SearchService searchService = new SearchByAuthor().search("cooper");
        new UserServiceImpl().searchByKeyWord("mag");
    }
    public static void checkOut(String name){
        User user  =new User(name);
        UserService userService = ServiceFactory.getUserServiceInstance();
        for (int i = 1; i < 8; i++) {
            String itemId = "00" + i;
            try {
                if(userService.checkOutItem(user.getId(),itemId)){
                    System.out.println("Check out Success");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void returnItem(String name){
        User user  =new User(name);
        UserService userService = ServiceFactory.getUserServiceInstance();
        for (int i = 1; i < 8; i++) {
            String itemId = "00" + i;
            if(userService.returnItem(user.getId(),itemId)){
                System.out.println("return Success");
            }
        }
    }
}
