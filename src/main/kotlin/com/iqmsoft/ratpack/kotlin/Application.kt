package com.iqmsoft.ratpack.kotlin

import ratpack.kotlin.handling.ratpack

fun main(args: Array<String>) {
    ratpack {
        serverConfig {
            development(true)
            port(9000)
        }
        bindings {
            bindInstance("RatPackInstance")
        }
        handlers {
            get("test") {
                render("Hello RatPack Kotlin :  " + context.get(String::class.java))
            }
        }
    }
}
