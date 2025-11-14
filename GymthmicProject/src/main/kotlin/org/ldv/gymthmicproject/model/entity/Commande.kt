package org.ldv.gymthmicproject.model.entity

import java.time.LocalDate

class Commande (
    var id : Int,
    var statut : String,
    var dateCreation : LocalDate,
    var dateModification : LocalDate
){

}