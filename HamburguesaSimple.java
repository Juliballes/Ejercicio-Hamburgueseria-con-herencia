//extends, esta clase esta heredando los atributos y metodos de la clase hamburguesa
public class HamburguesaSimple extends Hamburguesa{
    private Medallon medallon;
    private Ingrediente ingrediente;


    public void ponerMedallon(Medallon medallon) {
        this.medallon = medallon;
    }

    public void ponerIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int calcularPrecio(){
        //Aca esta devolviendo el precio base de esta hamburguesa (1000)+ el precio del medallon (ej vegetariano 1500) + el precio del ingrediente que le haya puesto (ej lechuga 300 y tomate 350)
        return this.precioBase + this.medallon.getPrecio() + ingrediente.getPrecio();

    }
}
