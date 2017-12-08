package com.awb.app.user.serviceCall;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountServiceCall {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public JSONObject login(@RequestParam(value = "ss",required = false,defaultValue = "{}") String ref,@RequestParam(value = "data",required = false,defaultValue = "{}")String data){
        JSONObject jsonData=JSONObject.parseObject(data);

        return jsonData;
    }
}
