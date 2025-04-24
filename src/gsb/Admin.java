/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gsb;

/**
 * Représente un administrateur de l'application avec ses informations d'identification.
 * 
 * <p>Cette classe contient les données liées à un administrateur telles que l'identifiant,
 * le login, le mot de passe et le nom. Elle est utilisée pour manipuler les objets 
 * administrateurs dans l'application.</p>
 * 
 * @author lmontay
 * @author mlefloch
 */
public class Admin {
    private int id;
    private String login;
    private String motdepasse;
    private String nom;

    /**
     * Constructeur de la classe Admin avec login et mot de passe.
     * 
     * @param login le nom d'utilisateur de l'administrateur
     * @param motdepasse le mot de passe de l'administrateur
     */
    public Admin(String login, String motdepasse) {
        this.login = login;
        this.motdepasse = motdepasse;
    }
    
    /**
     * Retourne l'identifiant de l'administrateur.
     * 
     * @return l'identifiant
     */
    public int getId() {
        return id;
    }

    /**
     * Définit l'identifiant de l'administrateur.
     * 
     * @param id l'identifiant à affecter
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retourne le login de l'administrateur.
     * 
     * @return le login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Définit le login de l'administrateur.
     * 
     * @param login le login à affecter
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Retourne le mot de passe de l'administrateur.
     * 
     * @return le mot de passe
     */
    public String getMotdepasse() {
        return motdepasse;
    }

    /**
     * Définit le mot de passe de l'administrateur.
     * 
     * @param motdepasse le mot de passe à affecter
     */
    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    /**
     * Retourne le nom de l'administrateur.
     * 
     * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom de l'administrateur.
     * 
     * @param nom le nom à affecter
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
