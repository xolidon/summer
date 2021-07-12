package com.xolidon.summer.post.mapper

import com.xolidon.summer.post.entity.Post
import org.apache.ibatis.annotations.Mapper

@Mapper
interface PostMapper {
    fun getPostList(): List<Post>
    fun countPost(): Int
    fun addPost(post: Post)
}