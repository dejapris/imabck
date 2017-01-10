package eu.ima.bck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class ImabckApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Salutations IMA!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ImabckApplication.class, args);
    }
}
