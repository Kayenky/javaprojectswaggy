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
public class Hospitalisation {
    protected int hNumlit;
    protected Service hNumService;
    protected Chambre hNumCham;
    protected Malade hNumMalade;
    
    public int gethNumlit() {
        return hNumlit;
    }
    
    public void sethNumlit(int hNumlit) {
        this.hNumlit = hNumlit;
    }
    
    public Service gethNumService() {
        return hNumService;
    }
    
    public void sethNumService(Service hNumService) {
        this.hNumService = hNumService;
    }
    
    public Chambre gethNumCham() {
        return hNumCham;
    }
    
    public void sethNumCham(Chambre hNumCham) {
        this.hNumCham = hNumCham;
    }
    
    public Malade gethNumMalade() {
        return hNumMalade;
    }
    
    public void sethNumMalade(Malade hNumMalade) {
        this.hNumMalade = hNumMalade;
    }
}
