package school.sptech.sprint1_nota1.ex3;

public class ExercicioDificilResponse {
    public Integer soma;
    public Integer enesimoTermo;

    public ExercicioDificilResponse(Integer soma, Integer enesimoTermo) {
        this.soma = soma;
        this.enesimoTermo = enesimoTermo;
    }

    public Integer getSoma() {
        return soma;
    }

    public void setSoma(Integer soma) {
        this.soma = soma;
    }

    public Integer getEnesimoTermo() {
        return enesimoTermo;
    }

    public void setEnesimoTermo(Integer enesimoTermo) {
        this.enesimoTermo = enesimoTermo;
    }
}
