package com.bookmarkers.DB.LookUp;

import com.bookmarkers.DB.DataBaseConnection;
import com.bookmarkers.DB.JSON.JSON;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.sql.*;

/**
 * @Author : Yutong Jin
 * @date : 8/16/18
 * @Description :
 */
public class ByType {
    public JSONArray lookUpByType() throws SQLException {
        Connection connection = DataBaseConnection.getInstance().getDBConnection();
        JSONArray jsonArray = new JSONArray();
        Statement statement = connection.createStatement();

        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM Item where Type = 'Art'")) {
            ResultSetMetaData metaData = resultSet.getMetaData();
            while (resultSet.next()) {
                JSONObject jsonObj = new JSONObject();
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    String columnName = metaData.getColumnLabel(i);
                    String value = resultSet.getString(columnName);
                    jsonObj.put(columnName, value);
                }
                jsonArray.put(jsonObj);
                // 依次打印出查询结果中Name的字符串
                //  System.out.println(resultSet.getString("username"));
            }
            System.out.println("转换JSON数据：");
            for (int i = 0; i < jsonArray.length(); i++) {
                System.out.println(jsonArray.get(i));

            }
            connection.close();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }
}
