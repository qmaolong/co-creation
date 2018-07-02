package com.cocreation.service

import org.springframework.stereotype.Service

@Service
class CommonService {

    fun index(): String{
        println("Hello")
        return "Welcome To Co-Writing!"
    }
}