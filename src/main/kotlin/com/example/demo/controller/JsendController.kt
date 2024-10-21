package com.example.demo.controller

import com.example.demo.response.JsendResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/Jsend")
class JsendController {


@GetMapping("/success")
fun success(): JsendResponse {
    return JsendResponse.success(
        data = "Datos completos",
        message = "Operación exitosa"
    )
}

@GetMapping("/fail")
fun fail(): JsendResponse {
    return JsendResponse.fail(
        data = "Datos incompletos",
        message = "Hubo un problema con la solicitud"
    )
}

@GetMapping("/error")
fun error(): JsendResponse {
    return JsendResponse.error(
        message = "Error en el servidor",
        code = 500
    )
}
}