package com.example.demo.response

class JsendResponse(
    val status: String,
    val message: String?,
    val data: Any? = null,
    val code: Int? = null
) {
    companion object {
        fun success(data: Any?, message: String? = null): JsendResponse {
            return JsendResponse(status = "success", message = message, data = data)
        }

        fun fail(data: Any?, message: String? = null): JsendResponse {
            return JsendResponse(status = "fail", message = message, data = data)
        }

        fun error(message: String, code: Int? = null): JsendResponse {
            return JsendResponse(status = "error", message = message, data = null, code = code)
        }
    }
}
