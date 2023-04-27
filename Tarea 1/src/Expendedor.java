/**Un expendedor que tendrá depositos para cada producto y para el vuelto*/
class Expendedor {
    /**Se declaran enteros que hacen referencia a cada deposito según su tipo de producto
     * Se declara un entero que será el precio del producto escogido
     * Se declaran depositos de cada producto, de vuelto y uno auxiliar*/
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int GALLETA1 = 3;
    public static final int GALLETA2 = 4;
    private int precio;
    private Deposito depCoca;
    private Deposito depSprite;
    private Deposito depGall1;
    private Deposito depGall2;

    private Deposito2 depVuelto;
    private Deposito2 aux;
    /**Constructor de Expendedor
     * @param n
     * @param precio*/
    public Expendedor(int n, int precio) {
        this.precio = precio;
        this.depVuelto = new Deposito2();
        depCoca = new Deposito();
        depSprite = new Deposito();
        depGall1 = new Deposito();
        depGall2 = new Deposito();
        aux = new Deposito2();

        for (int i = 0; i < n; i++) {
            depCoca.addProducto(new CocaCola(100 + i));
            depSprite.addProducto(new Sprite(200 + i));
            depGall1.addProducto(new Obsesion( 300 + i));
            depGall2.addProducto(new Costa(300 + i));
        }

        for (int i = 0; i < 100; i++) {
            aux.addMoneda(new Moneda100());
        }
    }

    public Producto comprarProducto(Moneda peseta, int cual) {
        Producto ret = null;
        int vuelto = 0;

        if (peseta == null) {
            return null;
        }

        switch (cual) {
            case 1: {
                if (peseta.getValor() >= precio) {
                    vuelto = peseta.getValor() - precio;
                    ret = depCoca.getProducto();
                    break;
                }
            }
            case 2: {
                if (peseta.getValor() >= precio) {
                    vuelto = peseta.getValor() - precio;
                    ret = depSprite.getProducto();
                    break;
                }
            }
            case 3: {
                if (peseta.getValor() >= precio) {
                    vuelto = peseta.getValor() - precio;
                    ret = depGall1.getProducto();
                    break;
                }
            }
            case 4: {
                if (peseta.getValor() >= precio) {
                    vuelto = peseta.getValor() - precio;
                    ret = depGall2.getProducto();
                    break;
                }
            }
        }

        if (ret != null) {
            vuelto = vuelto / 100;
            for (int i = 0; i < vuelto; i++) {
                depVuelto.addMoneda(aux.getMoneda());
            }
            peseta = null;
        } else {
            depVuelto.addMoneda(peseta);
        }
        return ret;
    }


    public Moneda getVuelto() {
        return depVuelto.getMoneda();
    }
}