/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recherche_info;

import BDD.Chambre;
import BDD.Docteur;
import BDD.Employé;
import BDD.Hospitalisation;
import BDD.Infirmier;
import BDD.Malade;
import BDD.Service;
import BDD.Soigne;
import ConnexionPart.Connexion;
import ConnexionPart.SSHTunnel;

import java.sql.*;
import java.util.*;

/**
 *
 * @author paulferrand
 */
public class Recherche {
    Connection connec;
    public Recherche (Connection conn) throws SQLException{
        connec = conn;
    }
    
    //Chambre 
    public Chambre ajout(Chambre cham) throws SQLException {
		Statement state = connec.createStatement();
                // Mise en place INSERT SQL
		String requinser = "INSERT INTO chambre VALUES (    ";
                requinser += "'" + cham.getccodeServ()+ "'";
                requinser += ", '" + String.valueOf(cham.getcNumCham())+ "'";
                requinser += ", '" + String.valueOf(cham.getcNumSurv())+ "'";
                requinser += ", '" + String.valueOf(cham.getnbre_lits())+ "'";
                requinser += ")";
                
                state.executeUpdate(requinser);
                
                //ajout de la classe
                Chambre chambre = new Chambre();
		chambre.setcNumCham(cham.getcNumCham());
		chambre.setccodeServ(cham.getccodeServ());
		chambre.setcNumSurv(cham.getcNumSurv());
		chambre.setnbre_lits(cham.getnbre_lits());
		
		System.out.println("insertion terminée");
		return chambre;
    }
    
    //Docteur 
    public Chambre ajout(Docteur doc) throws SQLException {
		Statement state = connec.createStatement();
                // Mise en place INSERT SQL
		String requinser = "INSERT INTO chambre VALUES (    ";
                requinser += "'" + doc.getccodeServ()+ "'";
                requinser += ", '" + String.valueOf(doc.getcNumCham())+ "'";
                requinser += ", '" + String.valueOf(cham.getcNumSurv())+ "'";
                requinser += ", '" + String.valueOf(cham.getnbre_lits())+ "'";
                requinser += ")";
                
                state.executeUpdate(requinser);
                
                //ajout de la classe
                Chambre chambre = new Chambre();
		chambre.setcNumCham(cham.getcNumCham());
		chambre.setccodeServ(cham.getccodeServ());
		chambre.setcNumSurv(cham.getcNumSurv());
		chambre.setnbre_lits(cham.getnbre_lits());
		
		System.out.println("insertion terminée");
		return chambre;
    }
    
    //Employé
    public Employé ajout(Employé emp) throws SQLException {
		Statement state = connec.createStatement();
                // Mise en place INSERT SQL
		String requinser = "INSERT INTO chambre VALUES (    ";
                requinser += "'" + emp.getccodeServ()+ "'";
                requinser += ", '" + String.valueOf(emp.getcNumCham())+ "'";
                requinser += ", '" + String.valueOf(emp.getcNumSurv())+ "'";
                requinser += ", '" + String.valueOf(emp.getnbre_lits())+ "'";
                requinser += ")";
                
                state.executeUpdate(requinser);
                
                //ajout de la classe
                Chambre chambre = new Chambre();
		chambre.setcNumCham(cham.getcNumCham());
		chambre.setccodeServ(cham.getccodeServ());
		chambre.setcNumSurv(cham.getcNumSurv());
		chambre.setnbre_lits(cham.getnbre_lits());
		
		System.out.println("insertion terminée");
		return chambre;
    }
    
    //Hospitalisation
    public Chambre ajout(Chambre cham) throws SQLException {
		Statement state = connec.createStatement();
                // Mise en place INSERT SQL
		String requinser = "INSERT INTO chambre VALUES (    ";
                requinser += "'" + cham.getccodeServ()+ "'";
                requinser += ", '" + String.valueOf(cham.getcNumCham())+ "'";
                requinser += ", '" + String.valueOf(cham.getcNumSurv())+ "'";
                requinser += ", '" + String.valueOf(cham.getnbre_lits())+ "'";
                requinser += ")";
                
                state.executeUpdate(requinser);
                
                //ajout de la classe
                Chambre chambre = new Chambre();
		chambre.setcNumCham(cham.getcNumCham());
		chambre.setccodeServ(cham.getccodeServ());
		chambre.setcNumSurv(cham.getcNumSurv());
		chambre.setnbre_lits(cham.getnbre_lits());
		
		System.out.println("insertion terminée");
		return chambre;
    }
    
    //Infirmier
    public Chambre ajout(Chambre cham) throws SQLException {
		Statement state = connec.createStatement();
                // Mise en place INSERT SQL
		String requinser = "INSERT INTO chambre VALUES (    ";
                requinser += "'" + cham.getccodeServ()+ "'";
                requinser += ", '" + String.valueOf(cham.getcNumCham())+ "'";
                requinser += ", '" + String.valueOf(cham.getcNumSurv())+ "'";
                requinser += ", '" + String.valueOf(cham.getnbre_lits())+ "'";
                requinser += ")";
                
                state.executeUpdate(requinser);
                
                //ajout de la classe
                Chambre chambre = new Chambre();
		chambre.setcNumCham(cham.getcNumCham());
		chambre.setccodeServ(cham.getccodeServ());
		chambre.setcNumSurv(cham.getcNumSurv());
		chambre.setnbre_lits(cham.getnbre_lits());
		
		System.out.println("insertion terminée");
		return chambre;
    }
    
    //Malade
    public Chambre ajout(Chambre cham) throws SQLException {
		Statement state = connec.createStatement();
                // Mise en place INSERT SQL
		String requinser = "INSERT INTO chambre VALUES (    ";
                requinser += "'" + cham.getccodeServ()+ "'";
                requinser += ", '" + String.valueOf(cham.getcNumCham())+ "'";
                requinser += ", '" + String.valueOf(cham.getcNumSurv())+ "'";
                requinser += ", '" + String.valueOf(cham.getnbre_lits())+ "'";
                requinser += ")";
                
                state.executeUpdate(requinser);
                
                //ajout de la classe
                Chambre chambre = new Chambre();
		chambre.setcNumCham(cham.getcNumCham());
		chambre.setccodeServ(cham.getccodeServ());
		chambre.setcNumSurv(cham.getcNumSurv());
		chambre.setnbre_lits(cham.getnbre_lits());
		
		System.out.println("insertion terminée");
		return chambre;
    }
    
    //Service
    public Chambre ajout(Chambre cham) throws SQLException {
		Statement state = connec.createStatement();
                // Mise en place INSERT SQL
		String requinser = "INSERT INTO chambre VALUES (    ";
                requinser += "'" + cham.getccodeServ()+ "'";
                requinser += ", '" + String.valueOf(cham.getcNumCham())+ "'";
                requinser += ", '" + String.valueOf(cham.getcNumSurv())+ "'";
                requinser += ", '" + String.valueOf(cham.getnbre_lits())+ "'";
                requinser += ")";
                
                state.executeUpdate(requinser);
                
                //ajout de la classe
                Chambre chambre = new Chambre();
		chambre.setcNumCham(cham.getcNumCham());
		chambre.setccodeServ(cham.getccodeServ());
		chambre.setcNumSurv(cham.getcNumSurv());
		chambre.setnbre_lits(cham.getnbre_lits());
		
		System.out.println("insertion terminée");
		return chambre;
    }
    
    //Soigne
    public Chambre ajout(Chambre cham) throws SQLException {
		Statement state = connec.createStatement();
                // Mise en place INSERT SQL
		String requinser = "INSERT INTO chambre VALUES (    ";
                requinser += "'" + cham.getccodeServ()+ "'";
                requinser += ", '" + String.valueOf(cham.getcNumCham())+ "'";
                requinser += ", '" + String.valueOf(cham.getcNumSurv())+ "'";
                requinser += ", '" + String.valueOf(cham.getnbre_lits())+ "'";
                requinser += ")";
                
                state.executeUpdate(requinser);
                
                //ajout de la classe
                Chambre chambre = new Chambre();
		chambre.setcNumCham(cham.getcNumCham());
		chambre.setccodeServ(cham.getccodeServ());
		chambre.setcNumSurv(cham.getcNumSurv());
		chambre.setnbre_lits(cham.getnbre_lits());
		
		System.out.println("insertion terminée");
		return chambre;
    }
}
