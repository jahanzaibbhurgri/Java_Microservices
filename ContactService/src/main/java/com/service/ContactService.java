package com.service;

import com.entity.Contact;

import java.util.List;

public interface ContactService {
    public List<Contact> getContactsOfUser(Integer userId);
}
