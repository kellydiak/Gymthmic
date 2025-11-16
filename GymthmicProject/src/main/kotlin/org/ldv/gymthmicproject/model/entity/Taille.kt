package org.ldv.gymthmicproject.model.entity

import jakarta.persistence.*

@Entity
class Taille (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire auto générée
    @Column(nullable = false)
    var id : Int,
    var nom : String,

    // Association avec Variante
    @OneToMany (mappedBy="taille", cascade = [CascadeType.ALL], orphanRemoval = true)
    var variantes: MutableList<Variante> = mutableListOf()
) {
}