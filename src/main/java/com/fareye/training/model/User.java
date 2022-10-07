package com.fareye.training.model;

import com.fareye.training.utility.EncryptDecryptUtil;
import com.fareye.training.utility.EncryptionDecryptionUsingHash;

import java.time.LocalDate;
import java.util.Date;

public class User {

    private String firstName;
    private String lastName;

    private String email;

    private boolean verified;

    private LocalDate created;

    private Date modified;

    private String password;

    private String role;

    private boolean active;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        LocalDate now = LocalDate.now();
        this.created = now;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception {
        EncryptDecryptUtil e = new EncryptDecryptUtil();
        e.init();
        this.password = e.encrypt(password);
        System.out.println(password);
        System.out.println(e.decrypt(this.password));

        EncryptionDecryptionUsingHash he = new EncryptionDecryptionUsingHash();
        String temp = he.encrypt("Shubham");
        System.out.println(he.decrypt(temp));
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }





}
