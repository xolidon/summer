package com.xolidon.summer.post.entity

import java.util.*

data class Post(var postId: Int) {
    var title: String? = null
    var content: String? = null
    var regDate: Date? = null
}