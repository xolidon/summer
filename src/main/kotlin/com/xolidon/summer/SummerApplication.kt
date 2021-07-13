package com.xolidon.summer

import com.xolidon.summer.config.SiteMeshConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.ViewResolver
import org.springframework.web.servlet.view.InternalResourceViewResolver

@SpringBootApplication
class SummerApplication {
    @Bean
    fun siteMeshFilter(): FilterRegistrationBean<SiteMeshConfig> {
        val filter: FilterRegistrationBean<SiteMeshConfig> = FilterRegistrationBean<SiteMeshConfig>()
        filter.filter = SiteMeshConfig()

        return filter
    }
}

fun main(args: Array<String>) {
    runApplication<SummerApplication>(*args)
}

