package org.ldv.gymthmicproject.model.dao

import org.ldv.gymthmicproject.model.entity.Taille
import org.springframework.data.jpa.repository.JpaRepository

interface TailleDAO : JpaRepository<Taille, Int> {
}