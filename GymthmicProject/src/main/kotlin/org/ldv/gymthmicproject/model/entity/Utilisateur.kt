package org.ldv.gymthmicproject.model.entity

import java.time.LocalDate
import jakarta.persistence.*
import java.time.LocalDateTime

/**
 * Entité représentant un utilisateur en base de données.
 * Elle est mappée sur une table SQL grâce à l’annotation @Entity.
 */
@Entity //représentation d'une table dans la BDD
class Utilisateur (
    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire auto générée
    @Column(nullable = false)
    var id : Int?,
    var nom : String,
    var email : String,
    /**
     * Mot de passe de l'utilisateur.
     * ⚠️ À stocker obligatoirement hashé (BCrypt) !
     */
    var mdp : String,
    /**
     * Date de création de l’enregistrement.
     * - initialisée automatiquement lors de la création
     * - non modifiable après insertion (updatable = false)
     */
    @Column(nullable = false, updatable = false)
    val dateCreation : LocalDateTime = LocalDateTime.now(),



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