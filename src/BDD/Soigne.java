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
public class Soigne {
    protected Malade soNumMalade;
    protected Docteur so_eNum;
    
    public Malade getsoNumMalade (){
        return soNumMalade;
    }
    
    public void setsoNumMalade(Malade soNumMalade)
    {
        this.soNumMalade = soNumMalade;
    }
    
    public Docteur getso_eNum (){
        return so_eNum;
    }
    
    public void setso_eNum(Docteur so_eNum)
    {
        this.so_eNum = so_eNum;
    }
    
}
