package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private static final String URL = "jdbc:mysql://localhost:3306/aulajdb?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "@2512_Otacilia";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection(){
        
        try {
            //carrega o Driver JDBC na memória
            Class.forName(DRIVER);
            System.out.println("Tentando conectar ao banco de dados ...");
            return DriverManager.getConnection(URL, USER, PASS);

        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado");
            throw new RuntimeException("Erro: DRIVER JDBC ausente.", e);
        } catch(SQLException e){
            System.out.println("Erro ao conectar banco de dados");
            throw new RuntimeException("Erro ao obter conexão");
        }
    }
}
