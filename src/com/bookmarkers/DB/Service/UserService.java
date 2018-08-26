package com.bookmarkers.DB.Service;

import java.sql.SQLException;

public interface UserService {

    public abstract boolean checkOutItem(String userId,String itemId) throws SQLException;
    public abstract boolean returnItem(String userId,String itemId);
    public abstract void searchByAuthor(String Author) ;
    public abstract void searchById(String Id) ;
    public abstract void searchByKeyWord(String KeyWord) ;
    public abstract boolean login(String username,String password);
}
