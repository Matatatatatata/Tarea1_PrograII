/**
 *Tarea 1 Programación II:Una máquina expendedora que venda tanto Bebidas como dulces a un Comprador.
 * @autor Matias A. Muñoz Sotomayor
 * @autor Constanza F. Cristinich Ananias
 * @version version 1, 26 de abril 2023
 */

/**Superclase "modelo" para las bebidas y los dulces*/

abstract class Producto {

    /** se declara int que funciona como un identificador del producto
     * @param s único int
     */

    private int serie;
    /**Constructor de Producto
     * @param s único int
     * @return el valor entero de s */
    public Producto(int s) {
        serie = s;
    }
    public abstract String consumir();
    /** getSerie no tiene parametro de entrada.
     * @return el valor entero de s */
    public int getSerie() {
        int s = serie;
        return serie;
    }
}
/**Subclase de Producto, representa la bebida CocaCola*/
class CocaCola extends Producto {
    /**Constructor para los productos CocaCola
     * @param s int*/
    public CocaCola(int s) {
        super(s);
    }
    /**Se sobreescribe el método consumir()
     * @return "cocacola*/
    @Override
    public String consumir() {
        return "cocacola";
    }
}
/**Subclase de Producto, representa la bebida Sprite*/
class Sprite extends Producto {
    /**Constructor para los productos Sprite
     * @param s int
     */
    public Sprite(int s) {
        super(s);
    }
    /**Se sobreescribe el metodo consumir()
     * @return "sprite"*/
    @Override
    public String consumir() {
        return "sprite";
    }
}
/**Subclase de Producto, representa las galletas Obsesión*/
class Obsesion extends Producto{
    /**Constructor para los productos Obsesion
     * @param s int */
    public Obsesion(int s){super(s);}
    /**Se sobreescribe el metodo consumir()
     * @return "Galleta Obsesion" */
    @Override
    public String consumir() {return "Galleta obsesion";}
}
/**Subclase de Producto, representa las galletas Costa*/
class Costa extends Producto{
    /**Constructor para los productos Costa
     * @param s int */
    public Costa(int s){super(s);}
    /**Se sobreescribe el metodo consumir()
     * @return String "Galleta Costa" */
    public String consumir(){return "Galleta Costa";}
}