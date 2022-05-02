package company.superplayer.imaginaso.data.datasources.user;

abstract public class Veiculos {
    public String cor;
    public String chassi;
    public String placa;
    public String marca;
    public String modelo;
    public String anoFabricacao;
    public Double valor;

    public Veiculos(String cor, String chassi, String placa, String marca, String modelo, String anoFabricacao, Double valor) {
        this.cor = cor;
        this.chassi = chassi;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.valor = valor;
    }

    abstract void ligarMotor();

    abstract void calculaImposto();

    abstract void atualizarVelocidade();

    abstract void atualizarPosicao();

    abstract void pagarPedagios();

}