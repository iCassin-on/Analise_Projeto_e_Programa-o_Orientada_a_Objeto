package company.superplayer.imaginaso.data.datasources.user;

public class Carro extends Veiculos {
    public Double motor;
    public Integer quantidadePortas;

    public Carro(String cor, String chassi, String placa, String marca, String modelo, String anoFabricacao, Double valor, Double motor, Integer quantidadePortas) {
        super(cor, chassi, placa, marca, modelo, anoFabricacao, valor);
        this.motor = motor;
        this.quantidadePortas = quantidadePortas;
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
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", chassi='" + chassi + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao='" + anoFabricacao + '\'' +
                ", valor=" + valor +
                ", motor=" + motor +
                ", quantidadePortas=" + quantidadePortas +
                '}';
    }
}
