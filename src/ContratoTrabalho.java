public class ContratoTrabalho {
    Fucionario vfuFucionario;
    double valorDaHoraNormal;
    double valorDahoraExtra;

    boolean possuiFilhos() {
        if (vfuFucionario.quatidadeDeFilhos >= 1) {
            return true;
        }
        return false;
    }
}
