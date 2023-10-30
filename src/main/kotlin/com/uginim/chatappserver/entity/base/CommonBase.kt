package com.uginim.chatappserver.entity.base

import com.fasterxml.jackson.annotation.JsonFormat
import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@MappedSuperclass
open class CommonBase {
    /**
     * 공통 컬럼
     */

    // 삭제여부
    var isDeleted: Boolean = false

    // 생성일시
    @Column(nullable = false)
    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    var createdAt: LocalDateTime = LocalDateTime.now()

    // 수정일시
    @Column
    @UpdateTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    var updatedAt: LocalDateTime = LocalDateTime.now()
}