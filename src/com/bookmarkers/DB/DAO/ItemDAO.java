package com.bookmarkers.DB.DAO;

import java.sql.SQLException;

public interface ItemDAO {
    public boolean checkOutItem(String userId, String itemId);

    public boolean returnItem(String userId, String itemId);

    public boolean active(String itemId) throws SQLException;

    public String getBookerId(String itemId) throws SQLException;

    public String getType(String itemId);
    public void searchByInfo(String info);
}