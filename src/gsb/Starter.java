/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gsb;

/**
 * Classe principale de l'application permettant de lancer l'interface graphique.
 * 
 * <p>Elle initialise le thème graphique ("Nimbus" si disponible) et affiche la
 * fenêtre de connexion {@link FenetreLogin} au démarrage.</p>
 * 
 * <p>Cette classe contient uniquement la méthode {@code main}, qui constitue
 * le point d'entrée de l'application Java Swing.</p>
 * 
 * @author lmontay
 * @author mlefloch
 */
public class Starter {
      /**
     * Méthode principale de l'application.
     * 
     * <p>Configure l'apparence de l'interface graphique (look and feel)
     * en utilisant "Nimbus" si celui-ci est disponible, puis affiche
     * la fenêtre de connexion {@code FenetreLogin}.</p>
     *
     * @param args les arguments passés en ligne de commande (non utilisés ici)
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetreLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreLogin().setVisible(true);
            }
        });
    }
}
