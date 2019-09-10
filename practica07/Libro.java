/**
 * La clase Libro que nos da la informacion de un libro (titulo, autor, anio de publicacion) y que tambien nos permite cambiarla.
 * @autor Berenice Calvario Gonzalez
 * @version 10 de septiembre de 2019
 */

 public class Libro{
    protected String titulo;
    protected String autor;
    protected int anioDePublicacion;


    /**
     * Cosntructor default.
     */
    public Libro(){
        titulo = "";
        autor = "";
        anioDePublicacion = 0;
    }

    /**
     * 
     */
    public Libro(String titulo, String autor, int anioDePublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioDePublicacion = anioDePublicacion;
    }

    /**
     * Asigna un nuevo titulo
     * @param titulo el nuevo titulo
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    /**
     * Regresa la editorial
     * @return titulo
     */
    public String getTitulo(){
        return this.titulo;
    }

    /**
     * Asigna un nuevo autor
     * @param autor el nuevo autor
     */
    public void setAutor(String autor){
        this.autor = autor;
    }

    /**
     * Regresa el autor
     * @return autor
     */
    public String getAutor(){
        return this.autor;
    }

    /**
     * Asigna un nuevo anio de publicacion
     * @param anioDePublicacion
     */
    public void setAniodepublicacion(int anioDePublicacion){
        this.anioDePublicacion = anioDePublicacion;
    }

    /**
     * Regresa el anio de publicacion
     * @return anioDePublicacion
     */
    public int getAnioDePublicacion(){
        return this.anioDePublicacion;
    }
 }