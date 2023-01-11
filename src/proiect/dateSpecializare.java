/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiect;

/**
 *
 * @author Delian
 */
public class dateSpecializare {
    private String numeSpecializare;
    private Integer numarLocuriBuget;
    private Integer numarLocuriTaxa;
    
    public dateSpecializare(String numeSpecializare, Integer numarLocuriBuget, Integer numarLocuriTaxa){
        this.numeSpecializare = numeSpecializare;
        this.numarLocuriBuget = numarLocuriBuget;
        this.numarLocuriTaxa = numarLocuriTaxa;
    }
    
    public String getNumeSpecializare(){
        return numeSpecializare;
    }
    
    public Integer getNumarLocuriBuget(){
        return numarLocuriBuget;
    }
    
    public Integer getNumarLocuriTaxa(){
        return numarLocuriTaxa;
    }
    
    public void setNumeSpecializare(String numeSpecializare){
        this.numeSpecializare = numeSpecializare;
    }
    
    public void setNumarLocuriBuget(Integer numarLocuriBuget){
        this.numarLocuriBuget = numarLocuriBuget;
    }
    
    public void setNumarLocuriTaxa(Integer numarLocuriTaxa){
        this.numarLocuriTaxa = numarLocuriTaxa;
    }
}
