package com.cocreation.writing.controller

import com.cocreation.service.CommonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class IndexController {
    @Autowired
    private lateinit var commonService: CommonService

    @RequestMapping("/")
    @ResponseBody
    fun index() = commonService.index()
}