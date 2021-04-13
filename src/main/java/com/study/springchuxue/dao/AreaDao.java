package com.study.springchuxue.dao;

import com.study.springchuxue.entity.Area;

import java.util.List;

public interface AreaDao {
    //列出区域列表
    List<Area> querryArea();
    //根据ID查询区域信息
    Area querryAreaById(int areaId);
    //插入区域信息
    int insterArea(Area area);
    //修改区域信息
    int updateArea(Area area);
    //删除区域信息
    int deleteArea(int areaId);

}
