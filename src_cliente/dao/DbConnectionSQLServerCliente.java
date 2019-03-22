
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author TSC
 */
public class DbConnectionSQLServerCliente {
    
      Connection conn;

    
     public Connection getConnection() {

        String url = "jdbc:sqlserver://talavis.database.windows.net:1433;database=CardapioEletronico;user=talavis@talavis;password={Sera2009-}";
       
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url);
            System.out.println("Conexao OK!");
            return conn;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Conexao Falhou!");
            return null;
        }

    }

}
