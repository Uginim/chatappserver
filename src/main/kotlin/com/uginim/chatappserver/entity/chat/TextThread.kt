package com.uginim.chatappserver.entity.chat

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class TextThread {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null
}