package com.plcoding.spotifycloneyt.other

data class Resource<out T>(val status: Status, val data: T?, val message: String?) {

    companion object {
        fun <T> loading(data: T?) = Resource(Status.LOADING, data, null)

        fun <T> success(data: T?) = Resource(Status.SUCCESS, data, null)

        fun <T> error(message: String, data: T?) = Resource(Status.ERROR, data, message)
    }
}

enum class Status {
    SUCCESS,
    ERROR,
    LOADING
}