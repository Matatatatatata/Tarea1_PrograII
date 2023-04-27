import java.util.ArrayList;

class Deposito {
    private ArrayList<Producto> productos;
    /**Constructor para crear un Array con productos (simboliza el stock de "x" producto)*/
    public Deposito() {
        productos = new ArrayList<Producto>();
    }
    /**metodo getProducto() no tiene parametros, se encarga de obtener un producto
     * @return si el tamaño del Array es 0 devuelve null, si no devuelve el producto en la primera posición
    despues de haberlo borrado de la posición en la que estaba*/
    public Producto getProducto() {
        if (productos.size() == 0) {
            return null;
        } else {
            Producto ret = productos.get(0);
            productos.remove(0);
            return ret;
        }
    }
    /**metodo addProducto se encarga de agregar un producto
     * @param contenedor que puede ser tanto una bebida o un dulce que se agregue
     * retona void si no hay contenedor que agregar*/
    public void addProducto(Producto contenedor) {
        if (contenedor == null) {
            return;
        }

        productos.add(contenedor);
    }
}
/**Clase para el deposito de monedas*/
class Deposito2 {
    private ArrayList<Moneda> monedas;

    public Deposito2() {
        monedas = new ArrayList<Moneda>();
    }

    public Moneda getMoneda() {
        if (monedas.size() == 0) {
            return null;
        } else {
            Moneda ret = monedas.get(0);
            monedas.remove(0);
            return ret;
        }
    }

    public void addMoneda(Moneda coin) {
        if (coin == null) {
            return;
        }

        monedas.add(coin);
    }
}