package com.corradowaver.classic.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "users")
data class Users(
  @Id
  val username: String,
  val password: String
)
