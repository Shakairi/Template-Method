import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TesteVeiculo {

    @Test
    public void testeCarro() {
        Veiculo carro = new Carro(150);
        assertEquals("Carro", carro.getTipo());
        assertEquals(300, carro.calcularVelocidadeMaxima());
    }

    @Test
    public void testeBicicleta() {
        Veiculo bicicleta = new Bicicleta(7);
        assertEquals("Bicicleta", bicicleta.getTipo());
        assertEquals(35, bicicleta.calcularVelocidadeMaxima());
    }

    @Test
    public void testeExibirInformacoes() {
        Veiculo carro = new Carro(120);
        Veiculo bicicleta = new Bicicleta(8);

        assertEquals("Tipo de veículo: Carro\nVelocidade máxima: 240 km/h", getInformacoesFormatadas(carro));

                assertEquals("Tipo de veículo: Bicicleta\nVelocidade máxima: 40 km/h", getInformacoesFormatadas(bicicleta));
    }

}