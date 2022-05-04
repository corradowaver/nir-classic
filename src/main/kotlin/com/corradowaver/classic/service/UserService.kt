package com.corradowaver.classic.service

import com.corradowaver.classic.dto.User
import com.corradowaver.classic.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.Random
import java.util.concurrent.TimeUnit

@Service
class UserService(
  val userRepository: UserRepository
) {

  fun getUserByUsername(username: String): User {
    TimeUnit.SECONDS.sleep(Random().nextInt(3).toLong())
    return userRepository.getUserByUsername(username)
  }

}
