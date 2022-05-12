package com.corradowaver.classic.controller

import com.corradowaver.classic.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
  val userService: UserService
) {

  @GetMapping("/user/username/{username}")
  fun getUserByUsername(@PathVariable username: String, @RequestParam delay: Long) =
    userService.getUserByUsername(username, delay)

  @GetMapping("/user/password/{password}")
  fun getUserByPassword(@PathVariable password: String, @RequestParam delay: Long) =
    userService.getUserByPassword(password, delay)

  @GetMapping("/user/all")
  fun getAllUsers() =
    userService.getAllUsers()

}
