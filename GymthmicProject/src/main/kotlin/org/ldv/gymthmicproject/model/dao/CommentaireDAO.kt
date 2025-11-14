package org.ldv.gymthmicproject.model.dao


import org.ldv.gymthmicproject.model.entity.Commentaire
import org.springframework.data.jpa.repository.JpaRepository

interface CommentaireDAO : JpaRepository<Commentaire, Int> {
}