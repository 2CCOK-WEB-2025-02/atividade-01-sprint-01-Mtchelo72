package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(int n) {
        if (n <= 0)
        {
            return new ExercicioDificilResponse(0, 0);
        }

        if (n == 1)
        {
            return new ExercicioDificilResponse(1, 1);
        }

        int numero1 = 0;
        int numero2 = 1;
        int soma = numero1 + numero2;

        for (int contador = 2; contador <= n; contador++)
        {
            int seguin = numero1 + numero2;
            soma += seguin;
            numero1 = numero2;
            numero2 = seguin;
        }
        return new ExercicioDificilResponse(numero2, soma);
    }
}
