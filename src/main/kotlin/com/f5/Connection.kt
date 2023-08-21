package com.f5

import io.ktor.websocket.*
import java.util.concurrent.atomic.AtomicInteger

class Connection(val session: DefaultWebSocketSession) {
    companion object{
        val lastId = AtomicInteger()
    }
    val name = "user${lastId.getAndIncrement()}"
}