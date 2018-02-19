/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author fatima
 */
@Entity
public class Developpeur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String email;
    private String nom;
    private String prenom;
    private double motPasse;
    private double tel;
      

    @ManyToOne
    private Diplome diplome;
    @ManyToOne
    private Pays pays;
    @OneToMany(mappedBy = "developpeur")
    private List<Technologieskill> technologieskills;
    @OneToMany(mappedBy = "developpeur")
    private List<Review> reviews;

    @OneToMany(mappedBy = "developpeur")
    private List<Langueskill> langueskills;

    public Diplome getDiplome() {
        return diplome;
    }

    public void setDiplome(Diplome diplome) {
        this.diplome = diplome;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    
    
    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<Technologieskill> getTechnologieskills() {
        return technologieskills;
    }

    public void setTechnologieskills(List<Technologieskill> technologieskills) {
        this.technologieskills = technologieskills;
    }

    public List<Langueskill> getLangueskills() {
        return langueskills;
    }

    public void setLangueskills(List<Langueskill> langueskills) {
        this.langueskills = langueskills;
    }

    public double getTel() {
        return tel;
    }

    public void setTel(double tel) {
        this.tel = tel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(double motPasse) {
        this.motPasse = motPasse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the email fields are not set
        if (!(object instanceof Developpeur)) {
            return false;
        }
        Developpeur other = (Developpeur) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Developpeur[ id=" + email + " ]";
    }

}
