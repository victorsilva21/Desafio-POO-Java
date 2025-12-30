package classes;

public class Endereco 
{
    private String estado;
    private String cidade;

    public String GetEstado(){return estado;}
    public String GetCidade(){return cidade;}

    public Endereco(String _estado, String _cidade) 
    {
        this.estado = _estado;
        this.cidade = _cidade;
    }
    
}
