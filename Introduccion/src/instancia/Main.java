package instancia;

public class Main {
    public static void main(String[] args) {
        Articulo articulo = new Articulo("Articulo 1",100, 1100.00);

        if(articulo.hayStock()){
            System.out.println("Hay stock disponible!");
            System.out.println("El precio de venta es "+ articulo.consultarPrecio());
        }else{
            System.out.println("Lo sentimos no hay stock :c");
        }


    }
}
