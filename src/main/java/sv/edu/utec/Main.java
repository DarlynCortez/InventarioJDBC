package sv.edu.utec;

import sv.edu.utec.datos.ProductoDAO;
import sv.edu.utec.modelo.Producto;
import sv.edu.utec.modelo.Producto;
public class Main {

    public static void main(String[] args) {

        ProductoDAO dao = new ProductoDAO();

        // Crear la tabla
        dao.crearTabla();
        System.out.println("Tabla producto lista.");
        // Insertar productos de prueba
        dao.insertar(new Producto(1, "Laptop", 10));
        dao.insertar(new Producto(2, "Mouse", 25));
        dao.insertar(new Producto(3, "Teclado", 15));
        System.out.println("Productos insetados.");
        // Listar productos

        System.out.println("\n--- LISTA DE PRODUCTOS ---");

        for (Producto producto : dao.listar()) {
            System.out.println(
                    "ID: " + producto.getId()
                            + " | Nombre: " + producto.getNombre()
                            + " | Cantidad: " + producto.getCantidad()
            );
        }

        // Actualizar producto
        Producto productoActualizar = new Producto(1, "Laptop actualizada", 20);

        if (dao.actualizar(productoActualizar)) {
            System.out.println("\nProducto actualizado correctamente.");
        }

        // Eliminar producto
        if (dao.eliminar(2)) {
            System.out.println("Producto eliminado correctamente.");
        }

        // Listar nuevamente
        System.out.println("\n--- LISTA FINAL ---");

        for (Producto producto : dao.listar()) {
            System.out.println(
                    "ID: " + producto.getId()
                            + " | Nombre: " + producto.getNombre()
                            + " | Cantidad: " + producto.getCantidad()
            );
        }
    }
}
