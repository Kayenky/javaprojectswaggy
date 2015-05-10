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
public class Infirmier extends Employé{
    protected int icode_service;
    protected String Rotation;
    protected int Salaire;
    
    
    public int getSalaire() {
        return Salaire;
    }
    
    public void setSalaire(int Salaire) {
        this.Salaire = Salaire;
    }
    
    public String getRotation() {
        return Rotation;
    }
    
    public void setRotation(String Rotation) {
        this.Rotation = Rotation;
    }
    
    public int geticode_service() {
        return icode_service;
    }
    
    public void seticode_service(int icode_service) {
        this.icode_service = icode_service;
    }
    
        @Override
    public int geteNum() {
        return eNum;
    }
    
    @Override
    public void seteNum(int eNum) {
        this.eNum = eNum;
    }
    
    @Override
    public String geteNom() {
        return eNom;
    }
    
    @Override
    public void seteNom(String eNom) {
        this.eNom = eNom;
    }
    
    @Override
    public String getePrenom() {
        return ePrenom;
    }
    
    @Override
    public void setePrenom(String ePrenom) {
        this.ePrenom = ePrenom;
    }
    
    @Override
    public String geteTel() {
        return eTel;
    }
    
    @Override
    public void seteTel(String eTel) {
        this.eTel = eTel;
    }
    
    @Override
    public String geteAdresse() {
        return eAdresse;
    }
    
    @Override
    public void seteAdresse(String eAdresse) {
        this.eAdresse = eAdresse;
    }
}
