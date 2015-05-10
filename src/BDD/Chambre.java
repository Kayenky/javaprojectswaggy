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
public class Chambre {
    protected String ccodeServ;
    protected int cNumCham;
    protected int cNumSurv;
    protected int nbre_lits;
    
    
    public String getccodeServ() {
        return ccodeServ;
    }
    
    public void setccodeServ(String ccodeServ) {
        this.ccodeServ = ccodeServ;
    }
    
    public int getcNumCham() {
        return cNumCham;
    }
    
    public void setcNumCham(int cNumCham) {
        this.cNumCham = cNumCham;
    }
    
    public int getnbre_lits() {
        return nbre_lits;
    }
    
    public void setnbre_lits(int nbre_lits) {
        this.nbre_lits = nbre_lits;
    }
    
    public int getcNumSurv() {
        return cNumSurv;
    }
    
    public void setcNumSurv(int cNumSurv) {
        this.cNumSurv = cNumSurv;
    }
    
    
}
