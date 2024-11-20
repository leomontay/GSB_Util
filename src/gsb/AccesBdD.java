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
    
   /*public ResultSet getLeslivresUnEditeur(String editeur) {
        try {
            ResultSet result = null;
            String sql = "SELECT * FROM livre WHERE editeur = ?";
            PreparedStatement statement;
            statement = connexion.prepareStatement(sql);
            statement.setString(1, editeur);
            result = statement.executeQuery();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(AccesBdD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
    
    public ResultSet getLeslivresUneCategorie(String categorie) {
        try {
            ResultSet result = null;
            String sql = "SELECT * FROM livre INNER JOIN categorie ON categorie.id=livre.categorie WHERE categorie = ?";
            PreparedStatement statement;
            statement = connexion.prepareStatement(sql);
            statement.setString(1, categorie);
            result = statement.executeQuery();
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(AccesBdD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
    
    public int ajoutLivre(String titre, String auteur, String editeur, int annee, int categorie) {
        try {
            String sql = "INSERT INTO livre (titre, auteur, editeur, annee, categorie) VALUES (?, ?, ?, ?, ?)";
            int rowsInserted = 0;
            PreparedStatement statement = connexion.prepareStatement(sql);
            statement.setString(1, titre);
            statement.setString(2, auteur);
            statement.setString(3, editeur);
            statement.setInt(4, annee);
            statement.setInt(5, categorie);
            rowsInserted = statement.executeUpdate();
            return rowsInserted;
        } catch (SQLException ex) {
            Logger.getLogger(AccesBdD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int ajoutCategorie(String libelle) {
        try {
            String sql = "INSERT INTO categorie (id, libelle) VALUES (?, ?)";
            int rowsInserted = 0;
            PreparedStatement statement = connexion.prepareStatement(sql);
            statement.setString(1, libelle);
            rowsInserted = statement.executeUpdate();
            return rowsInserted;
        } catch (SQLException ex) {
            Logger.getLogger(AccesBdD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int supprimerLivre(int idLivre) throws SQLException {
        int nbLivresSupprimes = 0;
        String sql = "DELETE FROM livre WHERE id = ?";
        PreparedStatement statement = connexion.prepareStatement(sql);
        statement.setInt(1, idLivre);
        nbLivresSupprimes = statement.executeUpdate();
        statement.close();
        return nbLivresSupprimes;
    }
    
    public void modifTitre(int id, String nouveauTitre) {
        try {
            String sql = "UPDATE livre SET titre = ? WHERE id = ?";
            PreparedStatement statement = connexion.prepareStatement(sql);
            statement.setString(1, nouveauTitre);
            statement.setInt(2, id);
        } catch (SQLException ex) {
            Logger.getLogger(AccesBdD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modifLivre(String titre,String auteur, String editeur, int annee, int categorie) {
        try {
            String sql = "UPDATE livre SET titre = ? SET auteur = ? SET editeur = ? SET annee= ? SET categorie = ? WHERE id = ?";
            PreparedStatement statement = connexion.prepareStatement(sql);
              statement.setString(1, titre);
            statement.setString(2, auteur);
            statement.setString(3, editeur);
            statement.setInt(4, annee);
            statement.setInt(5, categorie);
        } catch (SQLException ex) {
            Logger.getLogger(AccesBdD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getLesCategories() {
        try {
            String sql = "SELECT * FROM categorie";
            Statement statement;
            ResultSet result = null;
            
            statement = connexion.createStatement();
            result = statement.executeQuery(sql);
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(AccesBdD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }*/
}
