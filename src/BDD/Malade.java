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
public class Malade {
    protected int mNumMalade;
    protected String mNom;
    protected String mPrenom;
    protected String mTel;
    protected int mNumCham;
    protected String mNomMutuel;
    
    public int getmNumMalade() {
        return mNumMalade;
    }
    
    public void setmNumMalade(int mNumMalade) {
        this.mNumMalade = mNumMalade;
    }
    
    public int getmNumCham() {
        return mNumCham;
    }
    
    public void setmNumCham(int mNumCham) {
        this.mNumCham = mNumCham;
    }
    
    public String getmNom() {
        return mNom;
    }
    
    public void setmNom(String mNom) {
        this.mNom = mNom;
    }
    
    public String getmPrenom() {
        return mPrenom;
    }
    
    public void setmPrenom(String mPrenom) {
        this.mPrenom = mPrenom;
    }
    
    public String getmTel() {
        return mTel;
    }
    
    public void setmTel(String mTel) {
        this.mTel = mTel;
    }
    
    public String getmNomMutuel() {
        return mNomMutuel;
    }
    
    public void setmNomMutuel(String mNomMutuel) {
        this.mNomMutuel = mNomMutuel;
    }
    
}
