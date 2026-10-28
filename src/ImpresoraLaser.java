public class ImpresoraLaser extends Impresora{
    private int nivelToner;

    public ImpresoraLaser(String modelo, int resolucion, int nivelToner) {
        super(modelo, resolucion);
        this.nivelToner = nivelToner;
    }

    @Override
    public void imprimirDocumento(String documento) {
        if (nivelToner > 0) {
            System.out.println("Imprimiendo con laser: " + documento);
            nivelToner -= 10;

            if (nivelToner < 0) {
                nivelToner = 0;
            }
        } else {
            System.out.println("Error: toner agotado.");
        }
    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("Nivel de toner: " + nivelToner + "%");
    }
}
