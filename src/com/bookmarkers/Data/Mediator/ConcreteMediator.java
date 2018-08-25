package com.bookmarkers.Data.Mediator;

import com.bookmarkers.DB.DatabaseConnection.DataBaseConnection;
import com.bookmarkers.Data.User.User;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Date;
/**
 * @Author : Yutong Jin
 * @date : 8/18/18
 * @Description :
 */
public class ConcreteMediator implements Mediator{
    List<User> userList;
    @Override
    public void checkOutItem(String userId,String itemId) throws SQLException, ParseException {

        Connection connection = DataBaseConnection.getInstance().getDBConnection();
        Statement statement = connection.createStatement();
        // look up status
        String sql = "SELECT Active FROM Item where Id = " + itemId;
        try (ResultSet resultSet = statement.executeQuery(sql)) {
            ResultSetMetaData metaData = resultSet.getMetaData();
            while (resultSet.next()) {
                String columnName = metaData.getColumnLabel(1);
                int value = resultSet.getInt(columnName);
                System.out.println(value);
            }
            System.out.println("找到了");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //end : look up status
        Date returnDate= new java.sql.Date(new java.util.Date().getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date dt = sdf.parse(returnDate.toString());
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
        rightNow.add(Calendar.MONTH, 1);
        Date dt1 = rightNow.getTime();
        String reStr = sdf.format(dt1);
        String sql2 = "UPDATE Item SET Active = 0 where Id = " + itemId;
        String sql3 = "UPDATE Item SET Booker ='" + userId + "' where Id = " + itemId;
        String sql4 = "UPDATE Item SET ReturnDate = '" + reStr + "' where Id = " + itemId;

        //String nowTime = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss").format(returnDate);//将时间格式转换成符合Timestamp要求的格式.

        //Timestamp goodsC_date =Timestamp.valueOf(returnDate);//把时间转换
        System.out.println(returnDate);
        String year = returnDate.toString();
        System.out.println(year);
        statement.executeUpdate(sql2);
        statement.executeUpdate(sql3);
        statement.executeUpdate(sql4);
        // itemList.add()
        System.out.println("Check out successfully!");
        // look up status
        try (ResultSet resultSet = statement.executeQuery(sql)) {
            ResultSetMetaData metaData = resultSet.getMetaData();
            while (resultSet.next()) {
                String columnName = metaData.getColumnLabel(1);
                int value = resultSet.getInt(columnName);
                System.out.println(value);
            }
            if(connection.isClosed()){
                System.out.println("Closed !");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //end : look up status
        // 依次打印出查询结果中Name的字符串
        //  System.out.println(resultSet.getString("username"));

        connection.close();
        if (connection.isClosed()) {
            System.out.println("Closed !");
        }

    }

    @Override
    public void returnItem(String userId, String itemId) throws SQLException {
        Connection connection = DataBaseConnection.getInstance().getDBConnection();
        Statement statement = connection.createStatement();
        String sql2 = "UPDATE Item SET Active = 1 where Id = " + itemId;
        String sql3 = "UPDATE Item SET Booker =null "  + " where Id = " + itemId;
        String sql4 = "UPDATE Item SET ReturnDate = null" + " where Id = " + itemId;
        statement.executeUpdate(sql2);
        statement.executeUpdate(sql3);
        statement.executeUpdate(sql4);
        connection.close();
        if (connection.isClosed()) {
            System.out.println("Closed !");
        }
    }

}
