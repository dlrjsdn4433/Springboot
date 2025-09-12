package com.toiletissue.manager.controller;

import com.toiletissue.manager.model.dto.ManagerDTO;
import com.toiletissue.manager.model.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @GetMapping("/login")
    public void login(){}

    @GetMapping("/main")
    public void main(){}

    @GetMapping("/register")
    public void register(){}

    @PostMapping("/register")
    public String registManager(@ModelAttribute ManagerDTO managerDTO){
        managerService.registManager(managerDTO);
        return "redirect:/manager/login";
    }

/*    @PostMapping("/login")
    public ModelAndView login(ModelAndView mv,@RequestParam ManagerDTO managerDTO){

        ManagerDTO manager = managerService.login(managerDTO);

        mv.addObject("manager",manager);
        mv.setViewName("redirect:/manager/main");

        return mv;
    }*/
}
