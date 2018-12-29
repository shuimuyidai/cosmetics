package com.shuimu.cosmetics.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPObject;
import com.baidu.aip.ocr.AipOcr;
import com.shuimu.cosmetics.service.IPictureTxtService;
import com.shuimu.cosmetics.utils.HttpUtil;
import com.shuimu.cosmetics.utils.PictureUtil;
import com.shuimu.cosmetics.utils.baidu.AipOcrUtil;
import com.shuimu.cosmetics.utils.baidu.AuthService;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PictureTxtServiceImpl implements IPictureTxtService {
    private final static Logger logger = LoggerFactory.getLogger(PictureTxtServiceImpl.class);

    @Override
    public String relovePictureTxt() throws Exception {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("detect_direction", "true");
        options.put("detect_language", "true");

        // 参数为本地路径
        String image = "E:\\新建文件夹\\qqq.png";
        AipOcr client = AipOcrUtil.client;
        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        JSONObject res = client.basicGeneral(image, new HashMap<String, String>());
        System.out.println(res.toString(2));
        return res.toString();
    }
}
