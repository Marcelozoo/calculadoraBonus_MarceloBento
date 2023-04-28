package Model;

public class SomatorioOperacao implements IOperacao {

    @Override
    public void calcular(DadosPeso peso) {
        double soma = 0;
        
        for (int counter = 0; counter < peso.getPesos().size(); counter++) {
            soma += peso.getPesos().get(counter);
        }
        peso.addResultado(new Resultado("Somatorio dos Pesos", soma));

    }

}
