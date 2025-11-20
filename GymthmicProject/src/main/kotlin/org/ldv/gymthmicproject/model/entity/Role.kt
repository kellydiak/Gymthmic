package org.ldv.gymthmicproject.model.entity

import jakarta.persistence.*

@Entity
class Role (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire auto générée
    @Column(nullable = false)
    var id : Int? = null,
    var nom : String,
    // Association avec utilisateur
    @OneToMany (mappedBy="role", cascade = [CascadeType.ALL], orphanRemoval = true)
    var utilisateurs: MutableList<Utilisateur> = mutableListOf()
) {

}