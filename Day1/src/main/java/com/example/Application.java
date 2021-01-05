package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
        // 어느 데이터베이스에 접근을 할 것인가 하는 url
        // 해당 데이터베이스에 접근하기 위한 인증 정보
        String url = "jdbc:mysql://localhost:3306/jpa?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "dlek1011";
        String password = "ekgka8168";

        try(Connection connection = DriverManager.getConnection(url, username, password)) { // try with resource
            System.out.println("Connection created: " + connection);
            String sql = "INSERT INTO ACCOUNT VALUES(1, 'DAHAM', 'PASS');";
            try(PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.execute();
            }

        }
    }
}
