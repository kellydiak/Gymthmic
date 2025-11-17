package org.ldv.gymthmicproject.model.entity

import jakarta.persistence.*
import org.ldv.gymthmicproject.model.dao.ProduitDAO

@Entity
class Produit (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire auto générée
    @Column(nullable = false)
    var id : Int? = null,
    var nom : String,
    var description : String,
    val prix : Double,

    // Association avec variante
    @OneToMany(mappedBy = "produit",cascade = [CascadeType.ALL], orphanRemoval = true) //nom classe actuelle
    var variantes: MutableList<Variante> = mutableListOf(), //classe avec laquelle on relie

    // Association maitre w/Sous-catégorie
    @ManyToOne
    @JoinColumn(name = "fk_sous_categorie_id")
    var souscategorie : SousCategorie? = null,

    // Association maitre w/Commentaire
    @OneToOne
    @JoinColumn(name = "fk_commentaire_id")
    var commentaire : Commentaire? = null

    ) {
}