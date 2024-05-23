package com.woodz.love.controller;

import com.woodz.love.model.MainPh;
import com.woodz.love.service.IMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/hesu")
public class MainController {
    @Autowired
    IMainService mainService;
//    @GetMapping("/list")
//    public String getAllMainPh(Model model) {
//        List<MainPh> mainPh = mainService.getAllMainPh();
//        model.addAttribute("mainPh", mainPh);
//        return "/main";
//    }
    @GetMapping("/")
    public String getAllMain(Model model) {
//        List<MainPh> mainPh = mainService.getAllMainPh();
//        model.addAttribute("mainPh", mainPh);
        return "/index";
    }

}
