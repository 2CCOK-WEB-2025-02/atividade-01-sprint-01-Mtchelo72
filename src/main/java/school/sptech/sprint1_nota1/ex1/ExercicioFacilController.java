package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {
        palavra = palavra.toLowerCase(); // se tirar da B.O

        for (int comeco = 0; comeco < palavra.length() / 2; comeco++) {
            int fim = palavra.length() -1 - comeco;
            if (palavra.charAt(comeco) != palavra.charAt(fim)) {
                return false;
            }
        }
        return true;
    }
}
