package com.uginim.chatappserver.entity.base

import com.uginim.chatappserver.entity.user.ChatUser
import jakarta.persistence.ManyToOne
import jakarta.persistence.MappedSuperclass

@MappedSuperclass
open class UserResourceBase(
    @ManyToOne
    var createdBy: ChatUser,
    @ManyToOne
    var updatedBy: ChatUser,
): CommonBase() {


}