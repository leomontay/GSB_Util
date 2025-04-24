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
 * Classe permettant la gestion de la connexion à la base de données MySQL
 * et l'exécution de certaines requêtes, notamment l'authentification des administrateurs.
 * 
 * <p>Elle établit une connexion à la base de données "gsb_frais" et fournit
 * une méthode pour récupérer la connexion ainsi qu'une méthode pour vérifier
 * les identifiants d'un administrateur.</p>
 * 
 * @author lmontay
 * @author mlefloch
 */
public class AccesBdD {

    private final String dbURL = "jdbc:mysql://localhost:3306/gsb_frais";
    private final String username = "root";
    private final String password = "";
    private Connection connexion;
        
    /**
     * Constructeur de la classe AccesBdD.
     * <p>Tente d'établir une connexion à la base de données MySQL à l'aide
     * des informations fournies (URL, nom d'utilisateur, mot de passe).</p>
     */
    public AccesBdD(){
        try { 
            this.connexion = DriverManager.getConnection(dbURL, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(AccesBdD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Retourne l'objet {@link Connection} utilisé pour interagir avec la base de données.
     * 
     * @return la connexion à la base de données
     */
    public Connection getConnexion(){
        return this.connexion;
    }
     
     /**
     * Vérifie les identifiants de connexion d'un administrateur dans la base de données.
     * 
     * @param login le nom d'utilisateur fourni
     * @param motdepasse le mot de passe fourni
     * @return un {@link ResultSet} contenant les informations de l'administrateur si les identifiants sont corrects,
     *         sinon un résultat vide
     * @throws SQLException si une erreur survient lors de l'exécution de la requête SQL
     */
    public ResultSet getLogin(String login, String motdepasse) throws SQLException {
        String sql = "SELECT * FROM admin WHERE login = ? AND motdepasse = ?";
        PreparedStatement statement = connexion.prepareStatement(sql);
        statement.setString(1, login);
        statement.setString(2, motdepasse);
        return statement.executeQuery();
    }
}
