class Veiculos {
    
    private String marca;
    private String cor;
    private int ano;
    private String modelo;

    public veiculos (String marca, String cor, int ano, String modelo){
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.modelo = modelo;
    }

    public void printDetails(){
        System.out.println("Marca:" +marca);
        System.out.println("Cor: "+cor);
        System.out.println("Ano: " +ano);
        System.out.println("Modelo: " +modelo);
    }

    class carro extends Veiculos{
        private String tipo;
        
        public void carroDetails(String marca, String cor, int ano, String modelo, String tipo){
            super(marca, cor, ano, modelo);
            this.tipo = tipo;
        }
        
        public void carroDetails(){
            printDetails();
            System.out.println("Tipo :" +tipo);
            System.out.println(" ");
        }
    }
}
