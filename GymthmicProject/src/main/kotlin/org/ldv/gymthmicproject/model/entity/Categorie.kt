package org.ldv.gymthmicproject.model.entity

import jakarta.persistence.*

@Entity
class Categorie (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire auto générée
    @Column(nullable = false)
    var id : Int,
    var nom : String,

    // Association avec SousCategorie
    @OneToMany (mappedBy="categorie", cascade = [CascadeType.ALL], orphanRemoval = true)
    var souscategories: MutableList<SousCategorie> = mutableListOf()
) {
}