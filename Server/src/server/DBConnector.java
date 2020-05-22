package server;

import java.sql.*;

public class DBConnector {
    String connectionString = "";

    public boolean authorization(String login, String password) throws SQLException {
        Connection connection = DriverManager.getConnection(connectionString);
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM users WHERE login = ? AND password = ?");
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            ResultSet result = preparedStatement.executeQuery("S");
            while (result.next()){
                return result.getInt(0) == 1;
            }
            return false;

        }
        catch (Exception ex){
            System.out.println(ex.getStackTrace());
            return false;
        }
        finally {
            connection.close();
        }
    }
}
