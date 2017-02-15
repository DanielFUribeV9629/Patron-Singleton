package singleton;

public class Singleton {
    
    private String miNombre;
    private static Singleton single;
    
    
    private Singleton(String miNombre){
        this.miNombre= miNombre;
        System.out.println("Nombre: " + this.miNombre);
    }
    
    public static Singleton getSingle(String miNombre) {
        if (single == null) {
            single = new Singleton(miNombre);
        }
        else{
            System.out.println("Objeto imposible de crear, ya existe uno !!");
        }
        return single;
    }
    
    public String getMiNombre() {
        return miNombre;
    }
    
    public void setMiNombre(String miNombre) {
        this.miNombre = miNombre;
    }
    }  
    
