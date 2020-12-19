package com.itclj.controller;

import com.itclj.service.ItcljService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/itclj")
public class ItcljController {

    @Resource
    private ItcljService itcljService;

    /**
     * http://127.0.0.1:8080/itclj/add?a=-1
     * @param a
     * @return
     */
    @GetMapping("/add")
    public int add(int a) {
        return itcljService.add(a);
    }
}
