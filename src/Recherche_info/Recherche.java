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
    public Docteur ajout(Docteur doc) throws SQLException {
		Statement state = connec.createStatement();
                // Mise en place INSERT SQL
		String requinser = "INSERT INTO docteur VALUES (    ";
                requinser += "'" + String.valueOf(doc.geteNum())+ "'";
                requinser += ", '" + doc.getspecialite()+ "'";
                requinser += ")";
                
                state.executeUpdate(requinser);
                //ajout d'une classe employe
                Employé emp2=doc;
                ajout(emp2);
                
                //ajout de la classe
                Docteur docteur = new Docteur();
		docteur.seteNum(doc.geteNum());
		docteur.seteNom(doc.geteNom());
		docteur.setePrenom(doc.getePrenom());
		docteur.seteTel(doc.geteTel());
		docteur.seteAdresse(doc.geteAdresse());
		docteur.setspecialite(doc.getspecialite());
		
		System.out.println("insertion terminée");
		return docteur;
    }
    
    //Employé
    public Employé ajout(Employé emp) throws SQLException {
		Statement state = connec.createStatement();
                // Mise en place INSERT SQL
		String requinser = "INSERT INTO employe VALUES (    ";
                requinser += "'" + String.valueOf(emp.geteNum())+ "'";
                requinser += ", '" + emp.geteNom()+ "'";
                requinser += ", '" + emp.getePrenom()+ "'";
                requinser += ", '" + emp.geteTel()+ "'";
                requinser += ", '" + emp.geteAdresse()+ "'";
                requinser += ")";
                
                state.executeUpdate(requinser);
                
                //ajout de la classe
                Employé employe = new Employé();
		employe.seteNum(emp.geteNum());
		employe.seteNom(emp.geteNom());
		employe.setePrenom(emp.getePrenom());
		employe.seteTel(emp.geteTel());
		employe.seteAdresse(emp.geteAdresse());
		
		System.out.println("insertion terminée");
		return employe;
    }
    
    //Hospitalisation
    public Hospitalisation ajout(Hospitalisation hos) throws SQLException {
		Statement state = connec.createStatement();
                // Mise en place INSERT SQL
		String requinser = "INSERT INTO hospitalisation VALUES (    ";
                requinser += "'" + String.valueOf(hos.gethNumMalade().getmNumMalade())+ "'";
                requinser += ", '" + String.valueOf(hos.gethNumService().getscodeServ())+ "'";
                requinser += ", '" + String.valueOf(hos.gethNumCham().getcNumCham())+ "'";
                requinser += ", '" + String.valueOf(hos.gethNumlit())+ "'";
                requinser += ")";
                
                state.executeUpdate(requinser);
                
                //ajout de la classe
                Hospitalisation hospitalisation = new Hospitalisation();
		hospitalisation.sethNumMalade(hos.gethNumMalade());
		hospitalisation.sethNumService(hos.gethNumService());
		hospitalisation.sethNumCham(hos.gethNumCham());
		hospitalisation.sethNumlit(hos.gethNumlit());
		
		System.out.println("insertion terminée");
		return hospitalisation;
    }
    
    //Infirmier
    public Infirmier ajout(Infirmier inf) throws SQLException {
		Statement state = connec.createStatement();
                // Mise en place INSERT SQL
		String requinser = "INSERT INTO infirmier VALUES (    ";
                requinser += "'" + String.valueOf(inf.geteNum())+ "'";
                requinser += ", '" + String.valueOf(inf.geticode_service())+ "'";
                requinser += ", '" + inf.getRotation()+ "'";
                requinser += ", '" + String.valueOf(inf.getSalaire())+ "'";
                requinser += ")";
                
                state.executeUpdate(requinser);
                //une classe employé est aussi créée
                Employé emp2=inf;
                ajout(emp2);
                
                //ajout de la classe
                Infirmier infirmier = new Infirmier();
		infirmier.seteNum(inf.geteNum());
		infirmier.seteNom(inf.geteNom());
		infirmier.setePrenom(inf.getePrenom());
		infirmier.seteTel(inf.geteTel());
		infirmier.seteAdresse(inf.geteAdresse());
		infirmier.seticode_service(inf.geticode_service());
		infirmier.setRotation(inf.getRotation());
		infirmier.setSalaire(inf.getSalaire());
		
		System.out.println("insertion terminée");
		return infirmier;
    }
    
    //Malade
    public Malade ajout(Malade mal) throws SQLException {
		Statement state = connec.createStatement();
                // Mise en place INSERT SQL
		String requinser = "INSERT INTO malade VALUES (    ";
                requinser += "'" + String.valueOf(mal.getmNumMalade())+ "'";
                requinser += ", '" + mal.getmNom()+ "'";
                requinser += ", '" + mal.getmPrenom()+ "'";
                requinser += ", '" + mal.getmTel()+ "'";
                requinser += ", '" + mal.getmNomMutuel()+ "'";
                requinser += ")";
                
                state.executeUpdate(requinser);
                
                //ajout de la classe
                Malade malade = new Malade();
		malade.setmNumMalade(mal.getmNumMalade());
		malade.setmNom(mal.getmNom());
		malade.setmPrenom(mal.getmPrenom());
		malade.setmTel(mal.getmTel());
		malade.setmNomMutuel(mal.getmNomMutuel());
		
		System.out.println("insertion terminée");
		return malade;
    }
    
    //Service
    public Service ajout(Service serv) throws SQLException {
		Statement state = connec.createStatement();
                // Mise en place INSERT SQL
		String requinser = "INSERT INTO service VALUES (    ";
                requinser += "'" + serv.getscodeServ()+ "'";
                requinser += ", '" + serv.getsNom()+ "'";
                requinser += ", '" + serv.getslettreBat()+ "'";
                requinser += ", '" + String.valueOf(serv.getsdirecnum())+ "'";
                requinser += ")";
                
                state.executeUpdate(requinser);
                
                //ajout de la classe
                Service service = new Service();
		service.setscodeServ(serv.getscodeServ());
		service.setsNom(serv.getsNom());
		service.setslettreBat(serv.getslettreBat());
		service.setsdirecnum(serv.getsdirecnum());
		
		System.out.println("insertion terminée");
		return service;
    }
    
    //Soigne
    public Soigne ajout(Soigne soi) throws SQLException {
		Statement state = connec.createStatement();
                // Mise en place INSERT SQL
		String requinser = "INSERT INTO soigne VALUES (    ";
                requinser += "'" + String.valueOf(soi.getso_eNum())+ "'";
                requinser += ", '" + String.valueOf(soi.getsoNumMalade())+ "'";
                requinser += ")";
                
                state.executeUpdate(requinser);
                
                //ajout de la classe
                Soigne soigne = new Soigne();
		soigne.setsoNumMalade(soi.getsoNumMalade());
		soigne.setso_eNum(soi.getso_eNum());
		
		System.out.println("insertion terminée");
		return soigne;
    }
}
