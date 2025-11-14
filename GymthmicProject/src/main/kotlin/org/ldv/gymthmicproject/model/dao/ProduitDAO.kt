package org.ldv.gymthmicproject.model.dao

import org.ldv.gymthmicproject.model.entity.Produit
import org.springframework.data.jpa.repository.JpaRepository

interface ProduitDAO : JpaRepository<Produit, Int> {
}