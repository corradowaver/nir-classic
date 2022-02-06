package com.corradowaver.classic.controller

import com.corradowaver.classic.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
  val userService: UserService
) {

  @GetMapping("/user/{username}")
  fun getUserByUsername(@PathVariable username: String) =
    userService.getUserByUsername(username)

}
