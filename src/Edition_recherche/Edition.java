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

/**
 *
 * @author paulferrand
 */
public class Edition {

    Connection connec;

    public Edition(Connection conn) throws SQLException {
        connec = conn;
    }

    //Chambre
    //ajout
    public Chambre cha_ajout(Chambre cham) throws SQLException {
        Statement state = connec.createStatement();
        String requinser = "INSERT INTO chambre VALUES (    ";
        requinser += "'" + cham.getccodeServ() + "'";
        requinser += ", '" + String.valueOf(cham.getcNumCham()) + "'";
        requinser += ", '" + String.valueOf(cham.getcNumSurv()) + "'";
        requinser += ", '" + String.valueOf(cham.getnbre_lits()) + "'";
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

    //suppression
    public boolean cha_suppression(Chambre cham) throws SQLException {
        String requsuppr = "DELETE FROM chambre WHERE code_service = '";
        requsuppr += cham.getccodeServ();
        requsuppr += "' AND no_chambre = ";
        requsuppr += cham.getcNumCham();

        Statement state = connec.prepareStatement(requsuppr);

        // Requete executer et vérifier
        int test = state.executeUpdate(requsuppr);
        if (test == 0) {
            System.out.println("La suppression a échoué");
            return false;
        } else {
            System.out.println("La suppression a réussi");
            return true;
        }
    }
    //mise a jour
    public boolean cha_update(Chambre cham) throws SQLException {

        String requmaj = "UPDATE chambre";
        requmaj += "'SET surveillant = '";
        requmaj += String.valueOf(cham.getcNumSurv());
        requmaj += "', nb_lits = '";
        requmaj += String.valueOf(cham.getnbre_lits());
        requmaj += "', WHERE code_service = '";
        requmaj += cham.getccodeServ();
        requmaj += "' AND no_chambre = ";
        requmaj += cham.getcNumCham();

        Statement state = connec.createStatement();

        int test = state.executeUpdate(requmaj);
        if (test == 0) {
            System.out.println("La mise à jour a échoué");
            return false;
        } else {
            System.out.println("La mise à jour a réussi");
            return true;
        }
    }

    //Docteur
    //ajout
    public Docteur doc_ajout(Docteur doc) throws SQLException {
        Statement state = connec.createStatement();
        String requinser = "INSERT INTO docteur VALUES (    ";
        requinser += "'" + String.valueOf(doc.geteNum()) + "'";
        requinser += ", '" + doc.getspecialite() + "'";
        requinser += ")";

        state.executeUpdate(requinser);

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

    //suppression
    public boolean doc_suppression(Docteur doc) throws SQLException {
        String requsuppr = "DELETE FROM docteur WHERE numero = ";
        requsuppr += doc.geteNum();

        Statement state = connec.prepareStatement(requsuppr);

        // Requete executer et vérifier
        int test = state.executeUpdate(requsuppr);
        if (test == 0) {
            System.out.println("La suppression a échoué");
            return false;
        } else {
            System.out.println("La suppression a réussi");
            return true;
        }
    }
    //mise a jour
    public boolean doc_update(Docteur doc) throws SQLException {

        String requmaj = "UPDATE docteur";
        requmaj += "'SET specialite = '";
        requmaj += doc.getspecialite();
        requmaj += "', WHERE numero = ";
        requmaj += doc.geteNum();

        Statement state = connec.createStatement();

        int test = state.executeUpdate(requmaj);
        if (test == 0) {
            System.out.println("La mise à jour a échoué");
            return false;
        } else {
            System.out.println("La mise à jour a réussi");
            return true;
        }
    }

    //Employé
    //ajout
    public Employé emp_ajout(Employé emp) throws SQLException {
        Statement state = connec.createStatement();
        String requinser = "INSERT INTO employe VALUES (    ";
        requinser += "'" + String.valueOf(emp.geteNum()) + "'";
        requinser += ", '" + emp.geteNom() + "'";
        requinser += ", '" + emp.getePrenom() + "'";
        requinser += ", '" + emp.geteTel() + "'";
        requinser += ", '" + emp.geteAdresse() + "'";
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

    //suppression
    public boolean emp_suppression(Employé emp) throws SQLException {
        String requsuppr = "DELETE FROM employe WHERE numero = ";
        requsuppr += emp.geteNum();

        Statement state = connec.prepareStatement(requsuppr);

        // Requete executer et vérifier
        int test = state.executeUpdate(requsuppr);
        if (test == 0) {
            System.out.println("La suppression a échoué");
            return false;
        } else {
            System.out.println("La suppression a réussi");
            return true;
        }
    }
    //mise a jour
    public boolean emp_update(Employé emp) throws SQLException {

        String requmaj = "UPDATE employe";
        requmaj += "'SET nom = '";
        requmaj += emp.geteNom();
        requmaj += "', prenom = '";
        requmaj += emp.getePrenom();
        requmaj += "', adresse = '";
        requmaj += emp.geteAdresse();
        requmaj += "', tel = '";
        requmaj += emp.geteTel();
        requmaj += "', WHERE numero = ";
        requmaj += emp.geteNum();

        Statement state = connec.createStatement();

        int test = state.executeUpdate(requmaj);
        if (test == 0) {
            System.out.println("La mise à jour a échoué");
            return false;
        } else {
            System.out.println("La mise à jour a réussi");
            return true;
        }
    }

    //Hospitalisation
    //ajout
    public Hospitalisation hos_ajout(Hospitalisation hos) throws SQLException {
        Statement state = connec.createStatement();
        String requinser = "INSERT INTO hospitalisation VALUES (    ";
        requinser += "'" + String.valueOf(hos.gethNumMalade().getmNumMalade()) + "'";
        requinser += ", '" + hos.gethNumService().getscodeServ() + "'";
        requinser += ", '" + String.valueOf(hos.gethNumCham().getcNumCham()) + "'";
        requinser += ", '" + String.valueOf(hos.gethNumlit()) + "'";
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

    //suppresion
    public boolean hos_suppression(Hospitalisation hos) throws SQLException {
        //On supprime une hospitalisation quand le patient s'en va (d'une manière ou d'une autre)
        String requsuppr = "DELETE FROM hospitalisation WHERE no_malade = ";
        requsuppr += hos.gethNumMalade().getmNumMalade();
        Statement state = connec.prepareStatement(requsuppr);

        // Requete executer et vérifier
        int test = state.executeUpdate(requsuppr);
        if (test == 0) {
            System.out.println("La suppression a échoué");
            return false;
        } else {
            System.out.println("La suppression a réussi");
            return true;
        }
    }
    //mise a jour
    public boolean hos_update(Hospitalisation hos) throws SQLException {

        String requmaj = "UPDATE hospitalisation";
        requmaj += " SET code_service = '";
        requmaj += hos.gethNumService().getscodeServ();
        requmaj += "', no_chambre = '";
        requmaj += hos.gethNumCham().getcNumCham();
        requmaj += "', lit = '";
        requmaj += hos.gethNumlit();
        requmaj += "', WHERE no_malade = ";
        requmaj += hos.gethNumMalade().getmNumMalade();

        Statement state = connec.createStatement();

        int test = state.executeUpdate(requmaj);
        if (test == 0) {
            System.out.println("La mise à jour a échoué");
            return false;
        } else {
            System.out.println("La mise à jour a réussi");
            return true;
        }
    }
    

    //Infirmier
    //ajout
    public Infirmier inf_ajout(Infirmier inf) throws SQLException {
        Statement state = connec.createStatement();
        String requinser = "INSERT INTO infirmier VALUES (    ";
        requinser += "'" + String.valueOf(inf.geteNum()) + "'";
        requinser += ", '" + inf.geticode_service() + "'";
        requinser += ", '" + inf.getRotation() + "'";
        requinser += ", '" + String.valueOf(inf.getSalaire()) + "'";
        requinser += ")";

        state.executeUpdate(requinser);


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

    //suppression
    public boolean inf_suppression(Infirmier inf) throws SQLException {
        String requsuppr = "DELETE FROM infirmier WHERE numero = ";
        requsuppr += inf.geteNum();

        Statement state = connec.prepareStatement(requsuppr);

        // Requete executer et vérifier
        int test = state.executeUpdate(requsuppr);
        if (test == 0) {
            System.out.println("La suppression a échoué");
            return false;
        } else {
            System.out.println("La suppression a réussi");
            return true;
        }
    }
    //mise a jour
 public boolean inf_update(Infirmier inf) throws SQLException {

        String requmaj = "UPDATE infirmier";
        requmaj += "'SET code_service = '";
        requmaj += inf.geticode_service();
        requmaj += "', rotation = '";
        requmaj += inf.getRotation();
        requmaj += "', salaire = '";
        requmaj += String.valueOf(inf.getSalaire());
        requmaj += "', WHERE numero = ";
        requmaj += inf.geteNum();

        Statement state = connec.createStatement();

        int test = state.executeUpdate(requmaj);
        if (test == 0) {
            System.out.println("La mise à jour a échoué");
            return false;
        } else {
            System.out.println("La mise à jour a réussi !");
            return true;
        }
    }

    //Malade
    //ajout
    public Malade mal_ajout(Malade mal) throws SQLException {
        Statement state = connec.createStatement();
        String requinser = "INSERT INTO malade VALUES (    ";
        requinser += "'" + String.valueOf(mal.getmNumMalade()) + "'";
        requinser += ", '" + mal.getmNom() + "'";
        requinser += ", '" + mal.getmPrenom() + "'";
        requinser += ", '" + mal.getmTel() + "'";
        requinser += ", '" + mal.getmNomMutuel() + "'";
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

    //suppression
    public boolean mal_suppression(Malade mal) throws SQLException {
        String requsuppr = "DELETE FROM malade WHERE numero = ";
        requsuppr += mal.getmNumMalade();

        Statement state = connec.prepareStatement(requsuppr);

        // Requete executer et vérifier
        int test = state.executeUpdate(requsuppr);
        if (test == 0) {
            System.out.println("La suppression a échoué");
            return false;
        } else {
            System.out.println("La suppression a réussi");
            return true;
        }
    }
    //mise a jour
    public boolean mal_update(Malade mal) throws SQLException {

        String requmaj = "UPDATE service";
        requmaj += " SET nom = '";
        requmaj += mal.getmNom();
        requmaj += "', prenom = '";
        requmaj += mal.getmPrenom();
        requmaj += "', adresse = '";
        requmaj += mal.getmAdresse();
        requmaj += "', tel = '";
        requmaj += mal.getmTel();
        requmaj += "', mutuelle = '";
        requmaj += mal.getmNomMutuel();
        requmaj += "', WHERE numero = ";
        requmaj += mal.getmNumMalade();

        Statement state = connec.createStatement();

        int test = state.executeUpdate(requmaj);
        if (test == 0) {
            System.out.println("La mise à jour a échoué");
            return false;
        } else {
            System.out.println("La mise à jour a réussi");
            return true;
        }
    }
   

    //Service
    //ajout
    public Service ser_ajout(Service serv) throws SQLException {
        Statement state = connec.createStatement();
        String requinser = "INSERT INTO service VALUES (    ";
        requinser += "'" + serv.getscodeServ() + "'";
        requinser += ", '" + serv.getsNom() + "'";
        requinser += ", '" + serv.getslettreBat() + "'";
        requinser += ", '" + String.valueOf(serv.getsdirecnum()) + "'";
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

    //suppression
    public boolean ser_suppression(Service serv) throws SQLException {
        String requsuppr = "DELETE FROM service WHERE code = '";
        requsuppr += serv.getscodeServ();
        requsuppr += "'";
        
        Statement state = connec.prepareStatement(requsuppr);

        // Requete executer et vérifier
        int test = state.executeUpdate(requsuppr);
        if (test == 0) {
            System.out.println("La suppression a échoué");
            return false;
        } else {
            System.out.println("La suppression a réussi !");
            return true;
        }
    }
    //mise a jour
    public boolean ser_update(Service ser) throws SQLException {

        String requmaj = "UPDATE service";
        requmaj += " SET nom = '";
        requmaj += ser.getsNom();
        requmaj += "', batiment = '";
        requmaj += ser.getslettreBat();
        requmaj += "', directeur = '";
        requmaj += String.valueOf(ser.getsdirecnum());
        requmaj += "', WHERE code = '";
        requmaj += ser.getscodeServ();
        requmaj += "'";

        Statement state = connec.createStatement();

        int test = state.executeUpdate(requmaj);
        if (test == 0) {
            System.out.println("La mise à jour a échoué");
            return false;
        } else {
            System.out.println("La mise à jour a réussi !");
            return true;
        }
    }

    //Soigne
    //ajout
    public Soigne soi_ajout(Soigne soi) throws SQLException {
        Statement state = connec.createStatement();
        String requinser = "INSERT INTO soigne VALUES (    ";
        requinser += "'" + String.valueOf(soi.getso_eNum().geteNum()) + "'";
        requinser += ", '" + String.valueOf(soi.getsoNumMalade().getmNumMalade()) + "'";
        requinser += "')";

        state.executeUpdate(requinser);

        //ajout de la classe
        Soigne soigne = new Soigne();
        soigne.setsoNumMalade(soi.getsoNumMalade());
        soigne.setso_eNum(soi.getso_eNum());

        System.out.println("insertion terminée");
        return soigne;
    }

    //suppression
    public boolean soi_suppression(Soigne soi) throws SQLException {
        String requsuppr = "DELETE FROM soigne WHERE no_malade = ";
        requsuppr += soi.getsoNumMalade().getmNumMalade();
        requsuppr += " AND no_docteur = ";
        requsuppr += soi.getso_eNum().geteNum();

        Statement state = connec.prepareStatement(requsuppr);

        // Requete executer et vérifier
        int test = state.executeUpdate(requsuppr);
        if (test == 0) {
            System.out.println("La suppression a échoué");
            return false;
        } else {
            System.out.println("La suppression a réussi !");
            return true;
        }
    }
    //mise a jour
    public boolean soi_update(Soigne soi) throws SQLException {

        String requmaj = "UPDATE soigne";
        requmaj += " SET no_docteur = '";
        requmaj += String.valueOf(soi.getso_eNum().geteNum());
        requmaj += "', WHERE no_malade = ";
        requmaj += soi.getsoNumMalade().getmNumMalade();

        Statement state = connec.createStatement();

        int test = state.executeUpdate(requmaj);
        if (test == 0) {
            System.out.println("La mise à jour a échoué");
            return false;
        } else {
            System.out.println("La mise à jour a réussi");
            return true;
        }
    }
}
