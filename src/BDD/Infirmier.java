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
    protected boolean surveillant;
    protected int Salaire;
    protected String Rotation;
    protected int icode_service;
    protected int iNumServ;
    
    
    public boolean getsurveillant() {
        return surveillant;
    }
    
    public void setsurveillant(boolean surveillant) {
        this.surveillant = surveillant;
    }
    
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
    
    public int getiNumServ() {
        return iNumServ;
    }
    
    public void setiNumServ(int iNumServ) {
        this.iNumServ = iNumServ;
    }
}
