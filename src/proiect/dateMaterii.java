/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiect;

/**
 *
 * @author Delian
 */
public class dateMaterii {
    private String nume;
    private Integer numarCredite;
    private Integer semestru;
    private String statut;
    
    public dateMaterii(String nume, Integer numarCredite, Integer semestru, String statut) {
        this.nume = nume;
        this.numarCredite = numarCredite;
        this.semestru = semestru;
        this.statut = statut;
    }
    
    public String getNume() {
        return nume;
    }
    
    public Integer getNumarCredite() {
        return numarCredite;
    }
    
    public Integer getSemestru() {
        return semestru;
    }
    
    public String getStatut() {
        return statut;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public void setNumarCredite(Integer numarCredite) {
        this.numarCredite = numarCredite;
    }
    
    public void setSemestru(Integer semestru) {
        this.semestru = semestru;
    }
    
    public void setStatut(String statut) {
        this.statut = statut;
    }
}
