package com.wx.springboot6.controller;

import com.wx.springboot6.dao.RedisDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RedisController {
    @Autowired
    private RedisDao redisDao;
    @RequestMapping(value = "/set/{key}/{value}")
    public void set(@PathVariable String key,@PathVariable String value)
    {
        redisDao.setKey(key,value);
    }
    @RequestMapping(value = "/get/{key}")
    public String get(@PathVariable String key)
    {
        String value = redisDao.getValue(key);
        return value;
    }
}
