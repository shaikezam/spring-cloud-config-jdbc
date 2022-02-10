package shai.zambrovski.config.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class SimpleController {

    @Value("${my.value}")
    private String myValue;

    @GetMapping(value = "/get_value")
    @ResponseBody
    public String getMyValue() {
        return myValue;
    }

}
