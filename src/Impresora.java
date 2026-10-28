public abstract class Impresora {
    private String modelo;
    private int resolucion;

    public Impresora(String modelo, int resolucion) {
        this.modelo = modelo;
        this.resolucion = resolucion;
    }

    public String getModelo() {
        return modelo;
    }

    public int getResolucion() {
        return resolucion;
    }

    public abstract void imprimirDocumento(String documento);

    public void mostrarEstado() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Resolucion: " + resolucion + " DPI");
    }
}
