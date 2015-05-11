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
import Interface_graphique.Connexion;
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
    Statement stmt;
    ResultSet rset;
    ResultSetMetaData rsetMeta;

    public Recherche(Connection conn) throws SQLException {
        connec = conn;
    }

    //Pour la navigation dans la base on a besoin que tout les données soient 
    //affichées dans l'interface graphique
    public List<Chambre> cha_toutes_données() throws SQLException {
        List<Chambre> liste_chambre = new ArrayList<Chambre>();
        Statement state = connec.createStatement();
        ResultSet resulttout = state.executeQuery("SELECT * FROM chambre ");
        //tant qu'il y a un autre résultat avec la requete
        while (resulttout.next()) {
            Chambre chambre = new Chambre();

            chambre.setccodeServ(resulttout.getString("code_service"));
            chambre.setcNumCham(resulttout.getInt("no_chambre"));
            chambre.setcNumSurv(resulttout.getInt("surveillant"));
            chambre.setnbre_lits(resulttout.getInt("nb_lits"));

            liste_chambre.add(chambre);
        }
        resulttout.close();
        return liste_chambre;
    }

    public List<Docteur> doc_toutes_données() throws SQLException {
        List<Docteur> liste_docteur = new ArrayList<Docteur>();
        Statement state = connec.createStatement();
        ResultSet resulttout = state.executeQuery("SELECT * FROM docteur ,employe WHERE docteur.numero = employe.numero");
        //tant qu'il y a un autre résultat avec la requete
        while (resulttout.next()) {
            Docteur docteur = new Docteur();

            docteur.setspecialite(resulttout.getString("specialite"));
            docteur.seteNum(resulttout.getInt("numero"));

            liste_docteur.add(docteur);
        }
        resulttout.close();
        return liste_docteur;
    }

    public List<Employé> emp_toutes_données() throws SQLException {
        List<Employé> liste_employe = new ArrayList<Employé>();
        Statement state = connec.createStatement();
        ResultSet resulttout = state.executeQuery("SELECT * FROM employe ");
        //tant qu'il y a un autre résultat avec la requete
        while (resulttout.next()) {
            Employé employe = new Employé();

            employe.seteNum(resulttout.getInt("numero"));
            employe.seteNom(resulttout.getString("nom"));
            employe.setePrenom(resulttout.getString("prenom"));
            employe.seteTel(resulttout.getString("tel"));
            employe.seteAdresse(resulttout.getString("adresse"));

            liste_employe.add(employe);
        }
        resulttout.close();
        return liste_employe;
    }

    public List<Hospitalisation> hos_toutes_données() throws SQLException {
        List<Hospitalisation> liste_hospitalisation = new ArrayList<Hospitalisation>();
        Statement state = connec.createStatement();
        ResultSet resulttout = state.executeQuery("SELECT * FROM hospitalisation ");
        //tant qu'il y a un autre résultat avec la requete
        while (resulttout.next()) {
            Hospitalisation hospitalisation = new Hospitalisation();
            Chambre chambre = new Chambre();
            Service service = new Service();
            Malade malade = new Malade();

            hospitalisation.sethNumlit(resulttout.getInt("lit"));
            malade.setmNumMalade(resulttout.getInt("no_malade"));
            service.setscodeServ(resulttout.getString("code_service"));
            chambre.setcNumCham(resulttout.getInt("no_chambre"));
            hospitalisation.sethNumCham(chambre);
            hospitalisation.sethNumService(service);
            hospitalisation.sethNumMalade(malade);

            liste_hospitalisation.add(hospitalisation);
        }
        resulttout.close();
        return liste_hospitalisation;
    }

    public List<Infirmier> inf_toutes_données() throws SQLException {
        List<Infirmier> liste_infirmier = new ArrayList<Infirmier>();
        Statement state = connec.createStatement();
        ResultSet resulttout = state.executeQuery("SELECT * FROM infirmier ,employe WHERE infirmier.numero = employe.numero");
        //tant qu'il y a un autre résultat avec la requete
        while (resulttout.next()) {
            Infirmier infirmier = new Infirmier();

            infirmier.seteNum(resulttout.getInt("numero"));
            infirmier.seticode_service(resulttout.getString("code_service"));
            infirmier.setRotation(resulttout.getString("rotaion"));
            infirmier.setSalaire(resulttout.getInt("salaire"));

            liste_infirmier.add(infirmier);
        }
        resulttout.close();
        return liste_infirmier;
    }

    public List<Malade> mal_toutes_données() throws SQLException {
        List<Malade> liste_malade = new ArrayList<Malade>();
        Statement state = connec.createStatement();
        ResultSet resulttout = state.executeQuery("SELECT * FROM malade ");
        //tant qu'il y a un autre résultat avec la requete
        while (resulttout.next()) {
            Malade malade = new Malade();

            malade.setmNumMalade(resulttout.getInt("numero"));
            malade.setmNom(resulttout.getString("nom"));
            malade.setmPrenom(resulttout.getString("prenom"));
            malade.setmAdresse(resulttout.getString("adresse"));
            malade.setmTel(resulttout.getString("tel"));
            malade.setmNomMutuel(resulttout.getString("mutuelle"));

            liste_malade.add(malade);
        }
        resulttout.close();
        return liste_malade;
    }

    public List<Service> ser_toutes_données() throws SQLException {
        List<Service> liste_service = new ArrayList<Service>();
        Statement state = connec.createStatement();
        ResultSet resulttout = state.executeQuery("SELECT * FROM service ");
        //tant qu'il y a un autre résultat avec la requete
        while (resulttout.next()) {
            Service service = new Service();

            service.setsdirecnum(resulttout.getInt("directeur"));
            service.setsNom(resulttout.getString("nom"));
            service.setslettreBat(resulttout.getString("batiment"));
            service.setscodeServ(resulttout.getString("code"));

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

    public ArrayList<String> requetes = new ArrayList<String>();

    public Recherche(String table, String champ, String str) throws SQLException {

        // création d'un ordre SQL (statement)
        stmt = connec.createStatement();

        creerRequetes(table, champ, str);
    }

    private void ajouterRequete(String requete) {
        requetes.add(requete);
    }

    private void creerRequetes(String table, String champ, String str) {
        ajouterRequete("SELECT " + champ + " FROM " + table + " WHERE " + table + "." + champ + "= '" + str + "';");

    }

    public ArrayList remplirChampsRequete(String requete) throws SQLException {
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery(requete);

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();

        // calcul du nombre de colonnes du resultat
        int nbColonne = rsetMeta.getColumnCount();

        // creation d'une ArrayList de String
        ArrayList<String> liste;
        liste = new ArrayList<>();

        // tant qu'il reste une ligne 
        while (rset.next()) {
            String champs;
            champs = rset.getString(1); // ajouter premier champ

            // Concatener les champs de la ligne separes par ,
            for (int i = 1; i < nbColonne; i++) {
                champs = champs + "," + rset.getString(i + 1);
            }

            // ajouter un "\n" à la ligne des champs
            champs = champs + "\n";

            // ajouter les champs de la ligne dans l'ArrayList
            liste.add(champs);
        }

        // Retourner l'ArrayList
        return liste;
    }

}
