package org.ldv.gymthmicproject.model.dao

import org.ldv.gymthmicproject.model.entity.Commande
import org.springframework.data.jpa.repository.JpaRepository

interface CommandeDAO : JpaRepository<Commande, Int> {
}