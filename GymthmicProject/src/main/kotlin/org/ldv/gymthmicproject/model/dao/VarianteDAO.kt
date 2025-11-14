package org.ldv.gymthmicproject.model.dao

import org.ldv.gymthmicproject.model.entity.Variante
import org.springframework.data.jpa.repository.JpaRepository

interface VarianteDAO : JpaRepository<Variante, Int> {
}