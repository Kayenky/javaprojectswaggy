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
    
}
