package com.royaltea.service;

import java.util.List;

import com.royaltea.pojo.Person;

public interface PersonService {

    /**
     * ����ȫ����person
     * @return
     */
    List<Person> loadPersons();
}
