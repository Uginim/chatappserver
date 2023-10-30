package com.uginim.chatappserver.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/auth")
class AuthController {

    @PostMapping("/login")
    fun login(): String {
        return "login"
    }


    @PostMapping("/register")
    fun register(): String {
        return "register"
    }

    @PostMapping("/logout")
    fun logout(): String {
        return "logout"
    }
}