package com.uginim.chatappserver.entity.user

import com.uginim.chatappserver.entity.base.CommonBase
import com.uginim.chatappserver.entity.base.UserResourceBase
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class ChatUser: CommonBase() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null


    var nickname: String? = null
    var email: String? = null

    var passwordHash: String? = null
}