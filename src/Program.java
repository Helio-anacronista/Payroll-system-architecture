public class Program  {
    public static void main(String[] args) {
        Fucionario fucionarioJr = new Fucionario();
        fucionarioJr.nome = "João";
        fucionarioJr.quatidadeDeFilhos = 2;

        ContratoTrabalho contratoTrabalhoJr = new ContratoTrabalho();
        contratoTrabalhoJr.vfuFucionario = fucionarioJr;
        contratoTrabalhoJr.valorDaHoraNormal = 9.0;
        contratoTrabalhoJr.valorDahoraExtra = 18.0;

        FolhaPagamento folhaPagamentoJr = new FolhaPagamento();
        folhaPagamentoJr.qHorasNormais = 48;
        folhaPagamentoJr.qHorasExtras = 12;

        // Calcular o salario do obj do contrato
        folhaPagamentoJr.calcularSalario(contratoTrabalhoJr);
        folhaPagamentoJr.sumarioHolerite.holeriteFucionario = fucionarioJr;

        //Imprimir
        folhaPagamentoJr.sumarioHolerite.imprimirRelatorio();

    }
}
