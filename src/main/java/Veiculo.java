abstract class Veiculo {

    public abstract int calcularVelocidadeMaxima();

    public void exibirInformacoes() {
        System.out.println("Tipo de veículo: " + getTipo());
        System.out.println("Velocidade máxima: " + calcularVelocidadeMaxima() + " km/h");
    }

    protected abstract String getTipo();
}