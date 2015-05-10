/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;

/**
 *
 * @author paulferrand
 */
public class Docteur extends Employé {
    protected String specialite;
    protected boolean Directeur;
    
    public String getspecialite() {
        return specialite;
    }
    
    public void setspecialite(String specialite) {
        this.specialite = specialite;
    }
    
    public boolean getsDirecteur() {
        return Directeur;
    }
    
    public void setDirecteur(boolean Directeur) {
        this.Directeur = Directeur;
    }
}
