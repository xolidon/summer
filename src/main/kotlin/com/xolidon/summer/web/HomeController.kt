package com.xolidon.summer.web

import com.xolidon.summer.core.helper.Page
import com.xolidon.summer.post.entity.Post
import com.xolidon.summer.post.service.PostService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class HomeController(var postService: PostService) {

    @GetMapping("")
    fun home(model: Model): String {
        var page: Page<Post> = postService.getPosts()

        model.addAttribute("page", page)

        return "front/post/list"
    }
}