package org.ldv.gymthmicproject.model.entity

import jakarta.persistence.*

@Entity
class SousCategorie(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire auto générée
    @Column(nullable = false)
    var id : Int? = null,
    var nom : String,

     //Association avec Produit
    @OneToMany (mappedBy="souscategorie", cascade = [CascadeType.ALL], orphanRemoval = true)
    var produits: MutableList<Produit> = mutableListOf(),

    // Association maitre w/Categorie
    @ManyToOne
    @JoinColumn(name = "fk_categorie_id")
    var categorie : Categorie? = null,
) {
}