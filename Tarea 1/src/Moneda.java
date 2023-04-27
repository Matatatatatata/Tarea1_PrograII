abstract class Moneda {

    /**Se declara:
     * @param valor osea el valor de la moneda, no cambia
     * @param serie que hace de referencia para las subclases que nacen de la superclase "Moneda", no cambia
     */
    protected int valor;
    protected int serie;
    /**Constructor de Moneda*/
    public Moneda() {
    }
    public abstract int getValor();

    /**getSerie() no tiene parametros de entrada
     * retorna el valor protegido serie*/
    public Moneda getSerie() {
        return this;
    }
}
