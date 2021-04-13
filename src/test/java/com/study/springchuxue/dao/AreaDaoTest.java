package com.study.springchuxue.dao;

import com.study.springchuxue.entity.Area;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class AreaDaoTest {

    @Autowired
    private  AreaDao areaDao;
    @Test
    void querryArea() {
        List<Area> areas = areaDao.querryArea();
        assertEquals(2,areas.size());

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