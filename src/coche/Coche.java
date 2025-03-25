package coche;

/**
 * Clase que representa un coche con funcionalidades de compra y venta.
 * 
 * @author Barroso
 * @version 1.0, 21-03-2025
 */
public class Coche {

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /**
     * Constructor por defecto de la clase Coche.
     */
    public Coche() {
    }

    /**
     * Constructor con parámetros para inicializar las propiedades del coche.
     * 
     * @param nom Nombre del coche.
     * @param precio Precio del coche.
     * @param stock Stock inicial del coche.
     */
    public Coche(String nom, double precio, int stock) {
        this.nombre = nom;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Asigna un nombre al coche.
     * 
     * @param nom Nombre del coche.
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Obtiene el nombre del coche.
     * 
     * @return Nombre del coche.
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Obtiene el stock disponible del coche.
     * 
     * @return Stock actual del coche.
     */
    public int obtenerStock() {
        return getStock();
    }

    /**
     * Compra una cantidad determinada de coches y actualiza el stock.
     * 
     * @param cantidad Cantidad de coches a comprar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede comprar un nº negativo de coches");
        }
        setStock(getStock() + cantidad);
    }

    /**
     * Vende una cantidad determinada de coches y actualiza el stock.
     * 
     * @param cantidad Cantidad de coches a vender.
     * @throws Exception Si la cantidad es negativa o no hay stock suficiente.
     */
    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede vender una cantidad negativa de coches");
        }
        if (obtenerStock() < cantidad) {
            throw new Exception("No hay suficientes coches para vender");
        }
        setStock(getStock() - cantidad);
    }

    /**
     * Obtiene el nombre del coche.
     * 
     * @return Nombre del coche.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del coche.
     * 
     * @param nombre Nombre del coche.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del coche.
     * 
     * @return Precio del coche.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del coche.
     * 
     * @param precio Precio del coche.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el precio con IVA del coche.
     * 
     * @return Precio con IVA del coche.
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Establece el precio con IVA del coche.
     * 
     * @param precioIVA Precio con IVA del coche.
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Obtiene el stock disponible del coche.
     * 
     * @return Stock disponible del coche.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece el stock del coche.
     * 
     * @param stock Nuevo stock del coche.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
