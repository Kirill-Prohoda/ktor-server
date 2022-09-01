package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}
@Serializable
data class Project(val message: String, val language: String)

fun Application.configureRouting() {

    routing {
        get("/api") {
            val listParameters = call.parameters
            logger.debug{"do get $listParameters"}
//    call.parameter.toMap()
            val data = arrayOf(
                Project("hello world", "en"),
                Project("bonjour from Paris", "fr")
            )
            call.respondText(Json.encodeToString(data))
        }
        post("/api") {

            logger.debug{"do post"}
        }
    }
}
