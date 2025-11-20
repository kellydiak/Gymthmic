package org.ldv.gymthmicproject.model.dao

import org.ldv.gymthmicproject.model.entity.Utilisateur
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface UtilisateurDAO : JpaRepository<Utilisateur, Int> {
    @Query("select u from Utilisateur u where u.email = ?1")
    // ?1 1er parametre de la méthode, u alias = utilisateur
    fun findByEmail(email: String?): Utilisateur
}