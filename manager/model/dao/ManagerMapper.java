package com.toiletissue.manager.model.dao;

import com.toiletissue.manager.model.dto.ManagerDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManagerMapper {

    ManagerDTO findByManagerId(String id);

    void registManager(ManagerDTO managerDTO);
}
