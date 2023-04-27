class Comprador {
    private String consumir;
    private int vuelto;

    public Comprador(Moneda m, int CualProducto, Expendedor maquina) {
        vuelto = 0;
        Producto contenedor = maquina.comprarProducto(m, CualProducto);

        while (true) {
            Moneda devuelve = maquina.getVuelto();
            if (devuelve == null) {
                break;
            }

            vuelto += devuelve.getValor();
        }

        if (contenedor != null) {
            consumir = contenedor.consumir();
        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queConsumiste() {
        return consumir;
    }
}
