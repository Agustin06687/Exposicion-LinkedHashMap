
package ejemplolinkedhasmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class EjemploLinkedHasMap {
    public static void main(String[] args) {
        
        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();
        mapa.put("Juan", 25);
        mapa.put("Maria", 30);
        mapa.put("Pedro", 20);
        mapa.put("Ana", 28);
        
        
        System.out.println("Elementos del LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        System.out.println("\nEdad de Maria: " + mapa.get("Maria"));
        
        mapa.remove("Pedro");
        
        System.out.println("\nDespues de eliminar a Pedro:");
        
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}




