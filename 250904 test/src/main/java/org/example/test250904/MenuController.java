package org.example.test250904;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {

    private final MenuService menuService;


    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/list")
    public String findMenuList(Model model){

        List<MenuDTO> menuList = menuService.findAllMenu();

        for(MenuDTO menus : menuList){
            System.out.println(menus);
        }

        model.addAttribute("menuList",menuList);

        return "menu/list";
    }
}
