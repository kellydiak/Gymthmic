package org.ldv.gymthmicproject.model.entity

import jakarta.persistence.*

class Couleur (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire auto générée
    @Column(nullable = false)
    var id : Long,
    var nom : String,
    var codeCouleur : String
) {
}