/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiect;

/**
 *
 * @author Delian
 */
public class dateProfesori {
    private String nume;
    private String prenume;

    public dateProfesori(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }
    public String getNume() {
        return nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
}
