//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Impresora laser = new ImpresoraLaser("HP LaserJet", 1200, 20);
    Impresora tinta = new ImpresoraTinta("Epson EcoTank", 600, 0);

    System.out.println("IMPRESORA LASER");
    laser.mostrarEstado();
    laser.imprimirDocumento("Informe anual");
    laser.mostrarEstado();

    System.out.println("--------------------");

    System.out.println("IMPRESORA A TINTA");
    tinta.mostrarEstado();
    tinta.imprimirDocumento("Factura");
    tinta.mostrarEstado();
}
