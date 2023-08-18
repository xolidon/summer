package dev.holdon.summer.user.service

import dev.holdon.summer.user.entity.User
import dev.holdon.summer.user.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun getUserList(): List<User> = userRepository.findAll()

    fun saveUser(user : User) : User = userRepository.save(user)
    fun deleteUser(id: Long) {

    }
}