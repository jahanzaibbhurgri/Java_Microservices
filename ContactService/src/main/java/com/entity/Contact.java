package com.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor

public class Contact {
    private Integer cId;
    private String email;
    private String contactName;
    private Integer userId;
    public Contact(Integer cId, String email, String contactName, Integer userId) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        this.userId = userId;
    }
}

