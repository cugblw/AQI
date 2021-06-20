package com.example.aqi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DownloadAQI {
    @ResponseBody
    @RequestMapping(value = "/aqi", method = RequestMethod.GET)
    public String downloadAQI(){
        return "Get Real AQI Data";
    }
}
