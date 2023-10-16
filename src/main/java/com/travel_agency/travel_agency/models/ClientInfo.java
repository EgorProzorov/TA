package com.travel_agency.travel_agency.models;

import jakarta.persistence.*;

@Entity
@Table(name = "clients_info")
public class ClientInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String First_Name, Second_Name, Email;
    private int Phone_Number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getSecond_Name() {
        return Second_Name;
    }

    public void setSecond_Name(String second_Name) {
        Second_Name = second_Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(int phone_Number) {
        Phone_Number = phone_Number;
    }
}
