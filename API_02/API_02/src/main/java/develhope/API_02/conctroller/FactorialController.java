package develhope.API_02.conctroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    @GetMapping("{n}")
    public String factorial(@PathVariable String n) {

        return n;

    }
}
