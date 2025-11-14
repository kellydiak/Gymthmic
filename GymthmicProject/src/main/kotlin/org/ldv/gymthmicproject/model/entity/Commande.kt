package org.ldv.gymthmicproject.model.entity

import java.time.LocalDate
import jakarta.persistence.*

class Commande (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire auto générée
    @Column(nullable = false)
    var id : Int,
    var statut : String,
    var dateCreation : LocalDate,
    var dateModification : LocalDate
){

}