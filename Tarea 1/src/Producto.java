/**
 *Tarea 1 Programación II:Una máquina expendedora que venda tanto Bebidas como dulces a un Comprador.
 * @autor Matias A. Muñoz Sotomayor
 * @autor Constanza F. Cristinich Ananias
 * @version version 1, 26 de abril 2023
 */

/**Superclase "modelo" para las bebidas y los dulces*/

abstract class Producto {

    /** se declara int que funciona como un identificador del producto*/
    private int serie;
    /**Constructor de Producto
     * @param s único int
     el valor entero de s */
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
/**Subclase de Producto, representa modelo para Bebida*/
abstract class Bebida extends Producto{
    private int serie;
    /**
     * Constructor de Producto
     * @param s único int*/
    public Bebida(int s) {
        super(s);
    }

    public abstract String consumir();
    public int getSerie() {
        int s = serie;
        return serie;
    }
}
/**Subclase de Producto, representa modelo para Dulce*/
abstract class Dulce extends Producto{
    private int serie;
    public Dulce(int s) {
        super(s);
    }
    public abstract String consumir();
    public int getSerie() {
        int s = serie;
        return serie;
    }
}

/**Subclase de Bebida, representa la bebida CocaCola*/
class CocaCola extends Bebida {
    /**Constructor para los productos CocaCola
     * @param s1 int*/
    public CocaCola(int s1) {
        super(s1);
    }
    /**Se sobreescribe el método consumir()
     * @return "cocacola*/
    @Override
    public String consumir() {
        return "cocacola";
    }
}
/**Subclase de Bebida, representa la bebida Sprite*/
class Sprite extends Bebida {
    /**Constructor para los productos Sprite
     * @param s1 int
     */
    public Sprite(int s1) {
        super(s1);
    }
    /**Se sobreescribe el metodo consumir()
     * @return "sprite"*/
    @Override
    public String consumir() {
        return "sprite";
    }
}
/**Subclase de Dulce, representa los Snickers*/
class Snickers extends Dulce{
    /**Constructor para Snickers
     * @param s2 int */
    public Snickers(int s2){super(s2);}
    /**Se sobreescribe el metodo consumir()
     * @return "Snicker" */
    @Override
    public String consumir() {return "Snicker";}
}
/**Subclase de Dulce, representa los Super8*/
class Super8 extends Dulce{
    /**Constructor para los Super8
     * @param s2 int */
    public Super8(int s2){super(s2);}
    /**Se sobreescribe el metodo consumir()
     * @return String "Super8" */
    public String consumir(){return "Super8";}
}