/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiect;

import java.sql.Date;

/**
 *
 * @author Delian
 */
public class dateStudenti {
    private String nume;
    private String prenume;
    private Date dataNasterii;
    private String cnp;
    private String sex;
    private String loc_bugetat;
    private String grupa;
    private String subgrupa;
    
    public dateStudenti(String nume, String prenume, Date dataNasterii, String cnp, String sex, String loc_bugetat, String grupa, String subgrupa){
        this.nume = nume;
        this.prenume = prenume;
        this.dataNasterii = dataNasterii;
        this.cnp = cnp;
        this.sex = sex;
        this.loc_bugetat = loc_bugetat;
        this.grupa = grupa;
        this.subgrupa = subgrupa;
    }
    
    public String getNume(){
        return nume;
    }
    
    public String getPrenume(){
        return prenume;
    }
    
    public Date getDataNasterii(){
        return dataNasterii;
    }
    
    public String getCnp(){
        return cnp;
    }
    
    public String getSex(){
        return sex;
    }
    
    public String getLocBugetat(){
        return loc_bugetat;
    }
    
    public String getGrupa(){
        return grupa;
    }
    
    public String getSubgrupa(){
        return subgrupa;
    }
    
    public void setNume(String nume){
        this.nume = nume;
    }
    
    public void setPrenume(String prenume){
        this.prenume = prenume;
    }
    
    public void setDataNasterii(Date dataNasterii){
        this.dataNasterii = dataNasterii;
    }
    
    
    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public void setLocBugetat(String loc_bugetat) {
        this.loc_bugetat = loc_bugetat;
    }
    
    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }
    
    public void setSubgrupa(String subgrupa) {
        this.subgrupa = subgrupa;
    }
}