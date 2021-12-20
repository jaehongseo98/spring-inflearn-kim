package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//ctrl shift enter 자동완성 인텔리제이
@Controller
public class Test {

    @GetMapping(value = "/test")
    String getString(){
        return "오하요";
    }

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hello!");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String hellomvc(@RequestParam(name = "name") String name, Model model){ //RequestParam 값 받기
        return "helloss";
    }

    @GetMapping("hello-spring")
    @ResponseBody //http body return 데이터 넣어주기
    public String helloSpring(@RequestParam("name") String name){
        return "hello" + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName("ss");
        return hello;

    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
