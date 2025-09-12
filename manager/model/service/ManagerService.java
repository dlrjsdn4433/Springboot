package com.toiletissue.manager.model.service;

import com.toiletissue.manager.model.dto.ManagerDTO;
import com.toiletissue.manager.model.dao.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ManagerService implements UserDetailsService {

    @Autowired
    private ManagerMapper managerMapper;

    public void managerLogin(ManagerDTO managerDTO) {

        managerMapper.managerLogin(managerDTO);
    }

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        ManagerDTO managerDTO = managerMapper.findByManagerId(id);
        System.out.println(managerDTO);
        if(managerDTO == null) throw new UsernameNotFoundException("Manager Not Found");


        return org.springframework.security.core.userdetails.User.builder()
                .username(managerDTO.getId())
                .password(managerDTO.getPwd())
                .roles(managerDTO.getRole())
                .build();
    }

    public ManagerDTO login(ManagerDTO managerDTO) {

        managerMapper.login(managerDTO);

        return managerDTO;
    }

    public void registManager(ManagerDTO managerDTO) {

        managerMapper.registManager(managerDTO);
    }
}
