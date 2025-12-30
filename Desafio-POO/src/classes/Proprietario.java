package classes;

public class Proprietario 
{
    private String nome;
    //Agregação
    private Carro carro;
    //Composição
    private Endereco endereco;

    public String GetNome(){return nome;}
    public Carro GetCarro(){return carro;}

    public void SetNome(String _nome){this.nome = _nome;}
    public void SetCarro(Carro _carro){this.carro = _carro;}

    public Proprietario(String _nome, Carro _carro, String _estado, String _cidade) 
    {
        this.nome = _nome;
        this.carro = _carro;
        this.endereco = new Endereco(_estado,_cidade);
    }
    public void ProprietarioInfo()
    {
        System.out.println("Nome: " + GetNome());
        System.out.println("Cidade: " + endereco.GetCidade());
        System.out.println("Estado: " + endereco.GetEstado());
        System.out.println("Carro: ");
        carro.CarroInfo();
    }
}
