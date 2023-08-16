package com.service;

import com.entity.Contact;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImp implements  ContactService{
    //fake list of contacts //

    List<Contact> list = List.of(

       new Contact(1,"2132","312312",2),
        new Contact(2,"2132","312312",4)
    );

    @Override

        public List<Contact> getContactsOfUser(Integer userId) {
            return list.stream()
                    .filter(contact -> contact.getUserId().equals(userId))
                    .collect(Collectors.toList());
        }

    }

