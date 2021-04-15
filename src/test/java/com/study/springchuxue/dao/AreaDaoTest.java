package com.study.springchuxue.dao;

import com.study.springchuxue.entity.Area;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest
class AreaDaoTest {

    @Autowired
    public AreaDao areaDao;
    @Test
    void querryArea() {
        List<Area> areas = areaDao.querryArea();
        Assertions.assertEquals(2,areas.size());

    }

    @Test
    void querryAreaById() {
    }

    @Test
    void insterArea() {
    }

    @Test
    void updateArea() {
    }

    @Test
    void deleteArea() {
    }
}