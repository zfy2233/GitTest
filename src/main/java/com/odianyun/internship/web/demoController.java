package com.odianyun.internship.web;

import com.odianyun.internship.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zfy
 * @create 2021-07-13 10:56
 */
@RestController
public class demoController {

    @Autowired
    private user user;

    @RequestMapping("/get")
    public user userget(){
        user.setUserName("diaoxingguo");
        user.setSex("男");
        user.setMobile("13127787865");
        return user;


    }

    @RequestMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,@PathVariable("username") String name,@PathVariable Map<String,String> pv){
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        map.put("name",name);
        map.put("pv",pv);
        return map;

    }


}
