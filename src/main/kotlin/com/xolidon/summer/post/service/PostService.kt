package com.xolidon.summer.post.service

import com.xolidon.summer.core.helper.Page
import com.xolidon.summer.post.entity.Post

interface PostService {
    fun getPosts(): Page<Post>
    fun addPost(post: Post)
}