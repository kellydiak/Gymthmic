package org.ldv.gymthmicproject.model.entity

import jakarta.persistence.*

@Entity
class Variante (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire auto générée
    @Column(nullable = false)
    var id : Int,
    var estDisponible : Boolean,
    val lienImage : String,

    // Association maitre w/utilisateur
    @ManyToOne
    @JoinColumn(name = "fk_utilisateur_id")
    var utilisateur: Utilisateur? = null,

    // Association maitre w/Produit
    @ManyToOne
    @JoinColumn(name = "fk_produit_id")
    var produit : Produit? = null,

    // Association maitre w/Couleur
    @ManyToOne
    @JoinColumn(name = "fk_couleur_id")
    var couleur: Couleur? = null,

    // Association maitre w/Taille
    @ManyToOne
    @JoinColumn(name = "fk_taille_id")
    var taille: Taille? = null,

    // Association avec Commande
    @ManyToMany
    @JoinTable(
        name = "variante_commande",
        joinColumns = [JoinColumn(name = "fk_variante_id")],
        inverseJoinColumns = [JoinColumn(name = "fk_commande_id")]
    )
    var commandes: MutableList<Commande> = mutableListOf()

) {
}