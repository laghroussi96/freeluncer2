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
import javax.persistence.OneToOne;

/**
 *
 * @author fatima
 */
@Entity
public class Mission implements Serializable {

   
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;
   private String commentaire;
    @ManyToOne
    private User user;
    @ManyToOne
    private Type type;
    @ManyToOne
    private Langue langue;
    @ManyToOne
    private Diplome diplome;
    @ManyToOne
    private Budget budget;
    @OneToMany(mappedBy = "mission")
    private List<Review> reviews;
     @OneToMany(mappedBy = "mission")
    private List<Technologiemission> technologiemissions;
      

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }
    public List<Technologiemission> getTechnologiemissions() {
        return technologiemissions;
    }

    public void setTechnologiemissions(List<Technologiemission> technologiemissions) {
        this.technologiemissions = technologiemissions;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

//    public double getBudget() {
//        return budget;
//    }
//
//    public void setBudget(double budget) {
//        this.budget = budget;
//    }
//
//    public String getDevise() {
//        return devise;
//    }
//
//    public void setDevise(String devise) {
//        this.devise = devise;
//    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Langue getLangue() {
        return langue;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    public Diplome getDiplome() {
        return diplome;
    }

    public void setDiplome(Diplome diplome) {
        this.diplome = diplome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mission)) {
            return false;
        }
        Mission other = (Mission) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Mission[ id=" + id + " ]";
    }
    
}
