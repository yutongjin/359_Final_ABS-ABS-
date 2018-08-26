package com.bookmarkers.DB.DAO;

import com.bookmarkers.DB.DAO.AbstractDAO;

import java.sql.Connection;

public abstract class SearchService extends AbstractDAO {
    public SearchService(Connection conn) {
        super(conn);
    }
    public abstract void search(String info);
}
