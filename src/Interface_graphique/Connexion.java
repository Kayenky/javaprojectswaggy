/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_graphique;

/*
 * 
 * Librairies importées
 */
import ConnexionPart.SSHTunnel;
import java.sql.*;

/*
 * 
 * Connexion a votre BDD via le tunnel SSH
 * 
 * @author segado
 */
public class Connexion {
    private static Connection conn;
    private static SSHTunnel ssh;

   
    public static boolean ConnexionSSH(String idECE, String mdpECE) throws ClassNotFoundException  {
        
        Class.forName("com.mysql.jdbc.Driver");// Chargement du driver "com.mysql.jdbc.Driver"

        // Connexion avec l'identifiant et le mot de passe en créant le tunnel
        Connexion.ssh = new SSHTunnel(idECE, mdpECE);
        return ssh.connect();
    }
    
    public static boolean ConnexionBDD(String idECE, String idBDD, String mdpBDD) {
        System.out.println("Connexion...");
        // url de connexion "jdbc:mysql://localhost:3305/usernameECE"
        String lienBDD = "jdbc:mysql://localhost:3305/" + idECE;
        
        try {
            Connexion.conn = DriverManager.getConnection(lienBDD, idBDD, mdpBDD);
            System.out.println("Connexion en ligne reussie");
            return true;
        }
        catch(SQLException e) {
            System.out.println("Connexion en ligne impossible");
        }
        
        return false;
    }
    
    public static boolean ConnexionBDDLocal(String nomBDD, String idBDD, String mdpBDD) {
        System.out.println("Connexion...");
        String lienBDD = "jdbc:mysql://localhost/" + nomBDD;
        
        try {
            //création d'une connexion JDBC à la base
            Connexion.conn = DriverManager.getConnection(lienBDD, idBDD, mdpBDD);
            System.out.println("Connexion en local reussie");
            return true;
        }
        catch(SQLException e) {
            System.out.println("Connexion en local impossible");
        }
        
        return false;
    }
    
    public static Connection getInstance(){
		return Connexion.conn;	
	}
}

