package org.ldv.gymthmicproject.model.dao

import org.ldv.gymthmicproject.model.entity.Categorie
import org.springframework.data.jpa.repository.JpaRepository

interface CategorieDAO : JpaRepository<Categorie, Int> {
    fun id(id: Int): MutableList<Categorie>
}