package com.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // Generates getter methods for all fields
@Setter // Generates setter methods for all fields
@NoArgsConstructor // Generates a no-argument constructor
@AllArgsConstructor

public class Contact {
private  Integer cId;
private  String email;
private String contactName;
private Integer userId;

}
