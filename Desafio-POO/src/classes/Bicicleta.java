package classes;
import abstratos.Veiculo;
//Classes abstratas
public class Bicicleta extends Veiculo
{

    @Override
    public String modoTransporte() 
    {
        return "transporte ecologico";
    }
    
}
