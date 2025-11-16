package org.ldv.gymthmicproject.model.entity

import java.time.LocalDate
import jakarta.persistence.*

@Entity //représentation d'une table dans la BDD
class Utilisateur (
    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire auto générée
    @Column(nullable = false)
    var id : Int?,
    var nom : String,
    var email : String,
    var mdp : String,
    val dateCreation : LocalDate,

    // Association avec Role
    @ManyToOne
    @JoinColumn(name = "fk_role_id")
    var role: Role? = null,

    // Association avec Commentaire
    @OneToMany(mappedBy = "utilisateur",cascade = [CascadeType.ALL], orphanRemoval = true)
    var commentaires: MutableList<Commentaire> = mutableListOf(),

    // Association avec Commande
    @OneToMany(mappedBy = "utilisateur",cascade = [CascadeType.ALL], orphanRemoval = true)
    var commandes: MutableList<Commande> = mutableListOf(),

    // Association avec Variante
    @OneToMany(mappedBy = "utilisateur",cascade = [CascadeType.ALL], orphanRemoval = true)
    var variantes: MutableList<Variante> = mutableListOf(),


){

}