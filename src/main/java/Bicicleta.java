class Bicicleta extends Veiculo {

    private final int numeroDeMarchas; // atributo específico para bicicleta

    public Bicicleta(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    @Override
    public int calcularVelocidadeMaxima() {
        // Simples lógica para calcular a velocidade máxima de uma bicicleta
        return numeroDeMarchas * 5;
    }

    @Override
    protected String getTipo() {
        return "Bicicleta";
    }
}