package classes;
//Herança
public class Eletrico extends Carro 
{
    private int capacidadeBateria;

    public int GetCapacidadeBateria(){return capacidadeBateria;}

    public void SetCapacidadeBateria(int _capacidadeBateria){this.capacidadeBateria = _capacidadeBateria;}

    public Eletrico(int _ano, String _modelo, String _marca, int _capacidadeBateria)
    {
        super(_ano,_modelo,_marca);
        this.capacidadeBateria = _capacidadeBateria;

    }
    @Override
    public void CarroInfo()
    {
        super.CarroInfo();
        System.out.println("Capacidade da bateria: " + GetCapacidadeBateria());
    }
}
