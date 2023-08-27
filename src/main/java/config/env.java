/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.io.IOException;
import java.util.Map;

/**
 *
 * @author Kent
 */
public class env {

    public static final String USER_NAME = "admin";
    public static final String PASSWORD = "12345";
    public static final String DB_URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=db_kho;" + "encrypt=true;trustServerCertificate=true";
}
