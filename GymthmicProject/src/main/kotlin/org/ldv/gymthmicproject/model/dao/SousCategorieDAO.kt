package org.ldv.gymthmicproject.model.dao

import org.ldv.gymthmicproject.model.entity.SousCategorie
import org.springframework.data.jpa.repository.JpaRepository

interface SousCategorieDAO : JpaRepository<SousCategorie, Int> {
}