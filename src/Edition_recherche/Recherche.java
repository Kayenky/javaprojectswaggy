/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edition_recherche;

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
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author paulferrand
 */
public class Recherche {

    Connection connec;

    public Recherche(Connection conn) throws SQLException {
        connec = conn;
    }

    //Pour la navigation dans la base on a besoin que tout les données soient 
    //affichées dans l'interface graphique
    public List<Soigne> toutes_données() throws SQLException {
        List<Soigne> liste_soigne = new ArrayList<Soigne>();
        Statement state = connec.createStatement();
        ResultSet resulttout = state.executeQuery("SELECT * FROM soigne ");
        //tant qu'il y a un autre résultat avec la requete
        while (resulttout.next()) {
            Soigne soigne = new Soigne();
            Docteur docteur = new Docteur();
            Employé employe = new Employé();
            Malade malade = new Malade();

            docteur.seteNum(resulttout.getInt("no_docteur"));
            malade.setmNumMalade(resulttout.getInt("no_malade"));
            soigne.setso_eNum(docteur);
            soigne.setsoNumMalade(malade);

            liste_soigne.add(soigne);
        }
        resulttout.close();
        return liste_soigne;
    }

    public List<Soigne> toutes_données() throws SQLException {
        List<Soigne> liste_soigne = new ArrayList<Soigne>();
        Statement state = connec.createStatement();
        ResultSet resulttout = state.executeQuery("SELECT * FROM soigne ");
        //tant qu'il y a un autre résultat avec la requete
        while (resulttout.next()) {
            Soigne soigne = new Soigne();
            Docteur docteur = new Docteur();
            Employé employe = new Employé();
            Malade malade = new Malade();

            docteur.seteNum(resulttout.getInt("no_docteur"));
            malade.setmNumMalade(resulttout.getInt("no_malade"));
            soigne.setso_eNum(docteur);
            soigne.setsoNumMalade(malade);

            liste_soigne.add(soigne);
        }
        resulttout.close();
        return liste_soigne;
    }

    public List<Soigne> toutes_données() throws SQLException {
        List<Soigne> liste_soigne = new ArrayList<Soigne>();
        Statement state = connec.createStatement();
        ResultSet resulttout = state.executeQuery("SELECT * FROM soigne ");
        //tant qu'il y a un autre résultat avec la requete
        while (resulttout.next()) {
            Soigne soigne = new Soigne();
            Docteur docteur = new Docteur();
            Employé employe = new Employé();
            Malade malade = new Malade();

            docteur.seteNum(resulttout.getInt("no_docteur"));
            malade.setmNumMalade(resulttout.getInt("no_malade"));
            soigne.setso_eNum(docteur);
            soigne.setsoNumMalade(malade);

            liste_soigne.add(soigne);
        }
        resulttout.close();
        return liste_soigne;
    }

    public List<Soigne> toutes_données() throws SQLException {
        List<Soigne> liste_soigne = new ArrayList<Soigne>();
        Statement state = connec.createStatement();
        ResultSet resulttout = state.executeQuery("SELECT * FROM soigne ");
        //tant qu'il y a un autre résultat avec la requete
        while (resulttout.next()) {
            Soigne soigne = new Soigne();
            Docteur docteur = new Docteur();
            Employé employe = new Employé();
            Malade malade = new Malade();

            docteur.seteNum(resulttout.getInt("no_docteur"));
            malade.setmNumMalade(resulttout.getInt("no_malade"));
            soigne.setso_eNum(docteur);
            soigne.setsoNumMalade(malade);

            liste_soigne.add(soigne);
        }
        resulttout.close();
        return liste_soigne;
    }

    public List<Soigne> toutes_données() throws SQLException {
        List<Soigne> liste_soigne = new ArrayList<Soigne>();
        Statement state = connec.createStatement();
        ResultSet resulttout = state.executeQuery("SELECT * FROM soigne ");
        //tant qu'il y a un autre résultat avec la requete
        while (resulttout.next()) {
            Soigne soigne = new Soigne();
            Docteur docteur = new Docteur();
            Employé employe = new Employé();
            Malade malade = new Malade();

            docteur.seteNum(resulttout.getInt("no_docteur"));
            malade.setmNumMalade(resulttout.getInt("no_malade"));
            soigne.setso_eNum(docteur);
            soigne.setsoNumMalade(malade);

            liste_soigne.add(soigne);
        }
        resulttout.close();
        return liste_soigne;
    }

    public List<Soigne> toutes_données() throws SQLException {
        List<Soigne> liste_soigne = new ArrayList<Soigne>();
        Statement state = connec.createStatement();
        ResultSet resulttout = state.executeQuery("SELECT * FROM soigne ");
        //tant qu'il y a un autre résultat avec la requete
        while (resulttout.next()) {
            Soigne soigne = new Soigne();
            Docteur docteur = new Docteur();
            Employé employe = new Employé();
            Malade malade = new Malade();

            docteur.seteNum(resulttout.getInt("no_docteur"));
            malade.setmNumMalade(resulttout.getInt("no_malade"));
            soigne.setso_eNum(docteur);
            soigne.setsoNumMalade(malade);

            liste_soigne.add(soigne);
        }
        resulttout.close();
        return liste_soigne;
    }

    public List<Service> ser_toutes_données() throws SQLException {
        List<Service> liste_service = new ArrayList<Service>();
        Statement state = connec.createStatement();
        ResultSet resulttout = state.executeQuery("SELECT * FROM service ");
        //tant qu'il y a un autre résultat avec la requete
        while (resulttout.next()) {
            Service service = new Service();

            docteur.seteNum(resulttout.getInt("no_docteur"));
            malade.setmNumMalade(resulttout.getInt("no_malade"));
            soigne.setso_eNum(docteur);
            soigne.setsoNumMalade(malade);

            liste_service.add(service);
        }
        resulttout.close();
        return liste_service;
    }

    public List<Soigne> soi_toutes_données() throws SQLException {
        List<Soigne> liste_soigne = new ArrayList<Soigne>();
        Statement state = connec.createStatement();
        ResultSet resulttout = state.executeQuery("SELECT * FROM soigne ");
        //tant qu'il y a un autre résultat avec la requete
        while (resulttout.next()) {
            Soigne soigne = new Soigne();
            Docteur docteur = new Docteur();
            Employé employe = new Employé();
            Malade malade = new Malade();

            docteur.seteNum(resulttout.getInt("no_docteur"));
            malade.setmNumMalade(resulttout.getInt("no_malade"));
            soigne.setso_eNum(docteur);
            soigne.setsoNumMalade(malade);

            liste_soigne.add(soigne);
        }
        resulttout.close();
        return liste_soigne;
    }
}
