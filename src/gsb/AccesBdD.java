/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gsb;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;

/**
 * @author lmontay & mlefloch
 */
public class AccesBdD {

    private final String dbURL = "jdbc:mysql://localhost:3306/gsb_frais";
    private final String username = "root";
    private final String password = "";
    private Connection connexion;
        
    public AccesBdD(){
        try { 
            this.connexion = DriverManager.getConnection(dbURL, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(AccesBdD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnexion(){
        return this.connexion;
    }
     
    public ResultSet getLogin(String login, String motdepasse) throws SQLException {
        String sql = "SELECT * FROM admin WHERE login = ? AND motdepasse = ?";
        PreparedStatement statement = connexion.prepareStatement(sql);
        statement.setString(1, login);
        statement.setString(2, motdepasse);
        return statement.executeQuery();
    }
}
