package org.ldv.gymthmicproject.model.dao

import org.ldv.gymthmicproject.model.entity.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleDAO : JpaRepository<Role, Int> {
}