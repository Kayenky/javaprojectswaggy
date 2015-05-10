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
public class Employé {
    protected int eNum;
    protected String eNom;
    protected String ePrenom;
    protected String eTel;
    protected String eAdresse;
    
    
    public int geteNum() {
        return eNum;
    }
    
    public void seteNum(int eNum) {
        this.eNum = eNum;
    }
    
    public String geteNom() {
        return eNom;
    }
    
    public void seteNom(String eNom) {
        this.eNom = eNom;
    }
    
    public String getePrenom() {
        return ePrenom;
    }
    
    public void setePrenom(String ePrenom) {
        this.ePrenom = ePrenom;
    }
    
    public String geteTel() {
        return eTel;
    }
    
    public void seteTel(String eTel) {
        this.eTel = eTel;
    }
    
    public String geteAdresse() {
        return eAdresse;
    }
    
    public void seteAdresse(String eAdresse) {
        this.eAdresse = eAdresse;
    }
}
