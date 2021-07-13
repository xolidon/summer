package com.xolidon.summer.core.helper

class Page<T> {
    lateinit var list: List<T>
    var totalCount: Int = 0
}