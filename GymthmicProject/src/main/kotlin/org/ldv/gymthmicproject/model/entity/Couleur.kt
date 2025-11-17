package org.ldv.gymthmicproject.model.entity

import jakarta.persistence.*

@Entity
class Couleur (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire auto générée
    @Column(nullable = false)
    var id : Long? = null,
    var nom : String,
    var codeCouleur : String,

    // Association avec Variante
    @OneToMany(mappedBy = "couleur", cascade = [CascadeType.ALL], orphanRemoval = true)
    var variantes: MutableList<Variante> = mutableListOf(),
) {
}