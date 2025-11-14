package org.ldv.gymthmicproject.model.entity

import jakarta.persistence.*

class Variante (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire auto générée
    @Column(nullable = false)
    var id : Int,
    var estDisponible : Boolean,
    val lienImage : String
) {
}