package org.ldv.gymthmicproject.model.entity

import java.time.LocalDate

class Utilisateur (
    var id : Int,
    var nom : String,
    var email : String,
    var mdp : String,
    val dateCreation : LocalDate
){

}