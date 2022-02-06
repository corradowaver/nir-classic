package com.corradowaver.classic.service

import com.corradowaver.classic.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
  val userRepository: UserRepository
) {

  fun getUserByUsername(username: String) =
    userRepository.getUserByUsername(username)

}
