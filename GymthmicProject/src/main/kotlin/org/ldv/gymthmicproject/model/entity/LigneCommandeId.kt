package org.ldv.gymthmicproject.model.entity

import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
class LigneCommandeId (
    var varianteId : Int,
    var commandeId : Int
) : Serializable{
}