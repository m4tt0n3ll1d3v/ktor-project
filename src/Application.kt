package me.caelis

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.client.*
import io.ktor.client.engine.apache.*
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.routing

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    routing {

        get("/") {
            call.respondText("Ciao Ktor!")
        }

        get("/test") {
            call.respondText("Questo è un test per render")
        }

        get("/myapi") {
            call.respondText (" La mia api funziona ")
        }

    }
}

