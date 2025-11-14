package org.ldv.gymthmicproject.model.dao

import org.ldv.gymthmicproject.model.entity.Utilisateur
import org.springframework.data.jpa.repository.JpaRepository

interface UtilisateurDAO : JpaRepository<Utilisateur, Int> {

}