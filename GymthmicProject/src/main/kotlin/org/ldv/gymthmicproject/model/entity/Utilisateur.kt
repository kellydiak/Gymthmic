package org.ldv.gymthmicproject.model.entity

import java.time.LocalDate
import jakarta.persistence.*

@Entity
class Utilisateur (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire auto générée
    @Column(nullable = false)
    var id : Int,
    var nom : String,
    var email : String,
    var mdp : String,
    val dateCreation : LocalDate,

    @ManytoOne
    @JoinColumn(name = "role_id")
    var role: Role? = null

){

}