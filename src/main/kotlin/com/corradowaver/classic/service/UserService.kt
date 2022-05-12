package com.corradowaver.classic.service

import com.corradowaver.classic.dto.Users
import com.corradowaver.classic.dto.UsersResponse
import com.corradowaver.classic.repository.UserRepository
import org.springframework.stereotype.Service
import java.lang.Thread.sleep

@Service
class UserService(
  val userRepository: UserRepository
) {

  fun getUserByUsername(username: String, delay: Long) =
    userByUsernameFromRepo(username, delay)
      .let { UsersResponse(it.username, generatePassword()) }


  fun getUserByPassword(password: String, delay: Long) =
    userByPasswordFromRepo(password, delay)
      .let { UsersResponse(it.username, generatePassword()) }


  fun getAllUsers(): List<UsersResponse> =
    userRepository.findAll()
      .map { UsersResponse(it.username, generatePassword()) }

  private fun userByUsernameFromRepo(username: String, delay: Long): Users {
    sleep(delay)
    return userRepository.findByUsername(username)
  }

  // Not indexed by password
  private fun userByPasswordFromRepo(password: String, delay: Long): Users {
    sleep(delay)
    return userRepository.findByPassword(password)
  }

  private fun generatePassword(): String = "fake"

}
