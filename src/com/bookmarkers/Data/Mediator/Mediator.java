package com.bookmarkers.Data.Mediator;

import java.sql.SQLException;
import java.text.ParseException;

public interface Mediator {
    public void checkOutItem(String userId , String itemId) throws SQLException, ParseException;
    public void returnItem(String userId , String itemId) throws SQLException;
}
