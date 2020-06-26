package com.justpark.models.accounts;

import com.justpark.models.people.Person;

public class Attendent extends Account {
    public Attendent(String username, String saltedPasswordHash, Person person) {
        super(username, saltedPasswordHash, person);
    }
}
