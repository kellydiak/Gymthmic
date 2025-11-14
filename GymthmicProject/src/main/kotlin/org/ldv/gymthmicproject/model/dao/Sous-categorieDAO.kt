package org.ldv.gymthmicproject.model.dao

import org.ldv.gymthmicproject.model.entity.`Sous-categorie`
import org.springframework.data.jpa.repository.JpaRepository

interface `Sous-categorieDAO` : JpaRepository<`Sous-categorie`, Int> {
}