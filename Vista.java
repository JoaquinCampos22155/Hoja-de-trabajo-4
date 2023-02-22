import java.util.Scanner;

public class Vista {
    
    /** 
     * @return int
     */
    public int menu()
    {
        Scanner op = new Scanner(System.in);
        int opcion;
        System.out.println("¿Qué deseas hacer?\n1. Calcular\n2. Salir");
        opcion = op.nextInt(); 
        return opcion;
    }       
}


