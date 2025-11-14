package org.ldv.gymthmicproject.model.entity

import jakarta.persistence.*


class Role (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire auto générée
    @Column(nullable = false)
    var id : Int,
    var nom : String
) {

}