package com.bookmarkers.DB.LookUp;

import org.json.JSONArray;

import java.sql.SQLException;

/**
 * @Author : Yutong Jin
 * @date : 8/16/18
 * @Description :
 */
public class TestFindByType {
    public static void main(String[] args) throws SQLException {

        JSONArray jsonArray =  new ByType().lookUpByType();
    }
}
