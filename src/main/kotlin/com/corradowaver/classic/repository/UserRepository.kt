package com.corradowaver.classic.repository

import com.corradowaver.classic.dto.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User, Long> {
  fun getUserByUsername(username: String): User
}
