package com.it.utils;

import org.junit.jupiter.api.Test;

import java.util.UUID;

/**
 * @author ZuYingFang
 * @time 2021-08-16 20:55
 */
public class IDUtils {

    public static String getId(){
        return String.valueOf(UUID.randomUUID()).replaceAll("-", "");
    }

    @Test
    public void test(){
        System.out.println(IDUtils.getId());
    }

}
