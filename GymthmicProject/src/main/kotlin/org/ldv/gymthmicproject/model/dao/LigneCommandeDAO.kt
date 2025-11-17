package org.ldv.gymthmicproject.model.dao

import org.ldv.gymthmicproject.model.entity.LigneCommande
import org.ldv.gymthmicproject.model.entity.LigneCommandeId
import org.springframework.data.jpa.repository.JpaRepository

interface LigneCommandeDAO : JpaRepository<LigneCommande, LigneCommandeId> {

}