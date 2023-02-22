import java.util.ArrayList;
import java.util.Scanner;

public class Enlazador {
    LectorDoc lector = new LectorDoc();
    Vista view = new Vista();
    Scanner input = new Scanner(System.in);
    public void starter()
    {
        int opcion2 = 1;
        while(opcion2 != 2)
            {
                opcion2 = view.menu();
                switch(opcion2)
                {
                    case 1:
                    Convertidor traductor = new Convertidor();
                    System.out.println("¿Qué tipo de pila deseas usar para resolver las operaciones?");
                    System.out.println("1. Forma Vector");
                    System.out.println("2. Forma SinglyLinkedList");
                    System.out.println("3. Forma DoublyLinkedList");
                    System.out.println("4. Forma ArrayList");
                    String k = input.next();
                    FunStack<Double> stack = Factory.createStack(k);
                    Calcu calcu = Calcu.getInstance(stack);
                    ArrayList<ArrayList<String>> linea = lector.read("datos.txt");
                    for (int index = 0; index < linea.size(); index++) {
                        ArrayList<String> caracteres = linea.get(index);
                        String infix = "";
                        for (int i = 0; i < caracteres.size(); i++) {
                            infix = caracteres.get(i) + 1;
                        }
                        String postfix = traductor.Traductor(infix);
                        System.out.println("\n Operación modo infix: " + infix); 
                        System.out.println("\n Operación modo postfix: " + postfix + "\n"); 
                        double datos = calcu.calcular(postfix);
                    System.out.println(" El resultado de la ecuación es: " + datos ); 
                        
                        
                    }
                    break;
                    case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                    default:
                    System.out.println("Ingresa una opción válida");
                }
            }
    
    }
}
