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
public class Service {
    protected String scodeServ;
    protected String sNom;
    protected String slettreBat;
    protected int sdirecnum;
    
    public String getslettreBat() {
        return slettreBat;
    }
    
    public void setslettreBat(String slettreBat) {
        this.slettreBat = slettreBat;
    }
    
    public String getscodeServ() {
        return scodeServ;
    }
    
    public void setscodeServ(String scodeServ) {
        this.scodeServ = scodeServ;
    }
    
    public String getsNom() {
        return sNom;
    }
    
    public void setsNom(String sNom) {
        this.sNom = sNom;
    }
    
    public int getsdirecnum() {
        return sdirecnum;
    }
    
    public void setsdirecnum(int sdirecnum) {
        this.sdirecnum = sdirecnum;
    }

    
}
