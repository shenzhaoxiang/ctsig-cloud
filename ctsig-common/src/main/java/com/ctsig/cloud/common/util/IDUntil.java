package com.ctsig.cloud.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * ID生产工具
 * @author yesh
 *         (M.M)!
 *         Created by 2017/8/1.
 */
public class IDUntil {

    /**
     * 根据日期生成ID+UUID截取规则
     * @param index 第几位
     * @return
     */
    public static String getRandomId(Integer index){
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
        String temp = sf.format(new Date());
        StringBuilder append = new StringBuilder().append(temp).append(UUID.randomUUID().toString().substring(1,index));
        return append.toString();
    }
}
