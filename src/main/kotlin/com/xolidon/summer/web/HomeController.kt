package com.xolidon.summer.web

import com.xolidon.summer.framework.helper.Page
import com.xolidon.summer.post.entity.Post
import com.xolidon.summer.post.service.PostService
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(var postService: PostService) {

    @GetMapping("")
    fun home(): Page<Post> {
        var page: Page<Post> = postService.getPosts()

        println(page.totalCount)

        return page
    }
}