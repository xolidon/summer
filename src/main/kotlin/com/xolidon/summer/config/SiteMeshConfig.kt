package com.xolidon.summer.config

import org.sitemesh.builder.SiteMeshFilterBuilder
import org.sitemesh.config.ConfigurableSiteMeshFilter

class SiteMeshConfig : ConfigurableSiteMeshFilter() {
    override fun applyCustomConfiguration(builder: SiteMeshFilterBuilder) {
        builder
            .addDecoratorPath("/*", "/WEB-INF/views/decorator/front.jsp")
            .addExcludedPath(".json")
            .setMimeTypes("text/html")
    }
}