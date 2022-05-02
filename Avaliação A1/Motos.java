package company.superplayer.imaginaso.data.datasources.user;

public class Motos extends Veiculos {
    Integer cilindros;
    Boolean escapamentoAlterado;

    public Motos(String cor, String chassi, String placa, String marca, String modelo, String anoFabricacao, Double valor, Integer cilindros, Boolean escapamentoAlterado) {
        super(cor, chassi, placa, marca, modelo, anoFabricacao, valor);
        this.cilindros = cilindros;
        this.escapamentoAlterado = escapamentoAlterado;
    }

    @Override
    void ligarMotor() {
    }
    @Override
    void calculaImposto() {
    }
    @Override
    void atualizarVelocidade() {
    }
    @Override
    void atualizarPosicao() {
    }
    @Override
    void pagarPedagios() {
    }
    @Override
    public String toString() {
        return "Motos{" +
                "cor='" + cor + '\'' +
                ", chassi='" + chassi + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao='" + anoFabricacao + '\'' +
                ", valor=" + valor +
                ", cilindros=" + cilindros +
                ", escapamentoAlterado=" + escapamentoAlterado +
                '}';
    }
}
