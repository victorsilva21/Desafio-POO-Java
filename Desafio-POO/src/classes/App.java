package classes;
public class App 
{
    
    public static void main(String[] args) throws Exception 
    {
        Carro carro1 = new Carro(2005,"M6","BMW");
        Carro carro2 = new Carro(2009, "Civic", "Honda");
        //Classes abstratas
        Bicicleta bicicleta = new Bicicleta();
        //Herança
        Eletrico carroE = new Eletrico(2022,"Tron","BYD", 5000);
        //Agregação e composição
        Proprietario pessoaFisica = new Proprietario("Victor", carroE, "Bahia", "Salvador");
        //Excessões
        Carro carroVelho = new Carro(1500,"Caravana", "Portuguesa");

        System.out.println("Carro 1: ");
        carro1.CarroInfo();

        System.out.println("Carro 2: ");
        carro2.CarroInfo();

        System.out.println("Carro 2 com ano alterado: ");
        carro2.SetAno(2016);
        carro2.CarroInfo();

        System.out.println("Carro eletrico: ");
        carroE.CarroInfo();

        System.out.println("Bicicleta: ");
        System.out.println("Modo de transporte: " + bicicleta.modoTransporte());

        System.out.println("Proprietario 1: ");
        pessoaFisica.ProprietarioInfo();

        System.out.println("Carro que não existe: ");
        carroVelho.CarroInfo();
    }
    
}

