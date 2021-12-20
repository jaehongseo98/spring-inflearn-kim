package hello.hellospring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Test {

    @GetMapping(value = "/test")
    String getString(){
        return "오하요";
    }
}
