package com.shuimu.cosmetics.utils.baidu;

import com.baidu.aip.ocr.AipOcr;

public class AipOcrUtil {
    public static final String APP_ID = "15304194";
    public static final String API_KEY = "nuIzuRgcg80O6fjFG5ekkb3Q";
    public static final String SECRET_KEY = "qHFQvZFQDSVrNQirel1osE8DSy3jwHGj";
    public static AipOcr client;

    static {
        client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
    }

}
