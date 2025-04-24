/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gsb;

import java.util.Date;

/**
 * Représente un utilisateur de l'application.
 *
 * <p>Un utilisateur est caractérisé par un identifiant, un nom, un prénom, un login, 
 * une adresse, un code postal, une ville et une date d'embauche.</p>
 * 
 * <p>Cette classe est principalement utilisée pour stocker et manipuler les données
 * des utilisateurs issues de la base de données.</p>
 * 
 * @author lmontay
 * @author mlefloch
 */
public class Utilisateur {

    private String id;
    private String nom;
    private String prenom;
    private String login;
    private String adresse;
    private int cp;
    private String ville;
    private Date dateEmbauche;

    /**
     * Constructeur de la classe Utilisateur.
     *
     * @param id Identifiant unique de l'utilisateur.
     * @param nom Nom de l'utilisateur.
     * @param prenom Prénom de l'utilisateur.
     * @param login Identifiant de connexion de l'utilisateur.
     * @param adresse Adresse postale de l'utilisateur.
     * @param cp Code postal de l'utilisateur.
     * @param ville Ville de résidence de l'utilisateur.
     * @param dateEmbauche Date d'embauche de l'utilisateur.
     */
    public Utilisateur(String id, String nom, String prenom, String login, String adresse, int cp, String ville, Date dateEmbauche) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.dateEmbauche = dateEmbauche;
    }

    /**
     * Retourne l'identifiant de l'utilisateur.
     *
     * @return Identifiant de l'utilisateur.
     */
    public String getId() {
        return id;
    }

    /**
     * Modifie l'identifiant de l'utilisateur.
     *
     * @param id Nouvel identifiant.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retourne le nom de l'utilisateur.
     *
     * @return Nom de l'utilisateur.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom de l'utilisateur.
     *
     * @param nom Nouveau nom.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le prénom de l'utilisateur.
     *
     * @return Prénom de l'utilisateur.
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Modifie le prénom de l'utilisateur.
     *
     * @param prenom Nouveau prénom.
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Retourne le login de l'utilisateur.
     *
     * @return Login de l'utilisateur.
     */
    public String getLogin() {
        return login;
    }

    /**
     * Modifie le login de l'utilisateur.
     *
     * @param login Nouveau login.
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Retourne l'adresse postale de l'utilisateur.
     *
     * @return Adresse postale.
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Modifie l'adresse postale de l'utilisateur.
     *
     * @param adresse Nouvelle adresse.
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Retourne le code postal de l'utilisateur.
     *
     * @return Code postal.
     */
    public int getCp() {
        return cp;
    }

    /**
     * Modifie le code postal de l'utilisateur.
     *
     * @param cp Nouveau code postal.
     */
    public void setCp(int cp) {
        this.cp = cp;
    }

    /**
     * Retourne la ville de résidence de l'utilisateur.
     *
     * @return Ville.
     */
    public String getVille() {
        return ville;
    }

    /**
     * Modifie la ville de résidence de l'utilisateur.
     *
     * @param ville Nouvelle ville.
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * Retourne la date d'embauche de l'utilisateur.
     *
     * @return Date d'embauche.
     */
    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    /**
     * Modifie la date d'embauche de l'utilisateur.
     *
     * @param dateEmbauche Nouvelle date d'embauche.
     */
    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
}
