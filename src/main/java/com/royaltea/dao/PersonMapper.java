package com.royaltea.dao;

import java.util.List;

import com.royaltea.pojo.Person;

public interface PersonMapper {
    /**
     * ����һ����¼
     * @param person
     */
    void insert(Person person);
    
    /**
     * ��ѯ����
     * @return
     */
    List<Person> queryAll();
}
