package info.owaism.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Owais on 4/21/15.
 */
@Controller
public class HelloWorldController {
	
	private static final String RESPONSE = "Hello World!!!!";

    @RequestMapping(value = {"/**/*","/"}, method = RequestMethod.GET)
    @ResponseBody
    public String justSayIt(){
        return RESPONSE;
    }

}
