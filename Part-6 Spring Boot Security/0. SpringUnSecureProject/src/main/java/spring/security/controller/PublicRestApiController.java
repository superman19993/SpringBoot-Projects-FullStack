package spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Created 14 / 04 / 2020 - 3:27 PM
 * @project SpringUnSecurityPlus
 * @Author Hamdamboy
 */

@Controller
@RequestMapping("api/public")
public class PublicRestApiController {

    @GetMapping("test1")
    @ResponseBody
    public String index(){
        return "testing 1";
    }

    @GetMapping("test2")
    @ResponseBody
    public String index2(){
        return "API Test 2";
    }
}
