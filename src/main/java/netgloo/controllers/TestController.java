package netgloo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class TestController extends WebMvcConfigurerAdapter {

  @RequestMapping("/test")
  @ResponseBody
  public String index() {
    return "Goood";
  }

}
