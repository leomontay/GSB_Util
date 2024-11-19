/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gsb;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author lmontay & mlefloch
 */
public class UtilisateurDAO {
    private Connection connexion;

    public UtilisateurDAO(Connection connexion) {
        this.connexion = connexion;
    }
  
    public ArrayList<Utilisateur> getLesUtilisateurs() {
        ResultSet result = null;
        ArrayList<Utilisateur> listUtilisateur = new ArrayList<Utilisateur>();
        try {
            String sql = "SELECT id, nom, prenom, login, adresse, cp , ville, dateEmbauche FROM utilisateur";
            Statement statement;        
            statement = connexion.createStatement();
            result = statement.executeQuery(sql);
            while (result.next()) {
                Utilisateur util = new Utilisateur (result.getString("id"),result.getString("nom"),result.getString("prenom"),result.getString("login"),result.getString("adresse"), result.getInt("cp"), result.getString("ville"),result.getDate("dateEmbauche"));
                listUtilisateur.add(util);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccesBdD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listUtilisateur;
    }
    
    public ArrayList<Utilisateur> BarreRecherche(String recherche) {
        ArrayList<Utilisateur> tab = new ArrayList();
        try {
            String sql = "SELECT * FROM utilisateur WHERE nom LIKE '" + recherche + "%' OR id LIKE '" + recherche + "%'";
            PreparedStatement pstmt = connexion.prepareStatement(sql);
            String searchPattern = recherche + "%";
            pstmt.setString(1, searchPattern);
            pstmt.setString(2, searchPattern);
            pstmt.setString(3, searchPattern);
            pstmt.setString(4, searchPattern);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String login = rs.getString("login");
                String adresse = rs.getString("adresse");
                int cp = rs.getInt("cp");
                String ville = rs.getString("ville");
                Date dateEmbauche = rs.getDate("dateEmbauche");
                tab.add(new Utilisateur(id, nom, prenom, login, adresse, cp, ville, dateEmbauche));
            }
            connexion.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return tab;
    }

}
