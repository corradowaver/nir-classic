package com.corradowaver.classic.repository

import com.corradowaver.classic.dto.Users
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<Users, Long> {
  fun findByUsername(username: String): Users
  fun findByPassword(password: String): Users
}
