package com.example.learn.utils;

import java.sql.Date;

public class Common {

    public static Date getDate() {
        java.util.Date data = new java.util.Date();
        Date currentDate  = new java.sql.Date(data.getTime());

        return currentDate;
    }

}
