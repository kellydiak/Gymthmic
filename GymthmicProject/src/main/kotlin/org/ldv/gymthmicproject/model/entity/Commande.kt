package org.ldv.gymthmicproject.model.entity

import java.time.LocalDate
import jakarta.persistence.*

@Entity
class Commande (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire auto générée
    @Column(nullable = false)
    var id : Int? = null,
    var statut : String,
    var dateCreation : LocalDate,
    var dateModification : LocalDate,

    // Association avec utilisateur
    @ManyToOne
    @JoinColumn(name = "fk_utilisateur_id")
    var utilisateur: Utilisateur? = null,

    // Association avec Variante
    @ManyToMany(mappedBy = "commandes")
    var variantes: MutableList<Variante> = mutableListOf(),

    // Association maitre avec Variante en passant par ligne commande
    @OneToMany(mappedBy = "commande", orphanRemoval = true)
    var lignecommandes : MutableList<LigneCommande> = mutableListOf()

){

}