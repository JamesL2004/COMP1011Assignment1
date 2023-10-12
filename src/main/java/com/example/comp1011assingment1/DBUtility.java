package com.example.comp1011assingment1;

import javafx.scene.chart.XYChart;

import java.sql.*;
import java.util.ArrayList;

public class DBUtility {
    private static String user = "Jameslakjdlynch";
    private static String password = "7jPe2MY8-5";
    private static String connectUrl = "jdbc:mysql://172.31.22.43:3306/Jameslakjdlynch";

    public static ArrayList<Platform> getPlatforms() throws SQLException {
        ArrayList<Platform> platforms = new ArrayList<>();

        String sql = "SELECT * FROM platforms ORDER BY platformID";
        try(
                Connection conn = DriverManager.getConnection(connectUrl, user,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                )
        {
            while (resultSet.next()){
                Platform newPlatform = new Platform(resultSet.getInt("platformID"),
                        resultSet.getString("title"),
                        resultSet.getString("parentCompany"),
                        resultSet.getString("availibleCountries"),
                        resultSet.getInt("subCount"),
                        resultSet.getDouble("price"));
                platforms.add(newPlatform);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return platforms;
    }
    public static XYChart.Series<String, Integer> getScatterChartData() throws SQLException {
        XYChart.Series<String, Integer> series = new XYChart.Series<>();
        String sql = "SELECT title AS 'Streaming Service', subCount AS 'Subscriber Count' \n" +
                "FROM platforms \n" +
                "ORDER BY platformID ASC \n" +
                "LIMIT 35;\n";
        try(
                Connection conn = DriverManager.getConnection(connectUrl,user, password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while(resultSet.next()){
                series.getData().add(new XYChart.Data<>(resultSet.getString("Streaming Service"), resultSet.getInt("Subscriber Count")));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return series;
    }

}


