package org.ldv.gymthmicproject.model.entity

import jakarta.persistence.*

@Entity
class LigneCommande (
    @EmbeddedId
    var ligneCommandeId: LigneCommandeId? = null,
    var quantite : Int,

    @MapsId("varianteId")
    @ManyToOne
    @JoinColumn(name= "fk_variante_id")
    var variante : Variante? = null,

    @MapsId("commandeId")
    @ManyToOne
    @JoinColumn(name="fk_commande_id")
    var commande : Commande? = null
) {
}