package org.ldv.gymthmicproject.model.entity

import java.time.LocalDate
import jakarta.persistence.*

@Entity
class Commentaire (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire auto générée
    @Column(nullable = false)
    var id : Int? = null,
    var zone : String,
    var datePublication : LocalDate,
    var dateModification : LocalDate,

    @ManyToOne
    @JoinColumn(name = "fk_utilisateur_id")
    var utilisateur: Utilisateur? = null,

    // Association avec produit
    @OneToOne(mappedBy = "commentaire",cascade = [CascadeType.ALL], orphanRemoval = true)
    var produits : Produit? = null

) {
}