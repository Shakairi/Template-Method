class Carro extends Veiculo {

    private final int potenciaDoMotor;

    public Carro(int potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }

    @Override
    public int calcularVelocidadeMaxima() {

        return potenciaDoMotor * 2;
    }

    @Override
    protected String getTipo() {
        return "Carro";
    }
}