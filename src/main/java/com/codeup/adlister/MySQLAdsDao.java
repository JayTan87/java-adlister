package com.codeup.adlister;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLAdsDao implements AdsDao{
    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
       connection = DriverManager.getConnection(
               config.getUrl(),
               config.getUser(),
               config.getPassword()
       );
    }
}
