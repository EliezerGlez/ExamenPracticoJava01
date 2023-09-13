package examen.practico.java_01.ejercicio_04;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String categoria;
    private int anyo;
    private double precio;

    public Libro(String isbn, String titulo, String autor, String categoria, int anyo, double precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.anyo = anyo;
        this.precio = precio;
    }

    // Getters y setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + "\nTítulo: " + titulo + "\nAutor: " + autor +
                "\nCategoría: " + categoria + "\nAño: " + anyo + "\nPrecio: " + precio + "€";
    }
}
