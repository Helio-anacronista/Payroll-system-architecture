public class Holerite {

    Fucionario holeriteFucionario;

    double valorTotalHorasNormais;
    double valortotalHorasExtras;
    double valorAdicionalPorFilho;

    double calcularValortotalGeral() {
        return valorTotalHorasNormais + valortotalHorasExtras + valorAdicionalPorFilho;
    }

    void imprimirRelatorio() {
        System.out.println("FUCIONARIO:");
        System.out.println("Nome: " + holeriteFucionario.nome );
        System.out.println("Valor total de horas normais: " + String.format("%.2f" , valorTotalHorasNormais));
        System.out.println("Valor total de horas extras: " + String.format("%.2f" , valortotalHorasExtras));
        System.out.println("Valor adcional por possuir filho: " + String.format("%.2f" , valorAdicionalPorFilho));
        System.out.println("Valor total: " + String.format("%.2f" , calcularValortotalGeral()));
    }
}
