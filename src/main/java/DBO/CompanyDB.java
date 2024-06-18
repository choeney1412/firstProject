package DBO;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CompanyDB {
    public static void main(String[] arg) throws SQLException {
        String url = "jdbc:sqlserver://aws-sinzitsang.cta8qgqswukj.us-west-1.rds.amazonaws.com\\SQLEXPRESS:1433;encrypt=true;trustServerCertificate=true;databaseName=Sinzitsang";

        //String url = "jdbc:sqlserver://EC2AMAZ-K5BT82P;Database=Sinzitsang;IntegratedSecurity=true";
        String user = "admin";
        String password = "Poponendup2863!";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connect to SQL server successful");
            DatabaseMetaData dm = connection.getMetaData();
            System.out.println("Driver name: " + dm.getDriverName());
            System.out.println("Driver version: " + dm.getDriverVersion());
            System.out.println("Product name: " + dm.getDatabaseProductName());
            System.out.println("Product version: " + dm.getDatabaseProductVersion());
            System.out.println("successful");
        } catch (SQLException e) {
            System.out.println("DB connection failed");

            e.printStackTrace();
        }

    }
}
