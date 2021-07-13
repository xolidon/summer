package com.xolidon.summer.post.service

import com.xolidon.summer.core.helper.Page
import com.xolidon.summer.post.entity.Post
import com.xolidon.summer.post.mapper.PostMapper
import org.springframework.stereotype.Service

@Service
class PostServiceImpl(
    var postMapper: PostMapper) : PostService {


    override fun getPosts(): Page<Post> {
        val page = Page<Post>()

        page.list = postMapper.getPostList()
        page.totalCount = postMapper.countPost()

        return page
    }

    override fun addPost(post: Post) {
        postMapper.addPost(post)
    }
}