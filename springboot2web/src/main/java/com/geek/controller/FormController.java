package com.geek.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author Robert
 * @create 2020/12/28 13:58
 * @Version 1.0
 * @Description:
 */
@Controller
@Slf4j
public class FormController {


    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }

    /**
     * MultipartFile 自动封装上传过来的文件
     * @param email
     * @param username
     * @param headerImg
     * @param photos
     * @return
     */
    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("photos") MultipartFile[] photos) throws IOException {
        //获取前端传入的文件
        log.info("上传的信息：email={}，username={}，headerImg={}，photos={}",
                email,username,headerImg.getSize(),photos.length);
//        判断个人图片是否为空 传入E盘
        if(!headerImg.isEmpty()){
            String originalFilename = headerImg.getOriginalFilename();
            headerImg.transferTo(new File("E:\\cache\\"+originalFilename));
        }

        if (photos.length >0){//判断长度
            for (MultipartFile photo : photos) {//遍历放入
                String originalFilename = photo.getOriginalFilename();
                photo.transferTo(new File("E:\\cache\\"+originalFilename));

            }
        }
        return "main";

    }

}
