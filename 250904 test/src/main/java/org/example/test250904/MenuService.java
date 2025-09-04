package org.example.test250904;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class MenuService {

    @GetMapping("/list")
    public ModelAndView menuList()

    public List<MenuDTO> findAllMenu() {
    }
}
