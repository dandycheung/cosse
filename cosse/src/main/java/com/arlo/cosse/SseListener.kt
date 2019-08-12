package com.arlo.cosse

import org.json.JSONObject

interface SseListener {

    fun onOpen(response: HttpResponse)
    fun onMessage(line: String)
    fun onTimeout()
    fun onError(status: Int)
    fun onClose()
}