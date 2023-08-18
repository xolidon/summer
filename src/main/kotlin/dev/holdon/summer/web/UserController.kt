package dev.holdon.summer.web

import dev.holdon.summer.user.entity.User
import dev.holdon.summer.user.service.UserService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("user")
@RestController
class UserController(private val userService: UserService) {

    @GetMapping
    fun list() : List<User> = userService.getUserList()

    @PostMapping
    fun save(@RequestBody user : User) : User = userService.saveUser(user)

    @DeleteMapping("{id}")
    fun delete(@PathVariable id : Long) {
        userService.deleteUser(id)
    }
}