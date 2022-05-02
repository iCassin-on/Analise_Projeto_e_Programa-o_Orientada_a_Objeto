package company.superplayer.imaginaso.data.datasources.user;

public class Caminhao extends Veiculos {
    String tara;
    String lotacao;
    Integer eixos;

    public Caminhao(String cor, String chassi, String placa, String marca, String modelo, String anoFabricacao, Double valor, String tara, String lotacao, Integer eixos) {
        super(cor, chassi, placa, marca, modelo, anoFabricacao, valor);
        this.tara = tara;
        this.lotacao = lotacao;
        this.eixos = eixos;
    }

    void atualizarCarga() {
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
        return "Caminhao{" +
                "cor='" + cor + '\'' +
                ", chassi='" + chassi + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao='" + anoFabricacao + '\'' +
                ", valor=" + valor +
                ", tara='" + tara + '\'' +
                ", lotacao='" + lotacao + '\'' +
                ", eixos=" + eixos +
                '}';
    }
}