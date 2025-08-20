package school.sptech.sprint1_nota1.ex2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioMedioController {

    @GetMapping("/ex-02/{numero}")
    public Boolean exercicioMedio(@PathVariable int numero) {
       // esse if tem que ficar encima de tudo, la embaixo com o elseif n funfou
        if (numero <= 1) {
            return false;
        }
        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }

        return true;

    }
}
