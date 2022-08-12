public class FolhaPagamento {
    static final double PORCETAGEM_ADICIONAL_POR_POSSUIR_FILHOS = 0.1;
    double qHorasNormais;
    double qHorasExtras;
    Holerite sumarioHolerite = new Holerite();

    void calcularSalario(ContratoTrabalho contratoTrabalho) {
        double valorTotalHorasNormais = contratoTrabalho.valorDaHoraNormal * qHorasNormais;
        double valorTotalHorasExtras = contratoTrabalho.valorDahoraExtra * qHorasExtras;

        // Variavel de instacia Holerite
        sumarioHolerite.valorTotalHorasNormais = valorTotalHorasNormais;
        sumarioHolerite.valortotalHorasExtras = valorTotalHorasExtras;

        // Calculor adcional por filho
        if (contratoTrabalho.possuiFilhos()) {
            double valorTotalSalario = valorTotalHorasNormais + valorTotalHorasExtras;
            double valorAdicional = valorTotalSalario * PORCETAGEM_ADICIONAL_POR_POSSUIR_FILHOS;
            sumarioHolerite.valorAdicionalPorFilho = valorAdicional;
        } else {
            sumarioHolerite.valorAdicionalPorFilho = 0;
        }
    }
}
