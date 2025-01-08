
package simplon2024.brief15bibliotheque.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @ManyToMany(mappedBy = "genres")
    @JsonIgnore
    private Set<Livre> livres;

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }


}