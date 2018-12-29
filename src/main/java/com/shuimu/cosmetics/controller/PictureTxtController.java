package com.shuimu.cosmetics.controller;

import com.shuimu.cosmetics.service.IPictureTxtService;
import com.shuimu.cosmetics.service.impl.PictureTxtServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PictureTxtController {
    private final static Logger logger = LoggerFactory.getLogger(PictureTxtServiceImpl.class);

    @Autowired
    private IPictureTxtService pictureTxtService;

    @ResponseBody
    @RequestMapping("/pictureTxt")
    public String relovePictureTxt() {
        try {
            return pictureTxtService.relovePictureTxt();
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
            return e.getMessage();
        }

    }
}
