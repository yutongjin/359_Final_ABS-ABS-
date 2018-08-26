package com.bookmarkers.DB.DAO.Impl.SearchStrategy;

import com.bookmarkers.DB.DAO.SearchService;

import java.sql.*;

/**
 * @Author : Yutong Jin
 * @date : 8/24/18
 * @Description :
 */
public class SearchByAuthor extends SearchService {
    public SearchByAuthor(Connection conn) {
        super(conn);
    }
    @Override
    public void search(String info) {
        java.sql.Connection connection = this.conn;
        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String id = "";
        // look up status
        String sql = "SELECT Id FROM Item where Arthur like '%" + info +"%'";
        System.out.println("start searching");

        try (ResultSet resultSet = statement.executeQuery(sql)) {
            ResultSetMetaData metaData = resultSet.getMetaData();
            while (resultSet.next()) {
                //System.out.println("start searching");
                String columnName = metaData.getColumnLabel(1);
                id = resultSet.getString(columnName);
                System.out.println(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
