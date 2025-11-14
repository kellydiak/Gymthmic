package org.ldv.gymthmicproject.model.entity

import java.time.LocalDate

class Commentaire (
    var id : Int,
    var zone : String,
    var datePublication : LocalDate,
    var dateModification : LocalDate
) {
}