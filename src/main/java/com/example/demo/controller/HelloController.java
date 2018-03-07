package com.example.demo.controller;

import com.example.demo.entity.Title;
import com.example.demo.repository.TitleRepository;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private TitleRepository titleRepository;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/gettitle",method = RequestMethod.GET)
    @ResponseBody
    public String getTitle(){
        List<Title> list = titleRepository.findAll();
        String json = JSONArray.fromObject(list).toString();
        return json;
    }
}
