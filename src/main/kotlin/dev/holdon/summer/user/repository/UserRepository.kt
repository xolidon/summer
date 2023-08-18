package dev.holdon.summer.user.repository

import dev.holdon.summer.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {

}