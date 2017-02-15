package singleton;
import singleton.Singleton;

public class Main {
    
    public static void main(String[] args) {
       
        Singleton daniel= Singleton.getSingle("Daniel");
        Singleton felipe= Singleton.getSingle("Felipe");
        Singleton nicolas= Singleton.getSingle("Nicolas");
        
        System.out.println( daniel.getMiNombre() + " , " + felipe.getMiNombre() + " , " + nicolas.getMiNombre());
    }
}
