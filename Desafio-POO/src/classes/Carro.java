package classes;
import interfaces.Veiculo;
//Classe
public class Carro implements Veiculo
{
 private int ano = 2002;
 private String modelo = "AE86";
 private String marca = "Toyota"; 
 //Encapsulamento
 public int GetAno(){return ano;}
 public String GetModelo(){return modelo;}
 public String GetMarca(){return marca;}
 
 public void SetAno(int _ano){this.ano = _ano;}
 public void SetModelo(String _modelo){this.modelo = _modelo;}
 public void SetMarca(String _marca){this.marca = _marca;}
 
 
 //Construtor
 public Carro(int _ano, String _modelo, String _marca)
 {
    ValidacaoIdade(_ano);
    this.ano = _ano;
    this.modelo = _modelo;
    this.marca = _marca;
 }
 //Exceções
 private void ValidacaoIdade(int _ano)
 {
   if(_ano < 1886)
      {
         throw new IllegalArgumentException("Ano invalido, não existiam carros nessa epoca");
      }
 }
 //Polimorfismo
 public void CarroInfo()
    {
        System.out.println("ano do carro: " + GetAno());
        System.out.println("Modelo do carro: " + GetModelo());
        System.out.println("Marca do carro: " + GetMarca());
    }
 @Override
 public void Ligar() 
 {    
    System.out.println("Carro Ligado.");
 }
}
