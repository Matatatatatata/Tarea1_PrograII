abstract class Moneda implements Comparable <Moneda> {

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

    /** Método compareTo para comparar objetos de tipo Moneda */
    public int compareTo(Moneda otraMoneda) {
        if (this.valor < otraMoneda.valor) {
            return -1;
        } else if (this.valor > otraMoneda.valor) {
            return 1;
        } else {
            return 0;
        }
    }
}
/**Subclase de Moneda, representa la moneda de 100 pesos*/
class Moneda100 extends Moneda {
    /**Constructor de Moneda100
     * le otorga a la variable (llamada con super) valor = 100*/
    public Moneda100() {
        super();
        super.valor = 100;
    }

    /**metodo getValor() no tiene parametros
     * @return int valor, cantidad de $  */
    public int getValor() {
        int valor = super.valor;
        return valor;
    }
}

/**Subclase de Moneda, representa la moneda de 500 pesos*/
class Moneda500 extends Moneda {
    /**Constructor de Moneda500
     * le otorga a la variable valor = 500 */
    public Moneda500() {
        super();
        super.valor = 500;
    }
    /**metodo getValor() no tiene parametros
     * @return int valor, cantidad de $ */
    public int getValor() {
        int valor = super.valor;
        return valor;
    }
}

/**Subclase de Moneda, representa la moneda de 1000 pesos*/
class Moneda1000 extends Moneda {
    /**Constructor de Moneda1000
     * le otorga a la variable valor = 1000;*/
    public Moneda1000() {
        super();
        super.valor = 1000;
    }
    /**metodo getValor() no tiene parametros
     * @return int valor, cantidad de $ */
    public int getValor() {
        int valor = super.valor;
        return valor;
    }
}

/**Subclase de Moneda, representa la moneda de 1500*/
class Moneda1500 extends Moneda {
    /**Constructor de Moneda1500
     * le otorga a la variable valor = 1500*/
    public Moneda1500() {
        super();
        super.valor = 1500;
    }
    /**metodo getValor() no tiene parametros
     * @return int valor, cantidad de $ */
    public int getValor() {
        int valor = super.valor;
        return valor;
    }
}
