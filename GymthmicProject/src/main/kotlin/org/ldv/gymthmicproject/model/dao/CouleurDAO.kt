package org.ldv.gymthmicproject.model.dao

import org.ldv.gymthmicproject.model.entity.Couleur
import org.springframework.data.jpa.repository.JpaRepository

interface CouleurDAO : JpaRepository<Couleur, Int> {
}