package com.adl.test.controller;

import com.adl.test.model.Detail;
import com.adl.test.service.DetailService;
import com.adl.test.to.DetailTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class DetailController {
    DetailService detailService;

    public DetailController(DetailService detailService) {
        this.detailService = detailService;
    }

    @GetMapping("/adl")
    public String getAll(Model model){
        List<Detail> details = detailService.getAllDetails();
        List<DetailTo> tos  = detailService.getDetailTos(details);
        model.addAttribute("details", tos);
        return "all";
    }

    @GetMapping("/")
    public String print() {
        return "index";
    }
}
