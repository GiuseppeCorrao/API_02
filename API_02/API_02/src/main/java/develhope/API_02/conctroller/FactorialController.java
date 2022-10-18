package develhope.API_02.conctroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    @GetMapping("{n}")
    public int factorial(@PathVariable int n) {

        int f = 1;
        for(int i=1; i<=n; i=i+1) {
            f=f*i;
        }

        return f;

    }
}
